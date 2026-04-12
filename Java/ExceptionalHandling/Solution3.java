import java.util.*;

class Fruits{
    private int fruitId;
    private String fruitName;
    private int price;
    private int rating;

    public Fruits(int fruitId, String fruitName, int price, int rating){
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.rating = rating;
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


}

class FruitsNotFoundException extends Exception{
    public FruitsNotFoundException(String message){
        super(message);
    }
}

public class Solution3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Fruits> fruits = new ArrayList<Fruits>();

        int n = sc.nextInt(); sc.nextLine();

        for(int i = 0 ; i<n ; i++){
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt(); sc.nextLine();
            int rating = sc.nextInt();

            fruits.add(new Fruits(id, name, price, rating));
        }
        int searchRating = sc.nextInt(); sc.nextLine();

        try {
            Fruits ans = FindMaximumPriceByRating(fruits, searchRating);
            System.out.println(ans.getFruitId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally{
            sc.close();
        }
    }

    public static Fruits FindMaximumPriceByRating(List<Fruits> fruits, int searchRating) throws FruitsNotFoundException{
        Fruits ans = null;
        int maxi = Integer.MIN_VALUE;

        for(Fruits obj: fruits){
            if(obj.getRating() > searchRating && obj.getPrice() > maxi){
                maxi = obj.getPrice();
                ans = obj;
            }
        }
        if(ans == null)
            throw new FruitsNotFoundException("No Such Fruit.");
        return ans;
    }
}
