package com.server.cooperation;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude =
        {DataSourceAutoConfiguration.class, MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
//@MapperScan("com.server.cooperation.mapper")
@EnableCaching
@EnableTransactionManagement
public class CooperationApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CooperationApplication.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CooperationApplication.class);
    }

}
