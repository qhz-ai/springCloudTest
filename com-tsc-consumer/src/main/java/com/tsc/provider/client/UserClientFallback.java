package com.tsc.provider.client;

import com.tsc.provider.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {

    @Override
    public String queryUserById(long id) {
        User user = new User();
        user.setUserName("服务器繁忙，请稍后再试！");
        return user.toString();
    }
}
