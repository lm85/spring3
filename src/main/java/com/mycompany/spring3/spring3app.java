/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author masic
 */

@SpringBootApplication
public class spring3app {
 
    public static void main(String[] args) {
        
    //Reading the Configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        
        //Get the LoverServiceImpl bean
        LoverServiceImpl loverServiceImpl = (LoverServiceImpl)context.getBean("LoverServiceImpl");
        

 //Create Lover object
        Lover lover = new Lover();
        lover.setAge(55);
        lover.setBoobs(3);
        lover.setName("JIP");
        
        //Save the new Lover
        loverServiceImpl.saveLover(lover);
        //Read the Lover 
        Lover emp = loverServiceImpl.getLoverById(1);
        //Retrieve all the Lovers
        List<Lover> loverList = loverServiceImpl.getAllLovers();
        System.out.println("*** List of all Lovers *** ");
        for(Lover emp1 : loverList)
        {
            System.out.println("Lover Id   :"+emp1.getId());
            System.out.println("Lover Name :"+emp1.getName());
            System.out.println("Lover Age  :"+emp1.getAge());
            System.out.println();
        }
        System.out.println("*************************************");
        
        //Delete Lover
        loverServiceImpl.deleteLover(1);
      
        
        context.close();
//SpringApplication.run(spring3app.class, args);
    
    }
}
