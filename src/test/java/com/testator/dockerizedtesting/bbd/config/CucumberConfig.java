package com.testator.dockerizedtesting.bbd.config;

import com.testator.dockerizedtesting.DockerizedTestingApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = DockerizedTestingApplication.class)
@SpringBootTest
public class CucumberConfig {
}
