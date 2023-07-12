import java.util.Scanner;


public class Circulo extends Figura{

    @Override
    double CalcularArea() {
        double areacirculo = Math.PI* Math.pow(calcularRadio(0,1),2);
        return areacirculo;
    }

    @Override
    double CalcularPerimetro() {
        double perimetrocirculo = 2* Math.PI*calcularRadio(0,1);
        return perimetrocirculo;
    }

    @Override
    void IngresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<2; i++ ){
            System.out.println("Ingrese la coordenada x "+i+": ");
            double x = sc.nextDouble();
            System.out.println("Ingrese la coordenada y "+i+": ");
            double y = sc.nextDouble();
            System.out.println("Ingrese la coordenada z "+i+": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x,y,z));

        }
    }

    @Override
    double CalcularVolumen() {
        return 0;
    }


}