import java.io.RandomAccessFile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Reading_speed {
    public void read_record_IO(String take_way, String record_way){
        try(BufferedReader b_take_way = new BufferedReader ( new FileReader(take_way));
            BufferedWriter b_record_way = new BufferedWriter( new FileWriter(record_way));
        ) {
            String abc;
            while( (abc=b_take_way.readLine())!=null ){
                b_record_way.write( abc );
                b_record_way.flush();
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void read_record_NIO(String take_way, String record_way){
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(take_way, "rw");
             FileChannel channel = randomAccessFile.getChannel();
             RandomAccessFile randomAccessFile2 = new RandomAccessFile(record_way, "rw");
             FileChannel channel2 = randomAccessFile2.getChannel();)
        {
            ByteBuffer byteBuffer = ByteBuffer.allocate((int) channel.size());
            StringBuilder builder = new StringBuilder();

            channel.read(byteBuffer);
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                builder.append((char) byteBuffer.get());
            }
            byteBuffer.flip();
            channel2.write(byteBuffer);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void body(String take_way, String record_way){
        long startTime_IO = System.currentTimeMillis();
        read_record_IO(take_way, record_way);
        long endTime_IO = System.currentTimeMillis();

        long startTime_NIO = System.currentTimeMillis();
        read_record_NIO(take_way, record_way);
        long endTime_NIO = System.currentTimeMillis();

        System.out.println("Время выполнения IO: " + (endTime_IO - startTime_IO) + " ms");
        System.out.println("Время выполнения NIO: " + (endTime_NIO - startTime_NIO) + " ms");
    }
    public static void main(String[] args) {
        Reading_speed qqq = new Reading_speed();
        qqq.body("C:\\Users\\Пользователь\\Documents\\test.txt", "C:\\Users\\Пользователь\\Documents\\test2.txt");
    }
}
