import java.util.Scanner;
public class Ciclos {
    public static void main(String[] args) {
        int response = 0;

        do{
            System.out.println("selecciona el numero de la opcion deseada");
            System.out.println("1. movies");
            System.out.println("2. movies");
            System.out.println("0. salir");

            Scanner entrada = new Scanner(System.in);
            response = Integer.valueOf(entrada.nextLine());

            switch(response){
                case 0:
                    System.out.println("gracias por su visita");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("series");
                    break;
                default:
                    System.out.println("selecciona una opcion correcta");
            }
        } while(response != 0);
        System.out.println("se termino el porgrama");
    }
}
