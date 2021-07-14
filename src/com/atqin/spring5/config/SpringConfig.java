package com.atqin.spring5.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //替代配置文件
@ComponentScan(basePackages = {"com.atqin"})
public
class SpringConfig {

}
