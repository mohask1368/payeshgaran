package src;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
@EnableWebMvc
public class DemoApplication {

	public DemoApplication() throws IOException {
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}






}