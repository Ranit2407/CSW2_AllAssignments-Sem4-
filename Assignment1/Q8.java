public class Q8 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.accelerate();
        c1.accelerate(2.5);
        c1.accelerate(10);
        c1.brake();
        c1.brake(2.5);
        c1.brake(10);
        Bicycle b1 = new Bicycle();
        b1.accelerate();
        b1.accelerate(2.5);
        b1.accelerate(10);
        b1.brake();
        b1.brake(2.5);
        b1.brake(10);
    }
}
interface Vehicle{
    abstract void accelerate();
    abstract void brake();

}

class Car1 implements Vehicle{
    public void accelerate(){
        System.out.println("Car Accelerated");
    }
    void accelerate(double speed){
        System.out.println("Car Accelerated at "+speed+" km/h");
    }
    void accelerate(int duration){
        System.out.println("Car accerated for "+duration+" seconds");
    }
    public void brake(){
         System.out.println("Car has Applied Brake");
     }
    void brake(double speed){
        System.out.println("Car has applied Brake at "+speed+" km/h");
    }
    void brake(int duration){
        System.out.println("Car has applied Brake for "+duration+" seconds");
    }
}

class Bicycle implements Vehicle{
    public void accelerate(){
        System.out.println("Bicycle Accelerated");
    }
    void accelerate(double speed){
        System.out.println("Bicycle Accelerated at "+speed+" km/h");
    }
    void accelerate(int duration){
        System.out.println("Bicycle accerated for "+duration+" seconds");
    }
    public void brake(){
        System.out.println("Bicycle has Applied Brake");
    }
    void brake(double speed){
        System.out.println("Bicycle has applied Brake at "+speed+" km/h");
    }
    void brake(int duration){
        System.out.println("Bicycle has applied Brake for "+duration+" seconds");
    }
}
