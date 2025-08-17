package com.yashu.joblisting;

import com.yashu.joblisting.controller.PostController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JoblistingApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(JoblistingApplication.class, args);
		PostController cont=context.getBean(PostController.class);

	}

}
