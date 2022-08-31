package com.web.webber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebberApplication extends SpringBootServletInitializer {
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebberApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(WebberApplication.class, args);
	}

}
