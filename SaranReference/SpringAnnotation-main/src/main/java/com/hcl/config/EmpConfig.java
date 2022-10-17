package com.hcl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hcl.model.Emp;

@Configuration //will replace spring.xml
public class EmpConfig {
	
    @Bean(name="employee")  //getBean("id")
	public Emp getEmp() {
		Emp e1=new Emp();
		e1.setEmpId(111);
		e1.setEmpName("Margret");
		e1.setEmpSal(1234);
		return e1;

	}

}
