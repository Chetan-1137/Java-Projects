package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan("com")
public class BankmangementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankmangementsystemApplication.class, args);
		
	}

}
