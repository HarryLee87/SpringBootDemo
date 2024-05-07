package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.awt.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configurable
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student harry = new Student(
                    "Harry",
                    "harry@gmail.com",
                    LocalDate.of(1987, Month.MAY, 6),
                    39
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.MAY, 6),
                    21
            );

            repository.saveAll(List.of(harry, alex));
        };
    }
}
