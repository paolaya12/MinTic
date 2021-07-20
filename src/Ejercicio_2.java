//*Tiene un límite de 10 cifras
import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args){
        var cifra = 0;
        var sc = new Scanner(System.in);
        System.out.println("¿Ingrese el numero para contar sus cifras?");
        int numA = sc.nextInt();
        while(numA!=0){
            numA/=10;
            cifra++;}
            System.out.println("El numero tiene " + cifra + " cifras.");
            sc.close();
    }
}
