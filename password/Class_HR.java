import java.util.ArrayList;
import java.util.Arrays;

public class Class_HR {
    public void The_function_for_finding_the_maximum1(int number ,int number2){
        try {
            if (number > number2) {
                System.out.println(number);
            } else if (number < number2) {
                System.out.println(number2);
            } else {
                throw new ArithmeticException();
            }
        }catch(Exception ex){System.out.println("ошибка: числа одинаковы");}
    }
    public void Division_Calculator2(int number,int number2){
        try {
            if (number2!=0) {
                System.out.println(number/number2);
            }
            else {
                throw new ArithmeticException();}
        }
        catch(Exception ex){System.out.println("ошибка: нельзя дельить на 0");}
    }
    public void String_to_Number_Converter3(String abc){
        try {
            System.out.println(Integer.parseInt(abc));
        }
        catch (NumberFormatException e){
            System.out.println("ошибка: эту строку нельзя перевести в число");
        }
    }
    public void Age_verification4(int old){
        try {
            if (old > 0 & old < 150) {
                System.out.println("да");
            } else {
                throw new IllegalArgumentException();
            }
        }catch(Exception ex){System.out.println("ошибка: возраст не может быть 0 или 150");}
    }
    public void Finding_the_root5(int number){
        try {
            if(number > 0) {
                System.out.println(Math.sqrt(number));
            }
            else {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e){System.out.println("ошибка");}
    }
    public void Factorial6(int number){
        try {
            if (number>=0) {
                int w = 1;
                for (int i = 1; i < number+1; i++) {
                    w *= i;
                }
                System.out.println(w);
            }
            else {
                throw new Exception();
            }
        }
        catch(Exception ex){System.out.println("ошибка: число меньше 0");}
    }
    public void Checking_the_array_for_zeros7(int[] mas){
        try {
            boolean y_n =false;
            for (int i =0;i<mas.length;i++){
                if (mas[i]==0){
                    y_n=true;
                }
            }
            if (y_n==true){
                System.out.println("В массиве есть 0");
            }
            else {
                throw new Exception();
            }
        }
        catch(Exception ex){System.out.println("ошибка: В массиве нет 0");}
    }
    public void Exponentiation_Calculator8(double number,double degree){
        try {
            if (degree>=0) {
                System.out.println(Math.pow(number, degree));
            }
            else {
                throw new Exception();
            }
        }
        catch(Exception ex){System.out.println("ошибка: степень отрицательная");}
    }
    public void Cropping_a_line9(String abc, int number){
        try {
            if (number <= abc.length()) {
                char[] b =abc.toCharArray();
                System.out.println(Arrays.copyOfRange(b,0,number));
            }
            else {
                throw new Exception();
            }
        }
        catch(Exception ex){System.out.println("ошибка: число меньше длины строки");}
    }
    public void Searching_for_an_element_in_an_array10(int number, int[] mas){
        try {
            boolean y_n = true;
            for (int i =0;i<mas.length;i++){
                if(mas[i]==number){
                    System.out.println("элемент находися на " + i + " месте в массиве");
                    y_n = false;
                    break;
                }
            }
            if(y_n) {
                throw new Exception();
            }
        }
        catch(Exception ex){System.out.println("ошибка: элемента нет в массиве");}
    }
    public void Conversion_to_binary_system11(int number){
        try {
            if (number >=0) {
                System.out.println(Integer.toBinaryString(number));
            }
            else {
                throw new Exception();
            }
        }
        catch(Exception ex){System.out.println("ошибка: число отрицательное");}
    }
    public void Checking_the_divisibility12(double number, double number2){
        try {
            if (number > number2) {
                System.out.println("первое число не делится на второе");
            }
            else if (number2 == 0){
                throw new ArithmeticException();
            }
            else {
                System.out.println("первое число не делится на второе: "+number/number2);
            }
        }
        catch(ArithmeticException ex){System.out.println("ошибка: число отрицательное");}
    }
    public void Reading_a_list_item13(ArrayList<String> mas, int number){
        try {
            if (number <= mas.size()) {
                System.out.println(mas.get(number));
            }
            else {
                throw new IndexOutOfBoundsException();
            }
        }
        catch(IndexOutOfBoundsException ex){System.out.println("ошибка: число выходит за пределы списка");}
    }
    public void Password_verification14(String abc){
        try {
            if (abc.length() >= 8) {
                System.out.println("пароль хороши");
            } else {
                throw new Exception();
            }
        }
        catch (Exception ex){System.out.println("ошибка: В пароль меньше 8 символов");}
    }
    public void Checking_the_date15(String data){
        try {
            if (data.matches("\\w*.\\w*.\\w*") & Integer.parseInt(data.substring(0,2))< 32 & Integer.parseInt(data.substring(3,5))< 13 ){
                System.out.println("такая дата возможна: "+data);
            } else {
                throw new Exception();
            }
        }
        catch (Exception ex){System.out.println("ошибка: неверные данные");}
    }
    public void String_concatenation16(String abc, String abc2){
        try {
            if (abc!= null & abc2!= null) {
                System.out.println(abc+abc2);
            } else {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException ex){System.out.println("ошибка: одна из строк равна null");}
    }
    public void remainder_of_the_division17(int number, int number2){
        try {
            if (number != 0 & number2 != 0) {
                System.out.println(number % number2);
            } else {
                throw new Exception();
            }
        }
        catch(Exception ex){System.out.println("ошибка: число равно 0");}
    }
    public void The_square_root18(int number){
        try {
            if (number >= 0){
                System.out.println(Math.sqrt(number));
            } else {
                throw new Exception();}
        }
        catch(Exception ex){System.out.println("ошибка: число отрицательное");}
    }
    public void Temperature_Converter19(double celsius){
        try {
            if (celsius*9/5 + 32 >= 0) {
                System.out.println(celsius*9/5 + 32);
            }
            else {
                throw new Exception();}
        }
        catch(Exception ex){System.out.println("ошибка: температура меньше абсолютного нуля не может быть");}
    }
    public void Checking_the_string_for_emptiness20(String abc){
        try {
            if (abc.equals("")!=true & abc != null) {
                System.out.println("строка не пустая");
            }
            else {
                throw new Exception();}
        }
        catch(Exception ex){System.out.println("ошибка: строка пустая");}
    }
}
