package com.cn.ldap.controller;

import com.cn.ldap.entity.Ldap;
import com.cn.ldap.service.LdapLoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.naming.directory.DirContext;

/**
 * Created by wejeh on 2017/5/15.
 */
@Controller
public class LdapLogin {
        private static DirContext ctx;
        Ldap ldap = new Ldap();


        @Resource
        private LdapLoginService ldapLoginService;

        @RequestMapping("/ldaplogin")
        public String getLoginContext(@RequestParam("username") String username, @RequestParam("password") String password, Model model)
        {
                ldap.setUsername(username);
                ldap.setPassword(password);
                ldap.setLDAP_PRINCIPAL("cn="+ldap.getUsername()/*+",dc=example,dc=com"*/);
                String result = ldapLoginService.getLoginContext(ldap.getUsername(),ldap.getPassword());
                if(result=="LDAP认证成功!") {
                    return "WEB-INF/jsp/home";
                }
                else {
                    return result;
                }
        }
}
