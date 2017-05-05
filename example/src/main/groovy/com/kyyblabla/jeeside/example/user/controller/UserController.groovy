package com.kyyblabla.jeeside.example.user.controller

import com.kyyblabla.jeeside.example.user.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by hp on 2017/5/4.
 */
@RequestMapping('/api/v1/user')
@RestController
class UserController {

    @GetMapping("/{id}")
    User getById(@PathVariable("id") int id) {
        if (id == 0) {
            throw new RuntimeException('id=0')
        }
        return new User(id: id, name: 'test')
    }


}
