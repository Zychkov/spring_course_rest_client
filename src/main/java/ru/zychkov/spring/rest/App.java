package ru.zychkov.spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zychkov.spring.rest.configuration.MyConfig;
import ru.zychkov.spring.rest.entity.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//
//        System.out.println(allEmployees);

/*        Employee empById = communication.getEmployee(1);
        System.out.println(empById);*/

/*        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1200);
        employee.setId(10);
        communication.saveEmployee(employee);*/

        communication.deleteEmployee(10);
    }
}
