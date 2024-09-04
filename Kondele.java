
package kondele;
import java.util.Scanner;

public class Kondele {
    int r;
    int h;
    double volume;
    double surface;

    
    public static void main(String[] args) {
        //Creatae an object of the scanner class
        Scanner sc = new Scanner(System.in);
        
        //Reading an integer input
        System.out.println("Input the radius: ");
        int r =sc.nextInt();
        System.out.println("Input the height: ");
        int h =sc.nextInt();
        double volume =3.142*r*h + 3.142*r*r;
        double surface =2*3.142*r*h + 2*3.142*r*r;
        
        if(r>=h){
        System.out.println("The volume is : "+ volume);
        }else{
        System.out.println("The volume is :"+volume);
        }
    }
    
}
