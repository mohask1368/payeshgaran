package moh.ask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


@SpringBootApplication
public class AskApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(AskApplication.class, args);




        ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"" + " http://localhost:7575/index.html");
        pb.redirectErrorStream(true);
        pb.start();




//        Runtime rt = Runtime.getRuntime();
//        rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe  http://localhost:7575/index.html");

    }

}
