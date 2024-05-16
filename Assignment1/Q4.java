public class Q4 {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.setDetails("HP",60000);
        System.out.println(l1);
        System.out.println(l1.toString("HP",60000));
    }
}

class Laptop{
    private String model;
    private double price;

    void setDetails(String model,double price){
        this.model=model;
        this.price=price;
    }

    String toString(String model,double price){
        return "Model :"+model+"\nPrice :"+price;
    }
}
