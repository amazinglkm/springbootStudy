package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import study.config.MyConfig;

import java.util.Arrays;

@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {

        //返回IOC容器
        ConfigurableApplicationContext context = SpringApplication.run(StudyApplication.class);
        //组件名
        Arrays.stream(context.getBeanDefinitionNames()).forEach(c -> System.out.println(c));

        //获取组件
        context.getBean("自定义组件名");

        MyConfig myConfig = context.getBean(MyConfig.class);


    }
}
