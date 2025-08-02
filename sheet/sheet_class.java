import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class sheet_class {
    public static void main(String[] args) {
        System.out.println("1--------------------");
        ArrayList<String> al_mas = new ArrayList<>(5);
        al_mas.add("one");
        al_mas.add("two");
        al_mas.add("three");
        al_mas.add("four");
        al_mas.add("five");
        System.out.println(al_mas);
        for (String abc : al_mas){
            System.out.println(abc);
        }
        System.out.println("2--------------------");
        ArrayList<Integer> int_mas = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);
        }};
        int_mas.remove(3);
        System.out.println(int_mas);
        System.out.println("3--------------------");
        String desired_element = "two";
        if(al_mas.contains(desired_element)){
            al_mas.indexOf(desired_element);
        }
        else {
            System.out.println("элемента нет");
        }
        System.out.println("4--------------------");
        ArrayList<Integer> int_mas4 = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);
        }};
        for(int i=0; i<int_mas4.size();i++){
            int_mas4.set(i,int_mas4.get(i)+2);
        }
        System.out.println(int_mas4);
        System.out.println("5--------------------");
        ArrayList<String> abc_masnew = new ArrayList<>(){{
            add("one");
            add("two");
            add("three");
        }};
        ArrayList<String> line_masnew = new ArrayList<>(){{
            add("four");
            add("five");
            add("six");
        }};
        abc_masnew.addAll(line_masnew);
        System.out.println(abc_masnew);
        System.out.println("6--------------------");
        ArrayList<String> abc_mas6 = new ArrayList<>(){{
            add("amm");
            add("arr");
            add("rea");
            add("vvt");
            add("avt");
        }};
        System.out.println(abc_mas6);
        for (int i=0;i<abc_mas6.size();i++){
            if(abc_mas6.get(i).matches("^a|^A")){
                abc_mas6.set(i,null);
            }
        }
        System.out.println(abc_mas6);
        System.out.println("7--------------------");
        ArrayList<Integer> int_mas7 = new ArrayList<>(){{
            add(2);
            add(10);
            add(5);
        }};
        int int_max=int_mas7.get(0);
        for (int i : int_mas7){
            if (i>int_max){
                int_max=i;
            }
        }
        System.out.println(int_max);
        System.out.println("8--------------------");
        ArrayList<String> abc_mas8_1 = new ArrayList<>(){{
            add("ww");
            add("ew");
            add("er");
            add("ww");
            add("wt");
            add("ew");
        }};
        ArrayList<String> abc_mas8_2 = new ArrayList<>();
        System.out.println(abc_mas8_1);

        for (int i=0; i<abc_mas8_1.size();i++) {
            if (abc_mas8_2.contains(abc_mas8_1.get(i))) {
                abc_mas8_1.remove(abc_mas8_1.indexOf(abc_mas8_1.get(i)));
            }
            else {
                abc_mas8_2.add(abc_mas8_1.get(i));
            }
        }

        System.out.println(abc_mas8_1);
        System.out.println("9--------------------");

        ArrayList<String> abc_mas9 = new ArrayList<>(){{
            add("zee");
            add("oo");
            add("er");
            add("adt");
            add("tru");
            add("ew");
        }};

        String swap;
        boolean y_n=false;
        while (y_n){
            for (int i=1;i<abc_mas9.size();i++){
                if( abc_mas9.get(i-1).equals(abc_mas9.get(i)) ) {

                }
            }
        }
        Collections.sort(abc_mas9.subList(1, abc_mas9.size()));
        System.out.println(abc_mas9);
        System.out.println("10--------------------");
        ArrayList<String> abc_mas10 = new ArrayList<>(){{
            add("zee");
            add("oo");
            add("er");
            add("adt");
            add("tru");
            add("ew");
        }};
        for (int i=abc_mas10.size()-1;i>-1;i--){
            System.out.println(abc_mas10.get(i));
        }
    }
}

