package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;


@Configuration
public class SecurityConfig {

	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {
		
		UserDetails jhon = User.builder()
				.username("jhon")
				.password("{noop}test123")
				.roles("EMPLOYEE")
				.build();
		
		UserDetails ram = User.builder()
				.username("ram")
				.password("{noop}ram123")
				.roles("EMPLOYEE","MANAGER")
				.build();
		UserDetails sher = User.builder()
				.username("sher")
				.password("{noop}sher123")
				.roles("EMPLOYEE","MANAGER","ADMIN")
				.build();
		
		
		
		return new InMemoryUserDetailsManager(jhon,ram,sher);
		
	}
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	http.authorizeHttpRequests(configurer ->
	configurer
	.requestMatchers(HttpMethod.GET,"/api/emps").hasRole("EMPLOYEE")
	.requestMatchers(HttpMethod.GET,"/api/emps/**").hasRole("EMPLOYEE")
	.requestMatchers(HttpMethod.POST,"/api/emps").hasRole("MANAGER")
	.requestMatchers(HttpMethod.PUT,"/api/emps").hasRole("MANAGER")
	.requestMatchers(HttpMethod.DELETE, "/api/emps/**").hasRole("ADMIN"));
	// use HTTP Basic authentication
	http.httpBasic(Customizer.withDefaults());
	// disable Cross Site Request Forgery (CSRF)
	http.csrf(csrf -> csrf.disable());
	return http.build();
}
	
}
