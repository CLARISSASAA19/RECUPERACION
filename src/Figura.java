import java.util.ArrayList;
import java.util.List;

public abstract class Figura {


    List<Punto> listaPuntos = new ArrayList<>();

    double calcularDistancia(int i, int j){
        Punto punto1 =listaPuntos.get(i);
        Punto punto2 =listaPuntos.get(j);
        double distancia= Math.sqrt(Math.pow(punto1.getX()- punto2.getX(),2)+Math.pow(punto1.getY()- punto2.getY(),2)+Math.pow(punto1.getZ()- punto2.getZ(),2));
        return distancia;
    }
    double calcularRadio(int i, int j){
        Punto punto1=listaPuntos.get(i);
        Punto punto2 =listaPuntos.get(j);
        double radio= Math.sqrt(Math.pow(punto1.getX()- punto2.getX(),2)+Math.pow(punto1.getY()- punto2.getY(),2));
        return radio;
    }

    abstract void IngresarPuntos();
    abstract double CalcularPerimetro();
    abstract double CalcularArea();
    abstract double CalcularVolumen();



}
