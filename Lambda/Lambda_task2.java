import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_task2 {
    public static void main(String[] args) {
        List<Integer> r1 = new ArrayList<>();
        r1.add(1);r1.add(2);r1.add(8);r1.add(17);
        System.out.println( r1.stream().filter(number-> number%2==0).sorted().collect(Collectors.toList()) );
        System.out.println( r1.stream().filter(number-> number%2==0).mapToInt(Integer::intValue).sum() );

        List<String> r2 = new ArrayList<>();
        r2.add("hi");r2.add("hmmmm");r2.add("QWERTYUIP");r2.add("123456");
        System.out.println( r2.stream().map(n -> n.toLowerCase()).filter(n-> n.length() > 5).collect(Collectors.toList()) );
    }
}