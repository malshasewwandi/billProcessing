package com.example.billprocesing.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.billprocesing.proxy")
public class ProjectConfig {
}
