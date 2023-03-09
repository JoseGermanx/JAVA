public class Switch {

    public static void main(String[] args) {

        char vocal = 'a';
        char vocalCap = Character.toUpperCase(vocal);

        switch (vocalCap) {
            case 'A':
                System.out.println("Esta es la vocal A");
                break;
            case 'E':
                System.out.println("Esta es la vocal E");
                break;
            case 'I':
                System.out.println("Esta es la vocal I");
                break;
            case 'O':
                System.out.println("Esta es la vocal O");
                break;
            case 'U':
                System.out.println("Esta es la vocal U");
                break;

            default:
                System.out.println("Esta no es una vocal");
                break;
        }


        int mes = 45;
        String nombre_mes = "";

        switch (mes) {
            case 1:
                nombre_mes = "Enero";
                break;
            case 2:
                nombre_mes = "Febrero";
                break;
            case 3:
                nombre_mes = "Marzo";
                break;
            case 4:
                nombre_mes = "Abril";
                break;
            case 5:
                nombre_mes = "Mayo";
                break;
            case 6:
                nombre_mes = "Junio";
                break;
            case 7:
                nombre_mes = "Julio";
                break;
            case 8:
                nombre_mes = "Agosto";
                break;
            case 9:
                nombre_mes = "Septiembre";
                break;
            case 10:
                nombre_mes = "Octubre";
                break;
            case 11:
                nombre_mes = "Noviembre";
                break;
                default:
                System.out.println("Debes indicar un número de mes");
                break;
        }
        System.out.println(nombre_mes);
    }
}