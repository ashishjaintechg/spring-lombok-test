package test.ashishjaintechg.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jdk.internal.jline.internal.Log;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RestController
@Slf4j
public class SpringLombokTestApplication {

	
	  @GetMapping(value="/")
		public String getGreeting() {
		  Employee n1 = Employee.builder().id(101).name("hello").build();
		  log.info("log test");
			return "hello";
		}
	  
	public static void main(String[] args) {
		SpringApplication.run(SpringLombokTestApplication.class, args);
	}

}
