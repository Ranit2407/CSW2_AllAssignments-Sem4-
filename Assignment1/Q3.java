public class Q3 {
    public static void main(String[] args) {
        Point p1=new Point(5,5);
        Point p2=new Point(p1);
        p1.getPoint();
        p2.getPoint();
        System.out.println("P2 New Points");
        p2.setPoints(10,10);
        p2.getPoint();;
    }
}

class Point{
    private double X;
    private double Y;
    Point(double X,double Y){
        this.X=X;
        this.Y=Y;
    }

    Point(Point p1){
        X=p1.X;
        Y=p1.Y;
    }

    void getPoint(){
        System.out.println("X :"+X);
        System.out.println("Y :"+Y);
    }

    void setPoints(double X,double Y){
        this.X=X;
        this.Y=Y;
    }
}