package arreglos;

// import java.util.Random;

public class Arrays {

    public void firstArray() {
        int[] numeros = new int[3];
        numeros[0] = 13;
        numeros[1] = 31;
        numeros[2] = 13;
        printArray(numeros);
    }

    public void arrayOf42() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 42;
        }
        printArray(arr);
    }

    public void fillOf42(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 42;
        }
        printArray(arr);
    }

    public void secondArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        printArray(arr);
    }

    public void thirdArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        printArray(arr);
    }

    public void fourthArray() {
        int[] arr = { 21, 26, 36, 44, 59, 2, 24, 29, 44, 47, 54, 2 };
        printArray(arr);
    }

    public void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    public void printStringArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    public void fibonnaci(int terminos) {
        int[] fibonacci = new int[terminos];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < terminos; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
        printArray(fibonacci);
    }

    public void eratostenes(int numero) {
        boolean[] eratostenes = new boolean[numero];
        for (int i = 2; i < eratostenes.length; i++) {
            if (!eratostenes[i]) {
                System.out.println(i + " es primo.");
                for (int sonda = 2 * i; sonda < numero; sonda += i) {
                    eratostenes[sonda] = true;
                }
            }
        }
    }

    public void stringArray() {
        String[] neruda = new String[4];
        printStringArray(neruda);
    }

    public void curso() {
        Estudiante[] progra = new Estudiante[3];
        String[] nombresDeAlumnos = { "Gael", "Alejandro", "Samuel" };
        for (int i = 0; i < progra.length; i++) {
            progra[i] = new Estudiante(nombresDeAlumnos[i]);
        }
        for (int i = 0; i < progra.length; i++) {
            progra[i].saludar();
            progra[i].presentarse();
        }
    }

    public void tiposDeDatos() {
        int a = 13;
        int b = 31;
        System.out.println(a + b);

        boolean a1 = true;
        boolean b2 = false;
        System.out.println(a1 && b2);

        String s = "Yaaaaaa";
        System.out.println(s.toUpperCase());

        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 13;
        }
        int[] arr2 = arr.clone();
        printArray(arr2);
    }

    public void primeraMatriz() {
        int [][] mat = new int [2][3];
        mat [0][0] = 42;
    }

    public void llenarde42(int[][] mat) {
        for(int i = 0;  i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = 42;
            }
        }
    }

    public void matrizDiagonal(int numero) {
        int [][] mat = new int [numero][numero];
        for(int i = 0;  i < numero; i++) {
            mat[i][i] = 42;
        }
    }

    public void printMatriz(int [][] mat) {
        for (int i = 0;  i < mat.length; i++) {
            System.out.print("[");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);    
                if (j < mat[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    }
    public void invertirArreglo(int[] arr) {
        arr[0] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) { 
            arr[i] = arr[arr.length - i];
        }
    }
    public void printMatriz2(int [][] mat) {
        for (int i = 0;  i < mat.length; i++) {
            printArray(mat[i]);
        }
    }
}