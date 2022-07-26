public class Clothing {
    private String name;
    private double price;
    private String size;



    public Clothing(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public char getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    
}
