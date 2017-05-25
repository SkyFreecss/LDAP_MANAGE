package com.cn.ldap.entity;

/**
 * Created by wejeh on 2017/5/18.
 */
public class LdapProp {
        private String LdapConfig_IP;   //ldap配置文件主机IP
        private String LdapConfig_PORT;//ldap配置文件端口号
        private String LdapConfig_BASEDNS;//ldap配置文件基本dns
        private String LdapAdmin;//ldap配置文件管理员
        private String LdapAdmin_PWD;//ldap配置文件管理员密码

    public String getLdapConfig_IP() {
        return LdapConfig_IP;
    }

    public void setLdapConfig_IP(String ldapConfig_IP) {
        LdapConfig_IP = ldapConfig_IP;
    }

    public String getLdapConfig_PORT() {
        return LdapConfig_PORT;
    }

    public void setLdapConfig_PORT(String ldapConfig_PORT) {
        LdapConfig_PORT = ldapConfig_PORT;
    }

    public String getLdapConfig_BASEDNS() {
        return LdapConfig_BASEDNS;
    }

    public void setLdapConfig_BASEDNS(String ldapConfig_BASEDNS) {
        LdapConfig_BASEDNS = ldapConfig_BASEDNS;
    }

    public String getLdapAdmin() {
        return LdapAdmin;
    }

    public void setLdapAdmin(String ldapAdmin) {
        LdapAdmin = ldapAdmin;
    }

    public String getLdapAdmin_PWD() {
        return LdapAdmin_PWD;
    }

    public void setLdapAdmin_PWD(String ldapAdmin_PWD) {
        LdapAdmin_PWD = ldapAdmin_PWD;
    }
}
