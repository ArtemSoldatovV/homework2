import java.util.ArrayList;

public class Order {
    static private ArrayList<String> condition_the_product =new ArrayList<String>(){{add("NEW");add("IN_PROGRESS"); add("DELIVERED"); add("CANCELLED");}};
    private int Enum = 0;

    public void changing_state(){
        if (this.Enum<2){
            this.Enum += 1;
        }
    }
    public String gef_Enum(){
        return condition_the_product.get(this.Enum);
    }
    public void refund(){
        if(this.Enum<=1){
            this.Enum = condition_the_product.size()-1;
        }
        else {
            System.out.println("refund cancelled");
        }
    }
    public static void main(String[] args) {
        Order order = new Order();
        order.changing_state();
        order.changing_state();
        order.changing_state();
        order.refund();
        System.out.println(order.gef_Enum());
        Order order2 = new Order();
        order2.refund();
        System.out.println(order2.gef_Enum());
    }
}