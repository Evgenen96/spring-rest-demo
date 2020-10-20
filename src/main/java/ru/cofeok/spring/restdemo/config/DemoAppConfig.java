package ru.cofeok.spring.restdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("ru.cofeok.spring.restdemo")
public class DemoAppConfig {
}
