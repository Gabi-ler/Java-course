public class ForYArray {
    public static void main(String[] args) {
        String [] androidVersion = new String[17];

        androidVersion[0]= "Apple Pie";
        androidVersion[1]= "Banana Bread";
        androidVersion[2]= "Cupcake";
        androidVersion[3]= "Donuts";

        int o = 1;
        while(o <= 10)

        System.out.println(++o);





        /*System.out.println(androidVersion[0]);
        System.out.println(androidVersion[1]);
        System.out.println(androidVersion[2]);
        System.out.println(androidVersion[3]);*/

        //este ejemplo indica las veces que quiero iterar ese array atra ves del indice
        /*for (int i = 0; i <= 3; i++) {
            System.out.println(androidVersion[i]);
        }
        //otra opcion es itera la longitud del array con length
        /*for (int i = 0; i < androidVersion.length; i++) {
            System.out.println(androidVersion[i]);
        }*/

        //esto es un foreach que itera todo el array
        for (String androidVers : androidVersion) {
            System.out.println(androidVers);
        }


        //en el caso de imprimir una variable entera vacia da 0
        // en el caso de imprimir una variable string vacia da null

        String [][] cities = new String[4][2];
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotà";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";

        /*for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }*/

        for (String [] city : cities) {
            for (String name : city) {
                System.out.println(name);
            }
        }

        String [][][][] animals = new String [2][3][2][2];
        animals [1][0][0][1] = "Monkey";
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
    }
}
