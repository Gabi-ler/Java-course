public class Array {
    public static void main(String[] args) {
        String [] androidVersion = new String[17];
        String days[] = new String[7];

        String [][] cities = new String[4][2]; //4 es fila y 2 es columnas

        int [][][] numbers = new int [2][2][2]; //dos filas, dos columnas y dos paginas
        int [][][][] numbers4 = new int [2][2][2][2]; //

        androidVersion[0]= "Apple Pie";
        androidVersion[1]= "Banana Bread";
        androidVersion[2]= "Cupcake";
        androidVersion[3]= "Donuts";

        System.out.println(androidVersion[0]);
        System.out.println(androidVersion[1]);
        System.out.println(androidVersion[2]);
        System.out.println(androidVersion[3]);

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotà";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";

        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);

        String [][][][] animals = new String [2][3][2][2];
        animals [1][0][0][1] = "Monkey";
        System.out.println(animals [1][0][0][1]);
    }
}
