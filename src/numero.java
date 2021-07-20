/* Este prgorama leera un numero entero por teclado y a partir de este ingreso se podra visualizar el doble y el triple de este numero */
import java.util.Scanner;

public class numero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dato;
        System.out.println("por favor ingrese un numero entero");
        dato = sc.nextInt();
        int cuadrado = dato*2;
        int cubo = dato*3;
        System.out.println("El resultado del doble del número es " + cuadrado + " y el resultado del triple del número es " + cubo);
        sc.close();
    }
}
