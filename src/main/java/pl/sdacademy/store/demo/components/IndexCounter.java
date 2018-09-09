package pl.sdacademy.store.demo.components;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexCounter {


    private long indexCount = 1;

    @Autowired
    public IndexCounter() {
        this.indexCount = indexCount;
    }

    public long getCounter() {
        return indexCount++;
    }
}

