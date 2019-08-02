import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Point2D point2D1= new Point2D();
        System.out.println("point2D1: "+point2D1.toString());

        System.out.println("Enter x: ");
        float x= input.nextFloat();
        System.out.println("Enter y: ");
        float y= input.nextFloat();
        Point2D point2D2= new Point2D(x,y);
        System.out.println("point2D2: "+ point2D2.toString());


        Point3D point3D1=new Point3D();
        System.out.println(point3D1.toString());

        Point3D point3D2= new Point3D(5);
        System.out.println(point3D2.toString());

        Point3D point3D3= new Point3D(2,4,8);
        System.out.println(point3D3.toString());
    }
}
