package com.cn.ldap.service.impl;

import com.cn.ldap.service.LdapLoginService;
import org.springframework.stereotype.Service;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;
import java.util.logging.Logger;

/**
 * Created by wejeh on 2017/5/17.
 * ldap登陆实现类
 */
@Service()
public class LdapLoginServiceImpl implements LdapLoginService {
        private Logger logger = Logger.getLogger("LdapLoginService.class");
        private static DirContext ctx;
        public String getLoginContext(String username,String password,String LDAP_URL,String LDAP_PRINCIPAL,String LDAP_FACTORY)
        {
            Hashtable ht = new Hashtable();
            ht.put(Context.SECURITY_AUTHENTICATION,"simple");
            ht.put(Context.SECURITY_CREDENTIALS,password);
            ht.put(Context.SECURITY_PRINCIPAL,LDAP_PRINCIPAL);
            ht.put(Context.PROVIDER_URL,LDAP_URL);
            ht.put(Context.INITIAL_CONTEXT_FACTORY,LDAP_FACTORY);

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
