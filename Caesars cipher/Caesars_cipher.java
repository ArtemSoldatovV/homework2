import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Caesars_cipher {
    public static int[] RU = {65,90,97,122};
    public boolean first_check(char n){
        if (n > 65 & n < 90 | n > 97 & n < 122 | n > 1040 & n < 1071 | n > 1072 & n < 1103){
            return true;
        }
        else {
            return false;
        }
    }

    public String checking_for_RU_EN(char n){
        if(n >= 65 & n <= 90 | n >= 97 & n <= 122){
            return "EN";
        }
        else {
            return "RU";
        }
    }

    public char offset_encrypt(int number,char n){
        String language = checking_for_RU_EN(n);
        if(language.equals("EN")){
            if (n >= 65 & n <= 90 & number+n >= 65 & number+n <= 90 | n >= 97 & n <= 122 & number+n >= 97 & number+n <= 122){
                return (char)(n + number);
            }
            else {
                return (char)(n + (number-26));
            }
        }
        else {
            if (n >= 1040 & n <= 1071 & number+n >= 1040 & number+n <= 1071 | n >= 1072 & n <= 1103 & number+n >= 1072 & number+n <= 1103){
                return (char)(n + number);
            }
            else {
                return (char)(n + (number)-33);
            }
        }
    }

    public char offset_decrypt(int number,char n){
        String language = checking_for_RU_EN(n);
        if(language.equals("EN")){
            if (n >= 65 & n <= 90 & number-n >= 65 & number-n <= 90 | n >= 97 & n <= 122 & number-n >= 97 & number-n <= 122){
                return (char)(n - number);
            }
            else {
                return (char)(n - (number+26));
            }
        }
        else {
            if (n >= 1040 & n <= 1071 & number-n >= 1040 & number-n <= 1071 | n >= 1072 & n <= 1103 & number-n >= 1072 & number-n <= 1103){
                return (char)(n - number);
            }
            else {
                return (char)(n - (number+33));
            }
        }
    }

    public String take_file(String way){
        try(FileReader reader = new FileReader(way))
        {
            return Files.readString(Paths.get(way));
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        return "";
    }
    public void put_the_file(String way,char[] text){
        try(FileWriter writer = new FileWriter(way, true))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    public void encryption(){
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("1 - зашифровать, 2 - расшифровать, 3 - автоматическая расшифровка, 4 - закрыть");
            int choice = in.nextInt();
            if (choice ==1){
                System.out.println("ведите шаг зашифровки");
                int encryption_step = in.nextInt();
                System.out.println("ведите путь");
                String way = in.next();
                System.out.println("ведите путь для сохранения");
                String way2 = in.next();
                char[] mas = take_file(way).toCharArray();
                char[] mas2 = mas;
                for (int i=0; i<mas.length;i++){
                    mas2[i]=offset_encrypt(encryption_step,mas[i]);
                }
                put_the_file(way2,mas2);
            }
            else if (choice ==2) {
                System.out.println("ведите шаг расшифровки");
                int decryption_step = in.nextInt();
                System.out.println("ведите путь");
                String way = in.next();
                System.out.println("ведите путь для сохранения");
                String way2 = in.next();
                char[] mas = take_file(way).toCharArray();
                char[] mas2 = mas;
                put_the_file(way2,mas2);
            }
            else if (choice ==3) {
                System.out.println("ведите путь");
                String way = in.next();
                String abc = take_file(way);
                int score=0;
                boolean y_n = false;
                for (int i =0;i<34;i++) {
                    if (abc.matches(",.?что.|.что-то.|.?кто.|.кто-то.|.?а.|.где.|.когда.|.идём.|.пойдём.|.ищи.|.?я.|.?ты.|.?мы.|.едем.")) {
                        System.out.println("шаг расшифровки "+choice);
                        y_n=true;
                        break;
                    }
                    if (abc.matches(".why.|.?i.am.|.you.|.we.|.it.|.he.|.she.|.when.|.where.|.go.|.here.")) {
                        System.out.println("шаг расшифровки "+choice);
                        y_n=true;
                        break;
                    }
                    choice++;
                }
                if (y_n == false){
                    System.out.println("программа не смогла расшифровать файл");
                }
            }
            else if (choice ==4) {
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        Caesars_cipher rr = new Caesars_cipher();
        rr.encryption();
    }
}

