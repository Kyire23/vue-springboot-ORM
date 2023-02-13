package com.oumuanode.backend.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.oumuanode.backend.common.Result;
import com.oumuanode.backend.mapper.UserLoginMapper;
import com.oumuanode.backend.pojo.UserLogin;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/root")
public class LoginController {
    @Resource
    private UserLoginMapper userLoginMapper;
    @PostMapping("/login")
    public Result<?> login(@RequestBody UserLogin userLogin) {
        UserLogin res = userLoginMapper.selectOne((Wrappers.<UserLogin>lambdaQuery().eq(UserLogin::getUsername, userLogin.getUsername()).eq(UserLogin::getPassword, userLogin.getPassword())));
        if (res == null){
            return Result.error("-1", "用户名或密码错误");
        }
        return Result.success();
    }

    @PostMapping("/register")
    public Result<?> register(@RequestBody UserLogin userLogin) {
        UserLogin res = userLoginMapper.selectOne(Wrappers.<UserLogin>lambdaQuery().eq(UserLogin::getUsername, userLogin.getUsername()));
        if (res != null){
            return Result.error("-1", "用户名重复！");
        }
        if (userLogin.getPassword() == null){
            userLogin.setPassword("123456");
        }
        userLoginMapper.insert(userLogin);

        return Result.success();
    }
}
