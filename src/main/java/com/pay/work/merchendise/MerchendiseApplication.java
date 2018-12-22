package com.pay.work.merchendise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MerchendiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchendiseApplication.class, args);
	}
}
