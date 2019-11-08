package com.itmuch.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Scanner;

@SpringBootApplication
public class MicroserviceProviderUserApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String port = scanner.nextLine();
		/*SpringApplication.run(MicroserviceProviderUserApplication.class, args);*/
		new SpringApplicationBuilder(MicroserviceProviderUserApplication.class)
				.properties("server.port="+port).run(args);
	}

}
