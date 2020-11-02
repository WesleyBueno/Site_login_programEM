package com.programem.sitelogin;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityWebConfig extends WebSecurityConfigurerAdapter{

    

    @Override
    protected void configure(AuthenticationManagerBuilder builder) throws Exception{
        builder
        .inMemoryAuthentication()
        .withUser("wes").password("{noop}wes")
        .roles("USER")
        .and()
        .withUser("kaline").password("{noop}a")
        .roles("USER")
        .and()
        .withUser("pedro").password("{noop}b")
        .roles("USER");
    }
}