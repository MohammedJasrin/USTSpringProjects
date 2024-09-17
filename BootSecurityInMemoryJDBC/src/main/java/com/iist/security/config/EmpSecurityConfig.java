package com.iist.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableMethodSecurity
public class EmpSecurityConfig {
	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.csrf(csrf -> csrf.disable()).authorizeHttpRequests((authorize) -> authorize.anyRequest().authenticated()).httpBasic(Customizer.withDefaults());

	
	return http.build();
	}
	@Bean
	InMemoryUserDetailsManager userDetailsService() {
		UserDetails userDetails=User.builder().
								username("bean").
								password(passwordEncoder().
								encode("master")).
								roles("USER").
								build();
		UserDetails adminDetails =User.builder().
									username("bond").
									password(passwordEncoder().
									encode("james")).
									roles("ADMIN").build();
		return new InMemoryUserDetailsManager(userDetails,adminDetails);
	}
}