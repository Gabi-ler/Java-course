public class Matematics {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        System.out.println(Math.ceil(x));//redondeo un entero para arriba = 3.0
        System.out.println(Math.floor(x));//redondeo un entero para abajo = 2.0
        System.out.println(Math.pow(x,y));//me devuelve el exponencial del primer valor x a la 3
        System.out.println(Math.max(x,y));//me devuelve el dato mayor
        System.out.println(Math.sqrt(y));//me devuelve la raiz cuadrada del valor que le asigne
        System.out.println(Math.PI * Math.pow(y,2));//me devuelve el area de un circulo
        System.out.println(4 * Math.PI * Math.pow(y,2));//me devuelve el area de una esfera
    }
}
