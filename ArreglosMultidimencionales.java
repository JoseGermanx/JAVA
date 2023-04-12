
public class ArreglosMultidimencionales {

    public static void main(String[] args) {
        int[][] numeros = new int[3][3];
        int i, j;
        // recorrer filas
        for (i = 0; i < numeros.length; i++) {
            System.out.println();
            // recorrer columnas
            for (j = 0; j < numeros.length; j++) {
                System.out.print(numeros[i][j] + " ");

            }           
        }
        System.out.println();

        int[][] matriz = new int[2][2];
        int filas, columnas;

        matriz[0][0] = 45;
        matriz[0][1] = 4;
        matriz[1][0] = 78;
        matriz[1][1] = 65;

        for (filas = 0; filas < matriz.length; filas++) {
            System.out.println();
            for (columnas = 0; columnas < matriz.length; columnas++) {
                System.out.print(matriz[filas][columnas] + " ");
            }
        }
    }
}