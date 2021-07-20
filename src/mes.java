import java.util.Scanner;
public class mes {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.println("Por favor, Ingrese el número correspondiente al mes que desea analizar");
        int mes = sc.nextInt();
        
        if (mes == 1){
            System.out.println(" El mes es enero y tiene 31 días");
        }
        else if (mes == 2){
            System.out.println(" El mes es febrero y tiene 28 días");
        }
        else if (mes == 3){
            System.out.println(" El mes es marzo y tiene 31 días");
        }
        else if (mes == 4){
            System.out.println(" El mes es abril y tiene 30 días");
        }    
        else if (mes == 5){
            System.out.println(" El mes es mayo y tiene 31 días");
        }
        else if (mes == 6){
            System.out.println(" El mes es junio y tiene 30 días");
        }
        else if (mes == 7){
            System.out.println(" El mes es julio y tiene 31 días");
        }    
        else if (mes == 8){
            System.out.println(" El mes es agosto y tiene 31 días");
        }
        else if (mes == 9){
            System.out.println(" El mes es septiembre y tiene 30 días");
        }
        else if (mes == 10){
            System.out.println(" El mes es octubre y tiene 31 días"); 
        }
        else if (mes == 11){
            System.out.println(" El mes es noviembre y tiene 30 días");
        }
        else if(mes == 12){
            System.out.println(" El mes es diciembre y tiene 31 días"); 
        }    
        else{
            System.out.println("Por favor ingrese un numero del 1 al 12.");
        }       
        sc.close();
    }  
}
