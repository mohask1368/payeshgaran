
import java.util.Arrays;
import java.util.List;

public class Test {


    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        List<String> list = Arrays.asList( "red" , "blue" , "yellow" );
        list.stream().filter(b->((String) b).startsWith("r")).forEach(System.out::println);
    }
}
