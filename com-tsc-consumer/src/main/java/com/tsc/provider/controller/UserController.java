package com.tsc.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tsc.provider.client.UserClient;
import com.tsc.provider.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("consumer/user")
//@DefaultProperties(defaultFallback = "fallBackMethod") // 指定一个类的全局熔断方法
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

  //  @Autowired
    //private DiscoveryClient discoveryClient; // eureka客户端，可以获取到eureka中服务的信息
    @Autowired
    private UserClient userClient;
    @GetMapping("{id}")
    @ResponseBody
    //@HystrixCommand
    public String queryUserById(@PathVariable("id")long id){
        if(id == 1){
            throw new RuntimeException("太忙了");
        }
    // 获取ip和端口信息，拼接成服务地址
    String baseUrl = "http://service-provider/user/" + id;
   // User user = this.restTemplate.getForObject(baseUrl, User.class);
    String user = this.userClient.queryUserById(id);
    return user.toString();
    }
    public String queryUserByIdFallBack(Long id){
        return "请求繁忙，请稍后再试！";
    }
    /**
     * 熔断方法
     * 返回值要和被熔断的方法的返回值一致
     * 熔断方法不需要参数
     * @return
     */
 public String fallBackMethod(){
        return "请求繁忙，请稍后再试！";
    }
}
