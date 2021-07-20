import java.util.Scanner;

public class suerte {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;
        System.out.println("Vamos a ingresar su fecha de nacimiento paso a paso Ingrese su día de nacimiento: ");
        dia = sc.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        mes = sc.nextInt();
        System.out.println("Ingrese su año de nacimiento");
        año = sc.nextInt();
        int SumNum = dia + año + mes;
        int SumDig = 0;

        while (SumNum != 0){
            SumDig = SumDig + (SumNum%10);
            SumNum = SumNum/10;
        }
        System.out.println("Su número de la suerte es: " + SumDig);
        sc.close();
    }
}
