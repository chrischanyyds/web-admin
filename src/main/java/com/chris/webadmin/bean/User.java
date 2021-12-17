package com.chris.webadmin.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ author: chris
 * @ creat: 2021-11-11 23:29
 * @ description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String passWord;

    //以下是数据库字段
    private Long id;
    private String name;
    private Integer age;
    private String email;

}
