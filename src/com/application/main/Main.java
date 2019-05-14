package com.application.main;

import com.application.model.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Employee employee =   context.getBean("employee", Employee.class);
        System.out.println("------------------------------");
        String[] studentsArray = employee.getNamesArray();
        for(String students :studentsArray){
          System.out.println(students);
        }
        System.out.println("------------------------------");
        List<String> employeeList = employee.getNamesList();
        for (String employeelist : employeeList){
            System.out.println(employeelist);
        }
        System.out.println("------------------------------");
        Set<Integer> employeeSet = employee.getNamesSet();
        for (Integer employeeset :employeeSet){
            System.out.println(employeeset);
        }
        context.close();

    }
}
