package com.knf.demo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.knf.demo.controller.EmployeeController;

@Component
public class JerseyConfiguration
         extends ResourceConfig {
	public JerseyConfiguration() {
		register(EmployeeController.class);
	}
}
