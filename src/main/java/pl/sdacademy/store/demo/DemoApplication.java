package pl.sdacademy.store.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.sdacademy.store.demo.components.MyPlainClass;

@SpringBootApplication
public class DemoApplication {
	@Bean
	public MyPlainClass myPlainClass() {
		return new MyPlainClass();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}