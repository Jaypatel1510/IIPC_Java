package pack;

public class Product {
    public static void main(String[] args) {
    	ProductMain apple = new ProductMain("Apple", 0.99, 10);
    	ProductMain banana = new ProductMain("Banana", 0.49, 15);
    	ProductMain orange = new ProductMain("Orange", 0.79, 20);

        apple.sell(5); 
        banana.sell(8); 
        orange.sell(15);

        System.out.println("Total quantity of products sold: " + ProductMain.getTotalSold());
    }
}

class ProductMain {
    private String name;
    private static int totalSold = 0;

    public ProductMain(String name, double price, int quantity) {
        this.name = name;
    }

    public void sell(int quantity) {
        totalSold += quantity;
        System.out.println(quantity + " " + name+ "s sold.");
    }

    public static int getTotalSold() {
        return totalSold;
    }
}

