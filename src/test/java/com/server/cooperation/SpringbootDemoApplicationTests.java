package com.server.cooperation;

import com.server.cooperation.CooperationApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = CooperationApplication.class)
@WebAppConfiguration
@SpringBootConfiguration
public class SpringbootDemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void insertUserCircleImage() {

    }

}
