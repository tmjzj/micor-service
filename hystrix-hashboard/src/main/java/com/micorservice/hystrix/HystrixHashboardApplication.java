package com.micorservice.hystrix;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
//开启监控功能
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixHashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixHashboardApplication.class, args);
    }

}
