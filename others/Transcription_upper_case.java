import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class Transcription_upper_case {
    public void read(String way){
        try( BufferedReader bufferedreader = new BufferedReader ( new FileReader(way) ) ) {
            String abc;
            while( (abc=bufferedreader.readLine())!=null ){
                System.out.print( abc.toUpperCase() );
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void rewrite_to(String take_way, String record_way){
        try(BufferedReader b_take_way = new BufferedReader ( new FileReader(take_way) )) {
            BufferedWriter b_record_way = new BufferedWriter ( new FileWriter(record_way) );
            String abc;
            while( (abc=b_take_way.readLine())!=null ){
                b_record_way.write( abc.toUpperCase() );
                b_record_way.flush();
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        Transcription_upper_case tuc = new Transcription_upper_case();
        tuc.rewrite_to("test.txt","test2.txt");
    }
}
