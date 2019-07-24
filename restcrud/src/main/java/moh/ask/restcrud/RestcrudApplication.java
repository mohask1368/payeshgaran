package moh.ask.restcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@SpringBootApplication

public class RestcrudApplication {



    public static void main(String[] args) throws IOException {
        SpringApplication.run(RestcrudApplication.class, args);


        Runtime runtime = Runtime.getRuntime();
        runtime.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe  http://localhost:6060/index.html" );
    }



}
