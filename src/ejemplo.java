import java.util.Scanner;
public class ejemplo {
    public static void main(String[] args) {
    var sc = new Scanner(System.in);
    System.out.println("Por favor ingrese su nombre");
    var nombre = sc.nextLine();
    System.out.println("Hola " + nombre + "!");
    }
}