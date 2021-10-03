package CoreProgram;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) 
	{
		int x1,x2,y1,y2;
		 
        double distance;

        @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);

        System.out.println("enter x1 point");
  
            x1=scan.nextInt();
   
        System.out.println("enter y1 point");
  
            y1=scan.nextInt();

        System.out.println("enter x2point");
  
            x2=scan.nextInt();

        System.out.println("enter y2 point");
  
            y2=scan.nextInt();	
        
        //double distance = Math.sqrt((x * x) + (y * y));
        distance = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2) + Math.pow(x2, 2) + Math.pow(y2, 2));
        System.out.println("Distance from (0, 0) to (" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ") is " + distance);
	}
	
}


