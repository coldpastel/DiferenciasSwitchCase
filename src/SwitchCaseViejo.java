public class SwitchCaseViejo {
    public static void main(String[] args) {
        int dia = 3;

        String nombreDia = "";

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves o Viernes";
                break;
            default:
                nombreDia = "Día no válido";
                break;
        }

        System.out.println("Hoy es: " + nombreDia);
    }
}
