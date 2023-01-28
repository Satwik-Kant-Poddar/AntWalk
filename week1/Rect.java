import java.util.Scanner;
public class Rect{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("enter width and length");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("Area of Reactangle with width: "+a+" and length: "+b+" is: "+(a*b));
        }
}