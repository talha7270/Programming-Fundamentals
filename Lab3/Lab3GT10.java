import java.util.*;
public class Lab3GT10 {
 public static void main(String[] args) {
		 System.out.printf("Degrees\tRadians\tSine\tCosine\tTangent\n");
 		 int degrees = 30;
		 double radians = Math.toRadians(degrees);
		 double sin = Math.sin(radians);
		 double cos = Math.cos(radians);
		 double tan = Math.tan(radians);

		System.out.printf("%2d\t", degrees);
		System.out.printf("%2.4f \t", radians);
		System.out.printf("%2.4f\t", sin);
		System.out.printf("%2.4f \t", cos);
		System.out.printf("%2.4f\t", tan);
		 
		 degrees = 60;
		 radians = Math.toRadians(degrees);
		 sin = Math.sin(radians);
		 cos = Math.cos(radians);
		 tan = Math.tan(radians);

		 System.out.printf("\n%2d\t%2.4f\t%2.4f\t%2.4f", degrees,radians,sin,cos,tan);
 }
}