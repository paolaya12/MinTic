//*Programa que calcule el precio de venta de un producto conociendo el precio por unidad (sin IVA) del producto, el número de productos vendidos y el porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.
import java.util.Scanner;

public class IVA {
    public static void main(String [] args){
    var sc = new Scanner(System.in);
    System.out.println("Por favor ingrese el nombre del producto");
    var nombreProducto = sc.nextLine();
    System.out.println("Por favor ingrese el valor por unidad sin IVA del producto");
    Double valorUProducto = sc.nextDouble();
    System.out.println("Por favor ingrese la cantidad vendida del producto");
    Double cantidadVendido = sc.nextDouble();
    System.out.println("Por favor ingrese el % IVA aplicado al producto");
    Double porivaAplicado = sc.nextDouble();
    Double ivaAplicado = (porivaAplicado/100);
    Double precioVenta = (valorUProducto + (valorUProducto * ivaAplicado));
    Double dineroRecaudado = (precioVenta*cantidadVendido);

    System.out.println("El producto " + nombreProducto + " tiene un valor unitario de " + precioVenta + " para venta al público");
    System.out.println("El producto " + nombreProducto + " recaudo en ventas un total de " + dineroRecaudado);
    sc.close();
    }
}
