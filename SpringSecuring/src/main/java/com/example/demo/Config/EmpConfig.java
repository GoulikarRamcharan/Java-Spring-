package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class EmpConfig {

	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {
		
		UserDetails ram = User.builder()
						  .username("ram")
						  .password("{noop}ram@123")
						  .roles("EMPLOYEE","MANAGER")
						  .build();
		
		UserDetails raj = User.builder()
						  .username("raj")
						  .password("{noop}raj@123")
						  .roles("EMPLOYEE","MANAGER")
						  .build();
		
		UserDetails vinay = User.builder()
							.username("vinay")
							.password("{noop}vinay@123")
							.roles("EMPLOYEE","MANAGER","ADMIN")
							.build();
		
		return new InMemoryUserDetailsManager(ram,raj,vinay);
	}
	
	@Bean
	public SecurityFilterChain filterchain(HttpSecurity http) throws Exception{
		
		http.authorizeHttpRequests(config -> config
				.requestMatchers(HttpMethod.GET,"/api/employees").hasRole("EMPLOYEE")
				.requestMatchers(HttpMethod.GET,"/api/employees/**").hasRole("EMPLOYEE")
				.requestMatchers(HttpMethod.GET,"/api/employees/dept/**").hasRole("EMPLOYEE")
				.requestMatchers(HttpMethod.GET,"/api/employees/sal/**").hasRole("EMPLOYEE")
				.requestMatchers(HttpMethod.POST,"/api/employees").hasRole("MANAGER")
				.requestMatchers(HttpMethod.PUT,"/api/employees").hasRole("MANAGER")
				.requestMatchers(HttpMethod.DELETE,"/api/employees/**").hasRole("ADMIN")			
				);
		
		http.httpBasic(Customizer.withDefaults());
		
		http.csrf(csrf -> csrf.disable());
		
		return http.build();
	}
}
