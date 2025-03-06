import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Ecommerce{
    private int productId;
    private String productName;
    private int productPrice;

    public Ecommerce(int productId, String productName, int productPrice){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}

class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message){
        super(message);
    }
    // @Override 
    // public String getMessage(){
    //     return "Product Not found";
    // }
}

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Ecommerce> list = new ArrayList<>();
        list.add(new Ecommerce(101, "Laptop", 65000));
        list.add(new Ecommerce(102, "Charger", 5000));
        list.add(new Ecommerce(101, "Bottle", 100));

        try{
            Ecommerce ans = findProduct(list,"phone");
            System.out.println("Product is found with id and price is: "+ans.getProductId()+" "+ans.getProductPrice());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        sc.close();
    }
    public static Ecommerce findProduct(List<Ecommerce> list, String product) throws ProductNotFoundException{
        Ecommerce ans = null;
        for(Ecommerce e: list){
            if(e.getProductName().equalsIgnoreCase(product)){
                ans = e;
                break;
            }
        }
        if(ans == null)
        
            throw new ProductNotFoundException(product+" Not Found");

        return ans;
    }
}
