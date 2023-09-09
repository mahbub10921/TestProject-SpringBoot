package com.TestProject;

import com.TestProject.Model.Address;
import com.TestProject.Model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
//		Employee employee1 = new Employee(, "Nazrul","nazrul@gmail.com");
//		System.out.println(employee1);

		System.out.println("Run Successfully");
	}

}
