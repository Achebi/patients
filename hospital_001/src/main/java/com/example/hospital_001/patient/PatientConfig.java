package com.example.hospital_001.patient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PatientConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            PatientRepository repository) {
        return args -> {
        };
    }
}