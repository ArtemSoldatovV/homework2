import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Asynchronous_reading_NIO {
    public void sf(String take_way, String record_way){
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(take_way, "rw");
             FileChannel channel = randomAccessFile.getChannel();
             RandomAccessFile randomAccessFile2 = new RandomAccessFile(record_way, "rw");
             FileChannel channel2 = randomAccessFile2.getChannel();)
        {

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
