public class IfStatement {
    public static void main(String[] args) {

        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            fileSended++;
            System.out.println("archivo enviado");
        } else {
            fileSended--;
            System.out.println("Porfavor encienda el bluetooth");
        }
        System.out.println(fileSended);
    }
}
