public class Functions {
    public static void main(String[] args) {
        double y = 3;
        System.out.println(Math.PI * Math.pow(y,2));//me devuelve el area de un circulo

        double area = circleArea(y);
        System.out.println(area);

        System.out.println(sphereArea(y));

        sphereVolumen(y);

        double quantity;
        String currency;
        System.out.println("dolares a pesos " + converToDolar(quantity=200, currency="pesos"));
        
    }

    //las funciones deben vivir al mismo nivel del main en este caso
    public static double circleArea(double r){
        return Math.PI * Math.pow(r ,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r ,2);

    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r ,3);
    }
    /*
    * Forma de comentar varias lineas que el compilador no ve
    *
     */

    //en cambio el de abajo

    /**
     * el compilador si los ve!
     * Funcion que convierte moneda de peso a dolar y viceversa
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: solo acepta pesos o dolares
     * @return quantity devuelve la cantidad cnvertida tanto en peso como dolar
     */

    public static double converToDolar(double quantity, String currency){
        switch (currency){
            case "pesos":
                quantity = quantity * 370;
                break;
            case "dolar":
                quantity = quantity / 370;
                break;
        }
        return quantity;
    }

}
