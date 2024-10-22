public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("создано подключение");
        }
        return instance;
    }
    public void info(){
        System.out.println("вы подключены");
    }
    public static void main(String[] args) {
        Singleton link1 = Singleton.getInstance();
        Singleton link2 = Singleton.getInstance();
        System.out.println("подключение одно и тоже?"+(link1 == link2));
    }
}
