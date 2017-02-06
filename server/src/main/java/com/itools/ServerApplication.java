package com.itools;

import com.itools.util.UrlShortener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		String url = "google.com";
		for (int i = 0; i < 10; i++) {
			System.out.println(UrlShortener.generateLink());
		}
		SpringApplication.run(ServerApplication.class, args);
	}
}
