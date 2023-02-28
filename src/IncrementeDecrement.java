public class IncrementeDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1; //es igual a 4
        System.out.println(lives);
        //de esta forma de abajo es igual
        lives--;//3
        System.out.println(lives);
        lives++;//sumo uno mas = 4
        System.out.println(lives);

        //forma prefija
        //int gift = 100 + lives++ ;//subfijo el signo mas actua dif a prefijo
        int gift = 100 + ++lives;//de esta forma obitne e dato incrementado
        System.out.println(gift);
    }
}
