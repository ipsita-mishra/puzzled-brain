package com.web.webber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	// private String fp = "/opt/tomcat/temp/flag.txt";
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		try {
			System.setProperty("f2", "flag{webber_springbeans_rce}");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return application.sources(WebberApplication.class);
	}
	// protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	// 	try {
	// 		System.setProperty("f2", readFile(new File(fp)));
	// 	} catch (IOException e) {
	// 		e.printStackTrace();
	// 	}
	// 	return application.sources(WebberApplication.class);
	// }

	private String readFile(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (InputStream in = new FileInputStream(file)) {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
 
			String line;
			while ((line = br.readLine()) != null) {
			    sb.append(line + System.lineSeparator());
			}
		}
        return sb.toString();
    }

}
