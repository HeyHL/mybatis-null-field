package io.hel.startup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * helei
 * 2021/12/1 10:52
 * description:
 */
@SuppressWarnings("all")
@SpringBootApplication(scanBasePackages = {"io.hel"})
@MapperScan(basePackages = {"io.hel.mapper"})
public class NullFieldService {
    public static void main(String[] args) {
        SpringApplication.run(NullFieldService.class, args);
    }
}
