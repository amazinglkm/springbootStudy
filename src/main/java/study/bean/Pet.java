package study.bean;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class Pet {

    public Pet(String name){
        this.name = name;
    }

    private String name;
    private Person owner;
}
