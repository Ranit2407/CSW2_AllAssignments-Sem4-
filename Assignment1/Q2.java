public class Q2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setValues(10,5);
        r1.getValues();
        System.out.println("Area :"+r1.calcArea());
        System.out.println("Perimeter :"+r1.calcPerimeter());
    }
}

class Rectangle{
    private double length;
    private double width;

    void getValues(){
        System.out.println("Length :"+length);
        System.out.println("Width :"+width);
    }

    void setValues(double length, double width){
        this.length=length;
        this.width=width;
    }

    double calcArea(){
        return length*width;
    }

    double calcPerimeter(){
        return 2*(length+width);
    }
}
