import java.util.Scanner;
public class Product {  
      static int wordcount(String string)  
        {  
          int inputnum =0;  
      
            char ch[]= new char[string.length()];     
            for(int i=0;i < (string.length());i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    inputnum++;  
            }  
            return inputnum;  
        }  
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); 
  
    
        String product_total = sc.nextLine();
         System.out.println("Number of Words is: " + wordcount(product_total) + " words.");   
         System.out.print("Names of the Products Are : " + product_total);
    }  
}