package com.jspiders.ums1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/*@SpringBootApplication
public class Ums1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ums1Application.class, args);
	}
}*/
@SpringBootApplication
public class Ums1Application extends SpringBootServletInitializer
{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(Ums1Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Ums1Application.class, args);
	}
}
