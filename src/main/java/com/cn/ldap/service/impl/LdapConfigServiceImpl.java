package com.cn.ldap.service.impl;

import com.cn.ldap.service.LdapConfigService;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Created by wejeh on 2017/5/18.
 * Ldap配置文件实现类
 */
@Service
public class LdapConfigServiceImpl implements LdapConfigService{

        private static Logger logger = Logger.getLogger("LdapConfigServiceImpl.class");

        private static Properties props = new Properties();

        private static String ldapfilepath="/WEB-INF/resources/ldap.properties";

        static{
            try {
                props.load(new FileInputStream(ldapfilepath));
            }catch (FileNotFoundException e)
            {
                e.printStackTrace();
                logger.info("没有找到LDAP配置文件！");
            }catch (IOException e)
            {
                logger.info("LDAP配置文件读取错误！");
            }
            logger.info("LDAP配置文件读取成功！");
        }

        public void writeAndupdateProperties(String LdapConfig_IP,String ipvalue,String LdapConfig_PORT,String portvalue,String LdapConfig_BASEDNS,String dnsvalue,String LdapAdmin,String adminvalue,String LdapAdmin_PWD,String adminpwdvalue)
        {
            try {
                OutputStream os = new FileOutputStream(ldapfilepath);
                props.setProperty(LdapConfig_IP,ipvalue);
                props.store(os,"LDAPCONFIG_IP'"+LdapConfig_IP+"'VALUE");
                props.setProperty(LdapConfig_PORT,portvalue);
                props.store(os,"LDAPCONFIG_PORT'"+LdapConfig_PORT+"'VALUE");
                props.setProperty(LdapConfig_BASEDNS,dnsvalue);
                props.store(os,"LDAPCONFIG_DNS'"+LdapConfig_BASEDNS+"'VALUE");
                props.setProperty(LdapAdmin,adminvalue);
                props.store(os,"LDAPCONFIG_ADMIN'"+LdapAdmin+"'VALUE");
                props.setProperty(LdapAdmin_PWD,adminpwdvalue);
                props.store(os,"LDAPCONFIG_ADMIN_PWD'"+LdapAdmin_PWD+"'VALUE");
            }catch (IOException e)
            {
                logger.info("LDAP配置文件更新或写入错误！");
            }
            logger.info("LDAP配置文件更新或写入成功！");
        }

        public Map<String,String> getLdapPropertiesKey(String LdapConfig_IP,String LdapConfig_PORT,String LdapConfig_BASEDNS,String LdapAdmin,String LdapAdmin_PWD)
        {
            Map<String,String> ldapmap = new HashMap<String, String>();
            ldapmap.put(LdapConfig_IP,props.getProperty(LdapConfig_IP));//获取ldap配置文件的ip
            ldapmap.put(LdapConfig_PORT,props.getProperty(LdapConfig_PORT));//获取ldap配置文件的端口号
            ldapmap.put(LdapConfig_BASEDNS,props.getProperty(LdapConfig_BASEDNS));//获取ldap配置文件的dns
            ldapmap.put(LdapAdmin,props.getProperty(LdapAdmin));//获取ldap配置文件的管理员账号
            ldapmap.put(LdapAdmin_PWD,props.getProperty(LdapAdmin_PWD));//获取ldap配置文件的管理员密码

            //返回配置文件map集合
            return ldapmap;
        }
}
