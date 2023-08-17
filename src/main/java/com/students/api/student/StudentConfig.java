package com.students.api.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JULY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student sara = new Student(
                    "Sara",
                    "sara@gmail.com",
                    LocalDate.of(2000, JULY, 9)

            );
            Student  alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2010, JULY, 9)

            );
            repository.saveAll(
                    List.of(sara,alex)
            );
        };
    }
}
