public class CondicionalesElseIf {

    public static void main(String[] args) {

        int hora = 8;

        // buenos dias
        if (hora >= 00 && hora <= 12) {
            System.out.println("Buenos dias");
            // buenas tardes
        } else if (hora >= 13 && hora < 18) {
            System.out.println("Buenas tardes");
            // buenas noches
        } else if (hora >= 18 && hora <= 23) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("Esta hora no existe");
        }

    }

}
