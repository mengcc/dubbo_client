package com.mzs.dubbo_client;


/**   
 * All rights Reserved, Designed By www.tydic.com
 * @Title: WebAppConfig.java
 * @Package com.kmair.applet
 * @Description: (程序总入口)
 * @author Chenrl   
 * @date 2017年2月28日 上午10:28:55
 * @version V1.0   
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * @Author mengzs 
 * @Date 2017年11月13日
 */
@ImportResource("classpath:dubbo-provider.xml")
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class App { 

	/**
	 * @Title: main
	 * @Description: 启动dubbo服务
	 * @param @param args 设定文件
	 * @return void 返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
