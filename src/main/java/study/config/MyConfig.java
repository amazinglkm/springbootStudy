package study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.bean.Person;
import study.bean.Pet;

//声明配置,类似于xml配置文件<bean><property>
//配置类本身也是一个组件
//proxyBeanMethods属性规定组件类是否产生新的组件实例，用来解决组件依赖问题，即组件A中有组件B的实例
//  Full(不产生新的实例)
//  Lite（产生）
@Configuration(proxyBeanMethods = true)
public class MyConfig {

    //给容器添加组件
    //方法名为组件id，返回类型是组件类型，返回值是组件在容器中的对象,组件名默认为方法名
    //
    @Bean("自定义组件名")
    public Person person1(){

        return new Person("aaa",11);
    }

    @Bean
    public Pet pet1(){
        return new Pet("bbb");
    }

    
}
