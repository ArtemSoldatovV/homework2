import java.util.ArrayList;

public class DBMS {
    private static DBMS instance = new DBMS();
    private DBMS() {}
    private ArrayList<String> messages = new ArrayList<>();
    public static synchronized DBMS getInstance() {
        if (instance == null) {
            instance = new DBMS();
            System.out.println("создано подключение");
        }
        return instance;
    }
    public void info(){
        System.out.println("вы подключены");
    }
    public void bulletin(String str){
        messages.add(str);
    }
    public void get_messages(){
        System.out.println(messages);
    }
    public static void main(String[] args) {
        DBMS link1 = DBMS.getInstance();
        link1.bulletin("Hi");
        link1.bulletin("Привет");
        link1.get_messages();
    }
}
