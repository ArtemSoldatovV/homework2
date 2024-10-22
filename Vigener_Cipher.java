import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Vigener_Cipher {
    public static int[] EN = {65,90,97,122};
    public static int[] RU = {1040,1071,1072,1103};
    private static int length_EN= 26;
    private static int length_RU= 33;

    public boolean first_check(char n){
        if (n >= 65 & n <= 90 | n >= 97 & n <= 122 | n >= 1040 & n <= 1071 | n >= 1072 & n <= 1103){
            return true;
        }
        else {
            return false;
        }
    }

    public int[] checking_for_RU_EN(char n){
        if(n >= 65 & n <= 90 | n >= 97 & n <= 122){
            return EN;
        }
        else {
            return RU;
        }
    }
    public int checking_for_RU_EN_length(char n){
        if(n >= 65 & n <= 90 | n >= 97 & n <= 122){
            return length_EN;
        }
        else {
            return length_RU;
        }
    }

    public int letter_in_the_number(char letter, int[] mas){
        if (letter >= mas[0] & letter <= mas[1]){
            return letter - mas[0];
        }
        else {
            return letter - mas[2];
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
    public void put_the_file(String way,char[] text) {
        try (FileWriter writer = new FileWriter(way, true)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public char offset_encrypt(char letter,char n) {
        int[] language = checking_for_RU_EN(n);
        int length = checking_for_RU_EN_length(n);
        int number = letter_in_the_number(letter,language);
        if (first_check(n)) {
            if (number + n >= language[0] & number + n <= language[1] | number + n >= language[2] & number + n <= language[3]) {
                return (char) (n + number);
            } else {
                return (char) (n + (number - length));
            }
        }else {
        return n;}
    }
    public char offset_decrypt(char letter,char n) {
        int[] language = checking_for_RU_EN(n);
        int length = checking_for_RU_EN_length(n);
        int number = letter_in_the_number(letter,language);
        if (first_check(n)) {
            if ( number - n >= language[0] & number - n <= language[1] | number - n >= language[2] & number - n <= language[3]) {
                return (char) (n + number);
            } else {
                return (char) (n - (number + length));
            }
        }else {
            return n;}
    }

    public void encryption() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("1 - зашифровать, 2 - расшифровать, 3 - закрыть");
            int choice = in.nextInt();
            if (choice == 1) {
                System.out.println("ведите слово зашифровки");
                String encryption_step = in.next();
                char[] word_is_broken =encryption_step.toCharArray();
                System.out.println("ведите путь");
                String way = in.next();
                System.out.println("ведите путь для сохранения");
                String way2 = in.next();
                char[] mas = take_file(way).toCharArray();
                char[] mas2 = mas;
                int place_word =0;
                for (int i = 0; i < mas.length; i++) {
                    mas2[i] = offset_encrypt(word_is_broken[place_word],mas[i]);
                    if (place_word < word_is_broken.length-1){
                        place_word+=1;
                    }
                    else {
                        place_word=0;
                    }
                }
                put_the_file(way2, mas2);
            } else if (choice == 2) {
                System.out.println("ведите слово расшифровки");
                String decryption_step = in.next();
                char[] word_is_broken =decryption_step.toCharArray();
                System.out.println("ведите путь");
                String way = in.next();
                System.out.println("ведите путь для сохранения");
                String way2 = in.next();
                char[] mas = take_file(way).toCharArray();
                char[] mas2 = mas;
                int place_word =0;
                for (int i = 0; i < mas.length; i++) {
                    mas2[i] = offset_decrypt(word_is_broken[place_word],mas[i]);
                    if (place_word < word_is_broken.length){
                        place_word+=1;
                    }
                    else {
                        place_word=0;
                    }
                }
                put_the_file(way2, mas2);
            } else if (choice == 3) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Vigener_Cipher vc = new Vigener_Cipher();
        vc.encryption();
    }
}