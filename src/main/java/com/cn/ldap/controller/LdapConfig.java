package com.cn.ldap.controller;

import com.cn.ldap.entity.LdapProp;
import com.cn.ldap.service.LdapConfigService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by wejeh on 2017/5/18.
 */
@Controller
public class LdapConfig {

        LdapProp lp = new LdapProp();

        @Resource
        private LdapConfigService ldapConfigService;


        @RequestMapping("/ldapconfig")
        public String getLdapConfig(@RequestParam String Ldap_IP,@RequestParam String Ldap_Port,@RequestParam String Ldap_Dns,@RequestParam String Ldap_Admin,@RequestParam String Ldap_Admin_Pwd)
        {
            //将获取到的ldap配置信息封装到实体类中
            lp.setLdapConfig_IP(Ldap_IP);
            lp.setLdapConfig_PORT(Ldap_Port);
            lp.setLdapConfig_BASEDNS(Ldap_Dns);
            lp.setLdapAdmin(Ldap_Admin);
            lp.setLdapAdmin_PWD(Ldap_Admin_Pwd);

            //写入或更新ldap配置文件
            ldapConfigService.writeAndupdateProperties("LdapConfig_IP",lp.getLdapConfig_IP(),"LdapConfig_PORT",lp.getLdapConfig_PORT(),"LdapConfig_BASEDNS",lp.getLdapConfig_BASEDNS(),"LdapAdmin",lp.getLdapAdmin(),"LdapAdmin_PWD",lp.getLdapAdmin_PWD());
            return "login";
        }

        @RequestMapping("/goldapconfig")
        public ModelAndView goldapconfig()
        {
            ModelAndView view = new ModelAndView("WEB-INF/jsp/LdapConfig");
            return view;
        }
}
