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


        ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"" +
                " http://localhost:8080/");

        pb. redirectErrorStream(true);

        pb.start();




//        Runtime rt = Runtime.getRuntime();
//        rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\" http://localhost:8080/");

    }

}
