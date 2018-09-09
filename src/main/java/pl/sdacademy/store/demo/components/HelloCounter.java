package pl.sdacademy.store.demo.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloCounter {

    private long helloCount = 1;

    @Autowired
    public HelloCounter() {
        this.helloCount = helloCount;
    }

    public long getCounter(){
        return helloCount++;
    }

    public void setHelloCountToZero (){
        helloCount=0;
    }
}