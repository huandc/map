package com.huan.map;

import com.huan.map.util.MD5Utils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@MapperScan("com.huan.map.mapper")
@EnableSwagger2
public class MapApplication {


    public static void main(String[] args) {
        SpringApplication.run(MapApplication.class, args);

    }

}
