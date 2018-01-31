package exercises;
import java.util.Scanner;

public class Exercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        parking();
        
    }
    
    
    
    
    
    
    public static void parking()
    {
        Scanner input=new Scanner(System.in);
        String c=" ",d,n;
        carpark p=new carpark(3);
        while(c.charAt(0)!='y')
        {
            System.out.print("Car enter or departure(a/d) and the car number:-");
            d=input.nextLine();
            n=input.nextLine();
            if(d.charAt(0)=='a')
            {
                p.enter(n);
            }
            else if(d.charAt(0)=='d')
            {
                p.leave(n);
            }
            else
            {
                System.out.println("Error invalid input");
            }
           
            System.out.print("Enter quit(y/n):-");
            c=input.nextLine();
        }
        p.printCar();
                
    }
    
    
}