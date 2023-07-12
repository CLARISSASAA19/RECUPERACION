import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cuadrado extends Figura{
    double d1;


    @Override
    double CalcularArea() {

        double areacuadrado=calcularDistancia(0,1)*calcularDistancia(0,1);
        return areacuadrado;

    }

    @Override
    double CalcularPerimetro() {
        d1= calcularDistancia(0,1);
        double perimetro=d1*4;
        return perimetro;
    }

    @Override
    void IngresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<2; i++ ){
            System.out.println("Ingrese la coordenada x "+i+": ");
            double x = sc.nextDouble();
            System.out.println("Ingrese la coordenada y "+i+": ");
            double y = sc.nextDouble();
            System.out.println("Ingrese las coordenada en z ingrese 0 ya que esta figura es en coordenada x, y "+i+": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x,y,z));
        }
    }


    @Override
    double CalcularVolumen() {
        return 0;
    }

}