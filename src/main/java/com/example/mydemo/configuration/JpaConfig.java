package com.example.mydemo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

@Configuration
@EnableJpaRepositories("com.example.mydemo.repository")
public class JpaConfig {
}
