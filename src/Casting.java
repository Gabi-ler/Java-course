public class Casting {
    public static void main(String[] args) {
        // En un año ubicar 30 perritos
        // Cuantos perritos ubique al mes = 2.5

        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs);// 2.5 dato double

        //estimacion real
        int estimatedMonthlyDogs = (int) monthlyDogs; //lo parsea a entero
        System.out.println(estimatedMonthlyDogs);
        // cuando agrego int a un valor ya sea resultado u operacion se enteriza
        // cuando agrego double a un valor ya sea resultado u operacion se hace decimal
     }
}
