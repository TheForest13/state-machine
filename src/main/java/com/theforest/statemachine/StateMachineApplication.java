package com.theforest.statemachine;

import com.theforest.statemachine.launch.Launcher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StateMachineApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(StateMachineApplication.class, args);
        Launcher launcher = run.getBean("launcher", Launcher.class);
        launcher.launch();
    }

}
