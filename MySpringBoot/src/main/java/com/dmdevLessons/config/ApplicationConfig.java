package com.dmdevLessons.config;

import com.dmdevLessons.conditional.FirstConditional;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class ApplicationConfig {

    @PostConstruct
    public  void init(){
        log.warn("!!!!OLOLOLOLOLO SASAMBA!!!");
    }
}
