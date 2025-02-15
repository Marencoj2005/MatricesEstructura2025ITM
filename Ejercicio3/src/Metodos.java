public class Metodos {
    // crear matriz
    public int[][] Makematriz(){
        int [][] matriz = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random()*(100-1)+1);
            }
        }
        return matriz;
    }

    public void sumaColumna(int [][] matriz){
        int[] resultadoSuma = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[j][i];
            }
            resultadoSuma[i] = suma;
        }
        for (int i = 0; i < resultadoSuma.length; i++) {
            System.out.println("Columna "+ i + ": "+ resultadoSuma[i]);
        }
    }
}
