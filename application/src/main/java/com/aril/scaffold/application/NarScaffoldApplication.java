package com.aril.scaffold.application;

import com.aril.scaffold.infra.InfraAppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(InfraAppConfig.class)
public class NarScaffoldApplication {

    public static void main(String[] args) {
        SpringApplication.run(NarScaffoldApplication.class, args);
    }
}
