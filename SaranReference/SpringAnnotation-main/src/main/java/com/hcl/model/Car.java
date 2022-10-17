package com.hcl.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
 * @Component registering this bean to a spring container. Its only for class level
 * @Bean registering this bean to a spring container. Its only for member level
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Car {
	
	private String brandName="BMW";

}
