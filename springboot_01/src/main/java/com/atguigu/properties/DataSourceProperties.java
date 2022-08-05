package com.atguigu.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author mabo
 * @Date 2022/8/4 11:13
 */

/*
    将配置属性批量注入到bean对象有两种解决方案
        1、 @Component + @ConfigurationProperties(prefix="")，不用@EnableConfigurationProperties
        2、 @EnableConfigurationProperties(被@ConfigurationProperties标注的类名.class) + @ConfigurationProperties(prefix="")，不用@Component
 */
/*@Component
@ConfigurationProperties(prefix = "spring.jdbc.datasource")*/
@ConfigurationProperties(prefix = "spring.jdbc.datasource")
public class DataSourceProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "DataSourceProperties{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
