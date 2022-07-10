package com.xirm.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author huzj
 */
@EnableTransactionManagement
@SpringBootApplication
public class SpringTransactionalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTransactionalApplication.class, args);
    }

}
