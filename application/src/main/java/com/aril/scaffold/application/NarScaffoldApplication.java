package com.aril.scaffold.application;

import com.aril.scaffold.infra.InfraAppConfig;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@OpenAPIDefinition(
        info = @Info(
                title = "NAR-HEXA-SCAFFOLD MODULE API DOC",
                version = "1.0"))
@SpringBootApplication
@Import(InfraAppConfig.class)
public class NarScaffoldApplication {

    public static void main(String[] args) {
        SpringApplication.run(NarScaffoldApplication.class, args);
    }
}
