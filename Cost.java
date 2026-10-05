public class Cost {
    public static void main(String[] args) {
        int cost = 100;
        int sell = 100;
        if (sell>cost)
            System.out.println("Profit");
        else if (cost > sell)
            System.out.println("Loss");
        else
            System.out.println("No Profit No Loss");
             
    }
    
}
