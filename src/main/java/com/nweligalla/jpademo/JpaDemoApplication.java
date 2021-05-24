package com.nweligalla.jpademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    //add data through commanad line to database
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student maria = new Student("maria", "jones", "maria@gmail.com", 21);
            studentRepository.save(maria);
        };
    }

}
