import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lambda_task {
    @FunctionalInterface
    interface MyFunctionalInterface {
        public int sayHello(int num);
    }
    public static void main(String[] args) {
        //1
        MyFunctionalInterface yy = (num) -> num *2;
        int[] r = new int[]{1,2,4};
        for (int i=0; i<r.length;i++){
            r[i]=yy.sayHello(r[i]);
        }
        for (int i:r) {System.out.print(i);  System.out.print(", ");}
        System.out.println();
        //2
        int[] array = {1,-6,8,0,-1,2,4};
        List<Integer> r2 = Arrays.stream(array).boxed().collect(Collectors.toList());
        r2 = r2.stream().filter( num -> num > 0).collect(Collectors.toList());
        for (int i:r2) {System.out.print(i);  System.out.print(", ");}
        System.out.println();
        //3
        List<String> r3 =  new ArrayList<>();
        r3.add("w");r3.add("ii");r3.add("12345");r3.add("");
        List<Integer> r3_2 = r3.stream().map(n -> n.length() ).collect(Collectors.toList());
        for (int i:r3_2) {System.out.print(i);  System.out.print(", ");}
        System.out.println();
        //4
        List<String> r4 =  new ArrayList<>();
        r4.add("w");r4.add("ii");r4.add("123456");r4.add("");
        List<String> r4_2 = r4.stream().filter(n -> n.length() > 5 ).toList();
        for (String i:r4_2) {System.out.print(i);  System.out.print(", ");}
        System.out.println();
        //5
        List<String> r5 =  new ArrayList<>();
        r5.add("w");r5.add("ia");r5.add("12345");r5.add("");
        List<Integer> r5_2 = r5.stream().map(n -> n.length() - n.replace("a", "").length() ).collect(Collectors.toList());
        for (int i:r5_2) {System.out.print(i);  System.out.print(", ");}
        System.out.println();
        //6
        List<Integer> r6 =  new ArrayList<>();
        r6.add(2);r6.add(5);r6.add(45);r6.add(0);
        List<Integer> r6_2 = r6.stream().map(n -> n*3).collect(Collectors.toList());
        for (int i:r6_2) {System.out.print(i);  System.out.print(", ");}
        System.out.println();
        //7
        Random random = new Random();
        List<Integer> r7 =  new ArrayList<>();
        r7.add(1);r7.add(1);r7.add(1);r7.add(1);
        r7 = r7.stream().map(n -> random.nextInt(20) ).collect(Collectors.toList());
        for (int i:r7) {System.out.print(i);  System.out.print(", ");}
        System.out.println();
        //8
        List<String> r8 =  new ArrayList<>();
        r8.add("w");r8.add("iaa");r8.add("12321");r8.add("trt");
        r8 = r8.stream().filter(n ->{String Str = new StringBuffer( n ).reverse().toString();
        return n.equals(Str);}).collect(Collectors.toList());
        for (String i:r8) {System.out.print(i);  System.out.print(", ");}
        System.out.println();
        //9
        List<String> r9 =  new ArrayList<>();
        r9.add("j7");r9.add("iaa");r9.add("12321");r9.add("jtrt");
        r9 = r9.stream().filter(n -> n.matches("^j.*") ).collect(Collectors.toList());
        for (String i:r9) {System.out.print(i);  System.out.print(", ");}
        System.out.println();
        //10
        List<String> r10 =  new ArrayList<>();
        r10.add("apple");r10.add("banana");r10.add("cherry");
        String r10_2 = r10.stream().collect(Collectors.joining(", "));
        System.out.println(r10_2);
    }
}