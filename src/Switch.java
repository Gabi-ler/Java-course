public class Switch {
    public static void main(String[] args) {
        String colorModeSelected = "Light";

        switch(colorModeSelected) {
            case "Light":
                System.out.println("seleccionaste light mode");
                break;
            case "Night":
                System.out.println("seleccionaste night mode");
                break;
            case "BlueDark":
                System.out.println("seleccionaste blue Dark mode");
                break;
            case "Dark":
                System.out.println("seleccionaste dark mode");
                break;
            default:
                System.out.println("seleccionaste una opcion valida");

        }
    }
}
