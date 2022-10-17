package com.saran.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.saran")
public class SaranConfig {
	    @Bean
	    public ViewResolver viewResolver() {
	    	InternalResourceViewResolver i=new InternalResourceViewResolver();
	    	i.setViewClass(JstlView.class);
	    	i.setPrefix("/WEB-INF/views/");
	    	i.setSuffix(".jsp");
	    	
	    	return i;
	    	
	    	
	    }
	
	

}
