package cn.luoyuequan.mqerp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@MapperScan("cn.luoyuequan.mqerp.mapper")
public class MqerpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqerpApplication.class, args);
    }

}
