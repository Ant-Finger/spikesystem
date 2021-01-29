package com.limh.spikesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Limh
 * @date 2021/1/29
 */
@SpringBootApplication
@ImportResource(value = {"classpath:mysql/mybatis-jdbc.xml"})
@MapperScan(basePackages = "com.limh.spikesystem.mapper")
@EnableScheduling
public class SpikeSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpikeSystemApplication.class,args);
    }
}
