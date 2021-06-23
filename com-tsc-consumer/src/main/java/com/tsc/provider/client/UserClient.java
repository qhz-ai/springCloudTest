package com.tsc.provider.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tsc.provider.configuration.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "service-provider", fallback = UserClientFallback.class,configuration = FeignConfiguration.class)
public interface UserClient {

    @GetMapping("user/{id}")
    @ResponseBody
    public String queryUserById(@PathVariable("id")long id);
}
