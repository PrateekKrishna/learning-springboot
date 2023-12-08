package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student prateek = new Student(
                    1L,
                    "Prateek",
                    "prateekkrishna09@gmail.com",
                    LocalDate.of(2000, 01, 01)
            );

            Student john = new Student(
                    "john",
                    "jogn@gmail.com",
                    LocalDate.of(2001, 01, 01)
            );

            repository.saveAll(
                    List.of(prateek, john)
            );
        };
    }
}
