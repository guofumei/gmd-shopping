package com.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.springcloud.dao")
@SpringBootApplication
public class SpringCloudOrdersProvider {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringCloudOrdersProvider.class, args);

	}

}
