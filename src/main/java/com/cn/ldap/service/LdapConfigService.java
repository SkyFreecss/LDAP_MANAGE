package com.cn.ldap.service;

import java.util.Map;

/**
 * Created by wejeh on 2017/5/18.
 * Ldap配置文件接口
 */
public interface LdapConfigService {
        void writeAndupdateProperties(String LdapConfig_IP,String ipvalue,String LdapConfig_PORT,String portvalue,String LdapConfig_BASEDNS,String dnsvalue,String LdapAdmin,String adminvalue,String LdapAdmin_PWD,String adminpwdvalue);
        Map<String,String> getLdapPropertiesKey(String LdapConfig_IP,String LdapConfig_PORT,String LdapConfig_BASEDNS,String LdapAdmin,String LdapAdmin_PWD);
}
