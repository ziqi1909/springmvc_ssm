package com.miles.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : springmvc_07_rest_case
 * @Package : com.miles.config
 * @ClassName : SpringConfig.java
 * @createTime : 2022/8/16 15:59
 * @Email : zqwang21@163.com
 * @Description :
 */
@Configuration
@ComponentScan("com.miles.service")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class,MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
