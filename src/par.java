import java.util.Scanner;

public class par {
    public static void main(String [] args){
        
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println("Ingrese un número entero");
        num = sc.nextInt();
        String par;
        int resto = num%2;
        par = resto == 0  ? "par" : "impar";
        System.out.println("El número " + num + " es " + par);
    }

}
