package mb.springboot.autoconfig;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @Author mabo
 * @Date 2022/8/5 19:46
 */
//@Configuration
//Spring中的@Configuration注解和SpringBoot中的@SpringBootConfiguration注解经过测试可以起到相同的作用
@SpringBootConfiguration
public class DataSourceAutoConfiguration {
    @Resource
    private DataSourceProperties dataSourceProperties;

    //@Bean等同于<bean id="createDataSource" class="javax.sql.DataSource"/>
    @Bean
    @ConditionalOnProperty(value = "spring.jdbc.datasource.type",havingValue = "druid")
    public DataSource createDataSource() {
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        dataSource.setUrl(dataSourceProperties.getUrl());
        dataSource.setUsername(dataSourceProperties.getUsername());
        dataSource.setPassword(dataSourceProperties.getPassword());

        return dataSource;
    }

    @Bean
    @ConditionalOnProperty(value = "spring.jdbc.datasource.type", havingValue = "c3p0")
    public DataSource createC3P0DataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setDriverClass(dataSourceProperties.getDriverClassName());
        dataSource.setJdbcUrl(dataSourceProperties.getUrl());
        dataSource.setUser(dataSourceProperties.getUsername());
        dataSource.setPassword(dataSourceProperties.getPassword());

        return dataSource;
    }
}
