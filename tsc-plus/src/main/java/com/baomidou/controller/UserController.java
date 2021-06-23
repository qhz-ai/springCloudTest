package com.baomidou.controller;


import com.baomidou.service.USERervice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author scorpios
 * @since 2021-06-21
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private USERervice useRervice;
    @GetMapping("/all")
    public List<com.baomidou.entity.User> queryAll(){
        return this.useRervice.list();
    }

}

