package com.cn.ldap.service.impl;

import com.cn.ldap.entity.Ldap;
import com.cn.ldap.service.LdapConfigService;
import com.cn.ldap.service.LdapLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by wejeh on 2017/5/17.
 * ldap登陆实现类
 */
@Service()
public class LdapLoginServiceImpl implements LdapLoginService {
        private Logger logger = Logger.getLogger("LdapLoginService.class");

        @Resource
        private LdapConfigService ldapConfigService;

        private static DirContext ctx;
        public String getLoginContext(String username,String password)
        {
            Hashtable ht = new Hashtable();
            Map<String,String> ldapmap = ldapConfigService.getLdapPropertiesKey();
            Ldap ldap = new Ldap();
            ldap.setLDAP_URL("ldap://"+ldapmap.get("LdapConfig_IP")+":"+ldapmap.get("LdapConfig_PORT"));
            ldap.setLDAP_PRINCIPAL("cn="+username+","+ldapmap.get("LdapConfig_BASEDNS"));
            ht.put(Context.SECURITY_AUTHENTICATION,"simple");
            ht.put(Context.SECURITY_CREDENTIALS,password);
            ht.put(Context.SECURITY_PRINCIPAL,ldap.getLDAP_PRINCIPAL());
            ht.put(Context.PROVIDER_URL,ldap.getLDAP_URL());
            ht.put(Context.INITIAL_CONTEXT_FACTORY,ldap.getLDAP_FACTORY());

            try {
                ctx = new InitialDirContext(ht);
            }catch(NamingException e)
            {
                return "认证失败！";
            }catch (Exception e)
            {
                return "认证出错！";
            }

            return "LDAP认证成功!";
        }
}
