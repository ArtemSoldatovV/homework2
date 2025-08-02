import java.util.ArrayList;

public class Seasons {
    static private ArrayList<String>list_of_seasons =new ArrayList<String>(){{add("WINTER");add("SPRING"); add("SUMMER"); add("AUTUMN");}};
    private String Enum = list_of_seasons.get(0);
    public void Entering_the_season(int season_number){
        this.Enum = list_of_seasons.get(season_number);
    }
    public String getEnum(){return this.Enum;}
    public String translation_Russian(){
        if (this.Enum.equals("WINTER")){
            return "зима";
        }
        else if (this.Enum.equals("SPRING")){
            return "весна";
        }
        else if (this.Enum.equals("SUMMER")){
            return "лето";
        }
        else if (this.Enum.equals("AUTUMN")){
            return "осень";
        }
        else{return "ошибка";}
    }

    public static void main(String[] args) {
        Seasons seasons = new Seasons();
        seasons.Entering_the_season(0);
        System.out.println( seasons.getEnum());
        System.out.println( seasons.translation_Russian());
        seasons.Entering_the_season(1);
        System.out.println( seasons.getEnum());
        System.out.println( seasons.translation_Russian());
        seasons.Entering_the_season(2);
        System.out.println( seasons.getEnum());
        System.out.println( seasons.translation_Russian());
        seasons.Entering_the_season(3);
        System.out.println( seasons.getEnum());
        System.out.println( seasons.translation_Russian());
    }
}
