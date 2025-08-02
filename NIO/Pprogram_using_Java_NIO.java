import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Pprogram_using_Java_NIO {
    //задане 4 из Потоки, Декоратор, Io NiO
    public void read_record(String take_way,String record_way){
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(take_way, "rw");
             FileChannel channel = randomAccessFile.getChannel();
             RandomAccessFile randomAccessFile2 = new RandomAccessFile(record_way, "rw");
             FileChannel channel2 = randomAccessFile2.getChannel();)
        {
            channel2.transferFrom(channel,0,channel.size());
        } catch (Exception ex) {
        System.out.println(ex.getMessage());}
    }

    public static void main(String[] args) {
        Pprogram_using_Java_NIO yyy = new Pprogram_using_Java_NIO();
        yyy.read_record("C:\\Users\\student\\Documents\\test_big.txt","C:\\Users\\student\\Documents\\test2.txt");
    }
}