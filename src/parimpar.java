import java.util.Scanner;
public class parimpar {
    public static void main(String [] args){
        var sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        var numero = sc.nextInt();

        var respuesta = validarNumero(numero);

        System.out.println(respuesta);
        sc.close();
    }
    public static String validarNumero(int numero){
        return (numero%2 == 0 ? numero + " Es par" : numero + " Es impar");
    }
}
