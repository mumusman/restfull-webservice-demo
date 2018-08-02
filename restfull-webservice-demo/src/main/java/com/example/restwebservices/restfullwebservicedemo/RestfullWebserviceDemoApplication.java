package com.example.restwebservices.restfullwebservicedemo;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class RestfullWebserviceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullWebserviceDemoApplication.class, args);
	}
	
	
	@Bean
	public LocaleResolver localeResolver()
	{
		SessionLocaleResolver localresolver = new SessionLocaleResolver();
		localresolver.setDefaultLocale(Locale.US);
		return localresolver;
	}
	
	
	// you can configer this in application.properties by using spring.message.basename="name of property file"
//	@Bean
//	@Primary
//	public ResourceBundleMessageSource bundleMessageSources()
//	{
//		ResourceBundleMessageSource resourceBundleMessageSource=new ResourceBundleMessageSource();
//		resourceBundleMessageSource.setBasename("messages");
//		return resourceBundleMessageSource;
//	}
}
