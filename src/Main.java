import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        List<Figura> listaFiguras = new ArrayList<>();
        List<Figura> calcularArea = new ArrayList<>();
        List<Figura> perimeTro = new ArrayList<>();
        List<Figura> volumen = new ArrayList<>();


        do {
            System.out.println("+--------------------------------+");
            System.out.println("|     Seleccione una opción      |");
            System.out.println("+--------------------------------+");
            System.out.println("| 1) Triángulo                   |");
            System.out.println("| 2) Piramide                    |");
            System.out.println("| 3) Círculo                     |");
            System.out.println("| 4) Esfera                      |");
            System.out.println("| 5) Cuadrado                    |");
            System.out.println("| 6) Cubo                        |");
            System.out.println("| 7) Figuras ingresadas          |");
            System.out.println("| 8) Salir                       |");
            System.out.println("+--------------------------------+");
            System.out.println("Ingrese una opción: ");


            opcion = scanner.nextLine().charAt(0);

            switch (opcion) {
                case '1':
                    Triangulo tr = new Triangulo();
                    tr.IngresarPuntos();
                    listaFiguras.add(tr);
                    calcularArea.add(tr);
                    perimeTro.add(tr);
                    break;
                case '2':
                    Piramide pi  = new Piramide();
                    pi.IngresarPuntos();
                    listaFiguras.add(pi);
                    calcularArea.add(pi);
                    perimeTro.add(pi);
                    volumen.add(pi);

                    break;
                case '3':
                    Circulo ci = new Circulo();
                    ci.IngresarPuntos();
                    listaFiguras.add(ci);
                    calcularArea.add(ci);
                    perimeTro.add(ci);
                    break;
                case '4':
                    Esfera es = new Esfera();
                    es.IngresarPuntos();
                    listaFiguras.add(es);
                    calcularArea.add(es);
                    perimeTro.add(es);
                    volumen.add(es);

                    break;
                case '5':
                    Cuadrado cu = new Cuadrado();
                    cu.IngresarPuntos();
                    listaFiguras.add(cu);
                    calcularArea.add(cu);
                    perimeTro.add(cu);

                    break;
                case '6':
                    Cubo cb = new Cubo();
                    cb.IngresarPuntos();
                    listaFiguras.add(cb);
                    calcularArea.add(cb);
                    perimeTro.add(cb);
                    volumen.add(cb);

                    break;
                case '7':
                    if (listaFiguras.isEmpty()) {
                        System.out.println("Ninguna figura fue seleccionada.");
                    } else {
                        System.out.println("+--------------------------------+");
                        System.out.println("|      Figuras y Puntos          |");
                        System.out.println("+--------------------------------+");
                        for (Figura figura : listaFiguras) {
                            System.out.println("| " + ( figura.getClass().getSimpleName()) + " |");
                            for (Punto punto : figura.listaPuntos) {
                                System.out.println("| Punto: (" + punto.getX() + ", " + punto.getY() + ", " + punto.getZ() + ")");
                            }
                            System.out.println("| Área: " +( figura.CalcularArea()) + " |");
                            System.out.println("| Perímetro: " + ( figura.CalcularPerimetro()) + " |");
                            if (volumen.contains(figura)) {
                                System.out.println("| Volumen: " +( figura.CalcularVolumen()) + " |");
                            }
                            System.out.println("+--------------------------------+");
                        }
                    }
                    break;

                case '8':
                    System.out.println("Finalizacion de programa");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción del listado.");
                    break;
            }
        } while (opcion != '8');

    }
}
