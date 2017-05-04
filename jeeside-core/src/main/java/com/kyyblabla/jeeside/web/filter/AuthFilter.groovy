package com.kyyblabla.jeeside.web.filter

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.FilterConfig
import javax.servlet.ServletException
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse

/**
 * Created by hp on 2017/5/4.
 */
class AuthFilter implements Filter {

    Logger logger = LoggerFactory.getLogger(getClass())

    @Override
    void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request, response)
    }

    @Override
    void destroy() {

    }
}
