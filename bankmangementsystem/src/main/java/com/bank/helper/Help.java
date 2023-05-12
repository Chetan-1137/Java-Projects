package com.bank.helper;


import java.time.LocalDateTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Help {
	@Before("execution(* com.bank.controller.Manager_controller.getAlldetail_manager())")
	public void check_Authorization() {
		System.out.println("user is Authorized"+LocalDateTime.now());
	}
	
	@After("execution(* com.bank.controller.Manager_controller.getAlldetail_manager())")
	public void check_Authorization_() {
		System.out.println("user is Authorized"+LocalDateTime.now());
	}

}
