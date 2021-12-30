package com.demo.obsidian;

import com.carfey.ops.job.di.SpringSchedulerStarter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ObsidianApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObsidianApplication.class, args);
	}


	@Bean
	public SpringSchedulerStarter getSpringSchedulerStarter() {
		return new SpringSchedulerStarter();
	}


}
