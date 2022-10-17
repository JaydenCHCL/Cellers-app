package com.hcl;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.hcl.config.EmpConfig;
import com.hcl.config.SprotsConfig;
import com.hcl.config.VehicleConfig;
import com.hcl.model.Emp;
import com.hcl.model.Generic;
import com.hcl.model.Vehicle;


//
@ComponentScan("com.hcl")
public class App 
{
    public static void main( String[] args )
    {
      /*  AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(EmpConfig.class);
        ctx.refresh();
        Emp ee=(Emp)ctx.getBean("employee");
        System.out.println(ee.getEmpId());
        System.out.println(ee.getEmpName());
        System.out.println(ee.getEmpSal());*/
        
     /*   AnnotationConfigApplicationContext ctx1=new AnnotationConfigApplicationContext();
        ctx1.register(VehicleConfig.class);
        ctx1.refresh(); 
        Vehicle v=(Vehicle)ctx1.getBean("veh");
       
        System.out.println(v);
        */
        
        AnnotationConfigApplicationContext ctx1=new AnnotationConfigApplicationContext();
        ctx1.register(SprotsConfig.class);
        ctx1.refresh(); 
        Generic v=(Generic)ctx1.getBean("gen");
       
        v.showCar();
        
    }
}
