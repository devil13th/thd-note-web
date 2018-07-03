package com.thd;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
@SpringBootApplication
//@PropertySource(value={"classpath:config/application.properties","classpath:config/db.properties"},encoding="utf-8") 

public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}

	
	public static void main(String[] args) {
	    SpringApplication.run(Application.class, args);
	}
}
