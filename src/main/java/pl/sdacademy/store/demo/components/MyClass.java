package pl.sdacademy.store.demo.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyClass {

    private final MyPlainClass myPlainClass;

    @Autowired
    public MyClass(MyPlainClass myPlainClass){
        System.out.println("asdaMyClass onstructor");
        this.myPlainClass = myPlainClass;
    }


    @PostConstruct
    public void init(){
        myPlainClass.hello();
    }
}