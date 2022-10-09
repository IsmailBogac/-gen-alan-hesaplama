import java.awt.*;
import   java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a,b;
        double c ;
        Scanner input = new Scanner(System.in);
        System.out.print("a kenaranı giriniz: ");
        a=input.nextInt();

        Scanner result = new Scanner(System.in);
        System.out.print("b kenaranı giriniz: ");
        b=result.nextInt();

        c= Math.sqrt((a*a)+(b*b));



        System.out.println("Hipotenüs =" +c);



        }



    }







