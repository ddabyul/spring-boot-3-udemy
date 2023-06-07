package com.in28minutes.learnspringframework.example.a1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {



	public static void main(String[] args) {

		try (var context =
					 new AnnotationConfigApplicationContext
							 (DepInjectionLauncherApplication.class)){

			Arrays.stream(context.getBeanDefinitionNames())
					.forEach(System.out::println);
		}
	}

}
