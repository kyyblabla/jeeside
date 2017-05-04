package com.kyyblabla.jeeside

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

/**
 * Created by hp on 2017/5/4.
 */

@ComponentScan('com.kyyblabla.jeeside')
@SpringBootApplication
class Application {
    static void main(String[] args) {
        SpringApplication.run(Application.class, args)
    }
}
