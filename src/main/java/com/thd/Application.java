package com.thd;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication(scanBasePackages = "com.thd")

//------------------  servlet filter listener -----------------//
//重点 Scanning for Servlets, Filters, and listeners
@ServletComponentScan


// ------------------  hibernate -----------------//
@EnableJpaRepositories
//扫描hibernate实体
@EntityScan(basePackages="com.thd")
//数据库事务
@EnableTransactionManagement

//------------------  配置文件 -----------------//
@PropertySource(value={"classpath:config/application.properties","classpath:config/db.properties"},encoding="utf-8") 

public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}

	
	public static void main(String[] args) {
	    SpringApplication.run(Application.class, args);
	}
}
