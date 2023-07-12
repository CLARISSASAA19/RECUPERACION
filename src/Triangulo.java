import java.util.Scanner;

public class Triangulo extends Figura{

    double d1;
    double d2;
    double d3;



    @Override
    double CalcularArea() {
        double area=Math.sqrt(CalcularPerimetro()/2*(CalcularPerimetro()/2-d1)*(CalcularPerimetro()/2-d2)*(CalcularPerimetro()/2-d3));
        return area;
    }

    @Override
    double CalcularPerimetro() {
        d1= calcularDistancia(0,1);
        d2= calcularDistancia(0,2);
        d3= calcularDistancia(1,2);
        double perimetrotriangulo=d1+d2+d3;
        return perimetrotriangulo;

    }

    @Override
    void IngresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<3; i++ ){
            System.out.println("Ingrese las coordenada en x "+i+": ");
            double x = sc.nextDouble();
            System.out.println("Ingrese las coordenada en y "+i+": ");
            double y = sc.nextDouble();
            System.out.println("Ingrese las coordenada en z ingrese 0 ya que esta figura es en coordenada x, y"+i+": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x,y,z));
        }
    }

    @Override
    double CalcularVolumen() {
        return 0;
    }
}