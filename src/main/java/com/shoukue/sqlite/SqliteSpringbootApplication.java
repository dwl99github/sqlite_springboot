package com.shoukue.sqlite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.shoukue.sqlite.mapper")
public class SqliteSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqliteSpringbootApplication.class, args);
    }

}
