package com.example.projectsforfun.firstproject;

import com.example.projectsforfun.firstproject.dao.StudentDAO;
import com.example.projectsforfun.firstproject.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"sf",
		"com.example.projectsforfun.firstproject"})
public class FirstprojectApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstprojectApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String... x){

         return null;
	}

	@Bean
	public CommandLineRunner commandLineRunnerx(StudentDAO studentDAO){

		return runner ->{


			 studentDAO.saveStudent(createStudent());
			// studentDAO.removeStudent(1);
 		//	studentDAO.updateStudentByFirstName("Ali","Mohamed");

			//System.out.println(studentDAO.findStudentByFirstName("bHMMED"));

//			System.out.println(studentDAO.readAll().get(0));
			//studentDAO.saveStudent(createStudent());
			System.out.println("read Student");
		};

	}

	private Student createStudent(){

		return new Student("bHMMED","Bader","loal@om.com");

	};
	private Student readStudent(){

		return new Student("AHMMED","Bader","loal@om.com");

	};

}

