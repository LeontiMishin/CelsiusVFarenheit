package celsius.v.farenheit;

import java.util.Scanner;

public class CelsiusVFarenheit {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Eta programma perevodit gradusi Celsija v Faringejt");
        
        
        System.out.println("Vvedite gradusi Celsius: ");
        double celsius = in.nextDouble();
        double farenheit = (celsius * 9 / 5)  + 32;
        System.out.printf("Farinheit = "+farenheit);
    }
    
}
