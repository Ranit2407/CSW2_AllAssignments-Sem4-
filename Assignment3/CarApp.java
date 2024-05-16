import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    private int modalNum;
    private String name;
    private int stock;

    public Car(int modalNum, String name, int stock) {
        this.modalNum = modalNum;
        this.name = name;
        this.stock = stock;
    }

    // Getter and Setter methods
    public int getModalNo() {
        return modalNum;
    }

    public void setModalNo(int modalNo) {
        this.modalNum = modalNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.stock);
    }
}

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car(2013, "Hyundai", 10));
        carList.add(new Car(2020, "MG", 13));
        Collections.sort(carList);
        System.out.println("List of sorted Car Objects:");
        for (Car car : carList) {
            System.out.println(car.getModalNo() + " " + car.getName() + " " + car.getStock());
        }
    }
}
