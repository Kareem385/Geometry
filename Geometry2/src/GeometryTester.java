

import java.util.Scanner;

public class GeometryTester 
{
public static void main (String [] args)
{
Scanner in = new Scanner(System.in);
System.out.println("Please enter radius");
double r = in.nextDouble();
System.out.println("Enter height");
double h = in.nextDouble();
System.out.println("The volume of a sphere is:"  +Geometry.sphereVolume(r));
System.out.println("The SurfaceArea of a sphere is:" +Geometry.sphereSurface(r));
System.out.println("The volume of a cylinder is:" +Geometry.cylinderVolume(r,h));
System.out.println("The SurfaceArea of a cylinder is:" +Geometry.cylinderSurface(r,h));
System.out.println("The volume of a cone is:" +Geometry.coneVolume(r, h));
System.out.println("The SurfaceArea of a cylinder is:" +Geometry.cylinderSurface(r,h));


}
}