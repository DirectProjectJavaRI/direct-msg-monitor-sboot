package org.nhindirect.monitor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
@Configuration
public class WebSecurityConfiguration
{
	@Bean
	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http)
	{
		http.csrf(csrf -> csrf.disable());

	    return http.build(); 
	}
}
