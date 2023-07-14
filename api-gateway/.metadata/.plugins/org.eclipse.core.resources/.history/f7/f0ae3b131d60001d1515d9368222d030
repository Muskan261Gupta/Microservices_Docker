package com.nagarro;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception{

        User.UserBuilder users = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(users.username("admin").password("test123").roles("admin"))
                .withUser(users.username("user").password("test123").roles("user"))
                .withUser(users.username("test").password("test123").roles("user"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http.authorizeRequests()

                .antMatchers("/users/**").hasRole("admin")
                .antMatchers("/**").hasAnyRole("admin","user")
                .and().formLogin();
    }
}
