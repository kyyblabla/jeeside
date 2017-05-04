package com.kyyblabla.jeeside.configuration

import com.kyyblabla.jeeside.web.filter.AuthFilter
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by hp on 2017/5/4.
 */
@Configuration
class FilterConfig {

    Logger logger = LoggerFactory.getLogger(getClass())

    @Bean
    FilterRegistrationBean indexFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new AuthFilter());
        registration.addUrlPatterns("/api/v1/*");
        return registration;
    }
}
