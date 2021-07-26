package co.edu.utp.misiontic2022.c2;

public final class MiPrimerClase {
    private static final Double PI = 3.1416;
    private Integer contador = 0;

    public void incrementarcontador(){
        contador += contador;
        return contador;
    }

    public Integer getContador(){
        return contador;
    }

    public void setContador(Integer c){
        contador = c;
    }
}
