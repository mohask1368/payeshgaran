package moh.ask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class AskApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(AskApplication.class, args);

        Runtime rt = Runtime.getRuntime();
        rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\" http://localhost:7575/index.html");

    }

}
