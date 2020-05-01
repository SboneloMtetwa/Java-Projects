import java.util.Scanner;
public class Temperature {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        
        double[] arr = new double[n];
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	System.out.print("Enter Element No."+(i+1)+": ");
        	System.out.println("\n");
        	arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        	
        }

        
        
       System.out.format("The Total Temparature is  %.0f", total);
       System.out.println("\n");
       
        double average = total / arr.length;
        
        System.out.format("The average is: %.3f", average);
        
    }
}