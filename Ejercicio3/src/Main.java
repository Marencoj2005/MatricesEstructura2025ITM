public class Main {
/*
* 3.Realice un algoritmo que llene una matriz de 5 * 5.
* Calcular la suma de cada fila y almacenarla en un vector,
* la suma de cada columna y almacenarla en otro vector.
 * */

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int[][] matrix = metodos.Makematriz();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        metodos.sumaColumna(matrix);

    }
}