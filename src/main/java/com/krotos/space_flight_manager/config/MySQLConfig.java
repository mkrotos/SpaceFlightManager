package com.krotos.space_flight_manager.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource("mysql.properties")
@ConditionalOnClass(DataSource.class)
public class MySQLConfig {

    @Bean
    public DataSource dataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName(databaseDriver);
        dataSource.setUrl(databaseUrl+databaseUrlOptions);
        dataSource.setUsername(databaseUser);
        dataSource.setPassword(databasePassword);

        return dataSource;
    }


    @Value("${database.url}")
    private String databaseUrl;

    @Value("${database.url.options}")
    private String databaseUrlOptions;

    @Value("${database.driver}")
    private String databaseDriver;

    @Value("${database.user}")
    private String databaseUser;

    @Value("${database.password}")
    private String databasePassword;
}
