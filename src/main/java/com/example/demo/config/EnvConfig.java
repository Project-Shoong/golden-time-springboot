package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySource("file:D:/workspace/spring/golden-time-springboot/config.env")
public class EnvConfig {}
