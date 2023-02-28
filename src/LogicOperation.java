public class LogicOperation {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //operadores de asignacion
        System.out.println("a es igual a b? --> " + (a == b));//no, es false
        System.out.println("a es igual a b? --> " + (a != b));//es true

        //operadores relacionales
        System.out.println("a es igual a b? --> " + (a > b));// es true
        System.out.println("a es igual a b? --> " + (a < b));//es false
        System.out.println("a es igual a b? --> " + (a >= b));//es true
        System.out.println("a es igual a b? --> " + (a <= b));//es false

        if (a == b) {
            System.out.println("a es igual a b");
        } else if((a != b) && (a > b)){
            System.out.println("a es distinto y mayor a b");
        }else if(a != b){
            System.out.println("a es distinto a b");
        } else if (a > b){
            System.out.println("a es mayor a b");
        }else if (a < b){
            System.out.println("a es menor a b");
        }else if (a >= b){
            System.out.println("a es mayor o igual a b");
        }else if (a <= b){
            System.out.println("a es menor o igual a b");
        }

    }
}
