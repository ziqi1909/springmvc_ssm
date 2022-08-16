package com.miles.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : springmvc_07_rest_case
 * @Package : com.miles.config
 * @ClassName : ServletConfig.java
 * @createTime : 2022/8/16 16:18
 * @Email : zqwang21@163.com
 * @Description :
 */
@Configuration
@ComponentScan({"com.miles.controller","com.miles.config"})
@EnableWebMvc
public class SpringMvcConfig {

}
