package com.woniu.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
    @TableId(value = "id", type = IdType.AUTO)//设置id自增
    private Integer id;
    private String username;
    private String password;
    private String cold;
}
