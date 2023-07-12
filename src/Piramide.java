import java.util.Scanner;

public class Piramide extends Figura{
    double d1;
    double d2;
    double d3;
    double d4;
    double d5;
    double d6;

    @Override
    double CalcularArea() {
        double areapiramide= (calcularDistancia(0,1)+calcularDistancia(0,2)+calcularDistancia(1,2))+(calcularDistancia(0,3)+ calcularDistancia(2,3)+calcularDistancia(1,3));
        return areapiramide;
    }

    @Override
    double CalcularPerimetro() {
        d1= calcularDistancia(0,1);
        d2= calcularDistancia(0,2);
        d3= calcularDistancia(1,2);
        d4= calcularDistancia(0,3);
        d5= calcularDistancia(2,3);
        d6= calcularDistancia(1,3);
        double perimetropiramide=d1+d2+d3+d4+d5+d6;
        return perimetropiramide;

    }

    @Override
    void IngresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<4; i++ ){
            System.out.println("Ingrese las coordenadas en x "+i+": ");
            double x = sc.nextDouble();
            System.out.println("Ingrese las coordenadas en y "+i+": ");
            double y = sc.nextDouble();
            System.out.println("Ingrese las coordenadas en z "+i+": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x,y,z));
        }

    }

    @Override
    double CalcularVolumen() {
        double volumenpiramide = (((d1+d2+d3)*d5)/3);
        return volumenpiramide;
    }
}
