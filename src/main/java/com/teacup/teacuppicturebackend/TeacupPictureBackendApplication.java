package com.teacup.teacuppicturebackend;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.teacup.teacuppicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true) /* 获取代理类 */
public class TeacupPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeacupPictureBackendApplication.class, args);
    }

}
