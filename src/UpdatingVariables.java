public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono $200
        salary = salary + 200;
        System.out.println(salary);

        //pension: $50
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extras $30 c/u
        //Comida: $45

        salary = salary + (2*30) - 45;
        System.out.println(salary);

        //actualizando cadenas de texto
        String employeeName = "Gabriel Lerda";
        employeeName = employeeName + " Sorbera";
        System.out.println(employeeName);

        employeeName = "Alejandro " + employeeName;
        System.out.println(employeeName);
    }
}
