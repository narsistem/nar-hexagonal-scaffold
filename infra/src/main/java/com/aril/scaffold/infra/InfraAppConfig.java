package com.aril.scaffold.infra;

import com.aril.scaffold.domain.core.DomainComponent;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@EnableAutoConfiguration
@SpringBootConfiguration
@ComponentScan(basePackages = {"com.aril.scaffold.infra", "com.aril.scaffold.domain"},
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = DomainComponent.class))
public class InfraAppConfig {
}
