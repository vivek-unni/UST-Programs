package com.ust.security.securityConfig;


import javax.sql.DataSource;

/*
  import org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.Configuration; import
  org.springframework.security.config.Customizer; import
  org.springframework.security.config.annotation.method.configuration.
  EnableMethodSecurity; import
  org.springframework.security.config.annotation.web.builders.HttpSecurity;
  import org.springframework.security.core.userdetails.User; import
  org.springframework.security.core.userdetails.UserDetails; import
  org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
  org.springframework.security.crypto.password.PasswordEncoder; import
  org.springframework.security.provisioning.InMemoryUserDetailsManager; import
  org.springframework.security.web.SecurityFilterChain;
  
  @Configuration
  
  @EnableMethodSecurity public class EmpSecurityConfig {
  
  @Bean public static PasswordEncoder passwordEncoder() { return new
  BCryptPasswordEncoder(); }
  
  @Bean SecurityFilterChain securityFilterChain(HttpSecurity http) throws
  Exception{ http.csrf( csrf->csrf.disable()).
  authorizeHttpRequests((authorize)-> authorize.anyRequest().authenticated())
  .httpBasic(Customizer.withDefaults()); return http.build(); }
  
  @Bean InMemoryUserDetailsManager userDetailsService() {
  
  UserDetails userDetails=User.builder(). username("bean").
  password(passwordEncoder(). encode("mister")). roles("USER"). build();
  
  UserDetails adminDetails=User.builder(). username("bond").
  password(passwordEncoder(). encode("james")). roles("ADMIN"). build();
  
  return new InMemoryUserDetailsManager(userDetails,adminDetails); } }
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableMethodSecurity
public class EmpSecurityConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
            .dataSource(dataSource)
            .passwordEncoder(passwordEncoder())
            .usersByUsernameQuery("SELECT username, password, enabled FROM users WHERE username = ?")
            .authoritiesByUsernameQuery("SELECT username, role FROM user_roles WHERE username = ?");
    }
}
