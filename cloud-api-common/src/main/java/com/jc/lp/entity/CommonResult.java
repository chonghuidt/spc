package com.jc.lp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther lipeng
 * @date 2020/4/18 0018 23:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private  String message;
    private  T data;
    public  CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
