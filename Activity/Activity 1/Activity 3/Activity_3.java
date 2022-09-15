import java.util.Scanner;
public class Activity_3 {
    public static void main(String[] args) throws Exception {

      Scanner scan = new Scanner(System.in);

    System.out.print("English : ");
    float english = scan.nextFloat();

    System.out.print("Math    : ");
    float math = scan.nextFloat();

    System.out.print("Science : ");
    float science = scan.nextFloat();

    System.out.print("MAPEH   : ");
    float mapeh = scan.nextFloat();

    float average = (english + math + science + mapeh) / 4;


    System.out.println("\nAverage : " + average );
    System.out.println();
    }
}
