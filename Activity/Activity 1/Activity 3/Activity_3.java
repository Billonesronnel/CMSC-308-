import java.util.Scanner;
public class Activity_3 {
    public static void main(String[] args) throws Exception {

      Scanner scan = new Scanner(System.in);

      
    System.out.print("\nCMSC 308 : ");
    float english = scan.nextFloat();

    System.out.print("CMSC 307 : ");
    float math = scan.nextFloat();

    System.out.print("CMSC 306 : ");
    float science = scan.nextFloat();

    System.out.print("CMSC 305 : ");
    float mapeh = scan.nextFloat();

    float average = (english + math + science + mapeh) / 4;


    System.out.println("\nAverage : " + average );


    if (average > 100) 
    System.out.print("Invalid Grade");

    else if (average >= 98) 
    System.out.println("With Highest Honors");

    else if (average >= 95) 
    System.out.println("With High Honors");

    else if (average >= 90)  
    System.out.println("With Honors");

    else if (average >= 75)  
    System.out.println("Passed");

    else 
        System.out.println("Failed");
    


    }
}
