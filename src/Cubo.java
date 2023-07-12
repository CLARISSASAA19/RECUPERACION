import java.util.Scanner;

public class Cubo extends Figura{
    double d1;
    @Override
    double CalcularArea() {
        double areacubo= 6*Math.pow(calcularDistancia(0,1),2);
        return areacubo;

    }

    @Override
    double CalcularPerimetro() {
        d1= calcularDistancia(0,1);
        double perimetrocubo=d1*12;
        return perimetrocubo;
    }

    @Override
    void IngresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<2; i++ ){
            System.out.println("Ingrese las coordenadas en x "+i+": ");
            double x = sc.nextDouble();
            System.out.println("Ingrese las coordenada en y "+i+": ");
            double y = sc.nextDouble();
            System.out.println("Ingrese las coordenadas en z "+i+": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x,y,z));

        }


    }

    @Override
    double CalcularVolumen() {
        double volumencubo= Math.pow(d1,3);
        return volumencubo;
    }

}