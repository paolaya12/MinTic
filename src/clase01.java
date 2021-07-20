public class clase01 {
    
    public static void main(String[] args){
        var nombre = "Cesar Díaz";
        var resultado = saludo(nombre);
        System.out.println(resultado);
    }
    public static String saludo(String nombre){
        return "Hola " + nombre + "!";
    }
}
