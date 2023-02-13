package com.oumuanode.backend.controller;


import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.oumuanode.backend.common.Result;
import com.oumuanode.backend.mapper.UserMapper;
import com.oumuanode.backend.pojo.User;
import com.oumuanode.backend.service.impl.UserServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserServiceImpl userServiceImpl;
    @Resource
    private UserMapper userMapper;
    @PostMapping("/login2")
    public Result<?> login(@RequestBody User user) {
        User res = userMapper.selectOne((Wrappers.<User>lambdaQuery().eq(User::getUsername, user.getUsername()).eq(User::getPassword, user.getPassword())));
        if (res == null){
            return Result.error("-1", "用户名或密码错误");
        }
        return Result.success();
    }

    @PostMapping("/register2")
    public Result<?> register(@RequestBody User user) {
        User res = userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getUsername, user.getUsername()));
        if (res != null){
            return Result.error("-1", "用户名重复！");
        }
        if (user.getPassword() == null){
            user.setPassword("123456");
        }
        userMapper.insert(user);

        return Result.success();
    }

//
//    @PostMapping("/add")
//    public Boolean add(@RequestBody User user) {
//        return userServiceImpl.save(user);
//    }

    @PostMapping
    public Result<?> save(@RequestBody User user) {
        if (user.getPassword() == null) {
            user.setPassword("123456");
        }
        userServiceImpl.save(user);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id){
        userServiceImpl.removeById(id);
        return Result.success();
    }


    @PutMapping
    public Result<?> update(@RequestBody User user) {
        userServiceImpl.updateById(user);
        return Result.success();
    }


    @GetMapping
    public Result<?> findPage(@RequestParam(defaultValue = "1") Integer pageNum,
                              @RequestParam(defaultValue = "10") Integer pageSize,
                              @RequestParam(defaultValue = "") String search){
        LambdaQueryWrapper<User> wrapper = Wrappers.<User>lambdaQuery();
        if (StrUtil.isNotBlank(search)){
            //根据ID查询
            wrapper.like(User::getId,search);
        }
        Page<User> userPage = userServiceImpl.page(new Page<>(pageNum,pageSize),wrapper);
        return Result.success(userPage);
    }


}
