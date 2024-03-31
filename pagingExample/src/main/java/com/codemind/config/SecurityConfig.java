package com.codemind.config;

public class SecurityConfig{
	

}
/*
 * 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class securityConfig {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails normalUser = User.withUsername("kiran").password(passwordEncoder().encode("kiran")).roles("normal").build();
		UserDetails adminlUser = User.withUsername("ravi").password(passwordEncoder().encode("ravi")).roles("admin").build();

		InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager(normalUser, adminlUser);
	  return inMemoryUserDetailsManager;
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

		httpSecurity.csrf().disable().authorizeHttpRequests()
		.requestMatchers("/home/admin")
		.hasRole("admin")
		.requestMatchers("normal")
		.hasRole("normal")
		.requestMatchers("/home/public")
		.permitAll().anyRequest()
				.authenticated().and().formLogin();

		return httpSecurity.build();
	}
}
*/
