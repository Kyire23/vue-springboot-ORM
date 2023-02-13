package com.oumuanode.backend.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("t_root")
public class UserLogin {

    private String username;
    private String password;


}
