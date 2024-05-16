public class CarTester {
    public static void main(String[] args) {
        Car car1 = new Car("Honda","Verna");
        Car car2 = new Car(null , null);
        car1.getDetails();
        car2.getDetails();
        System.out.println("New Values For C2");
        car2.setDetails("Audi","R8");
        car2.getDetails();
    }
}

class Car{
    private String make;
    private String model;

    Car(String make,String model){
        this.make=make;
        this.model=model;
    }

    void getDetails(){
        System.out.println("Make :"+make);
        System.out.println("Model :"+model);
    }

    void setDetails(String make,String model){
        this.make=make;
        this.model=model;
    }
}
