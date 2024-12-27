package com.cn.employeesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmployeesystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeesystemApplication.class, args);
    }

}
