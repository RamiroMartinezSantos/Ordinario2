package Pojo;

public class SacarPromedio {
    public Double promedio(Double parcial1, Double parcial2, Double parcial3, Double ordinaro){
        Double parcial;
        Double promedio;
        parcial = (parcial1 + parcial2 + parcial3)/3;
        promedio = (parcial + ordinaro)/2;
        return promedio;
    }
}
