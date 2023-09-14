package Lab_1;
import java.util.* ;

public class Data {
    public static int inputN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size N: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public static List<Integer> inputVector(int N) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vector: ");
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            resultList.add(Integer.parseInt(scanner.nextLine()));
        }
        return resultList;
    }
    public static int[][] inputMatrix(int N) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix: ");
        int[][] resultMatrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                resultMatrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        return resultMatrix;
    }

    //заповнити random
    public static List<Integer> fillRandomVector(int sizeN) {
        List<Integer> vector = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < sizeN; i++) {
            vector.add(rand.nextInt(100));
        }
        return vector;
    }

    public static int[][] fillRandomMatrix(int sizeN) {
        int[][] generateMatrix = new int[sizeN][sizeN];
        Random rand = new Random();
        for (int i = 0; i < sizeN; i++) {
            for(int j=0;j<sizeN;j++) {
                generateMatrix[i][j]=rand.nextInt(-100, 100);
            }
        }
        return generateMatrix;
    }

    public static void multiplicationTwoMatrix(int[][] firstMatrix, int[][]
            secondMatrix, int[][] matrixMultiplication) {
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[0].length; j++) {
                for (int k = 0; k < secondMatrix.length; k++)
                    matrixMultiplication[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
            }
        }
    }

    public static List<Integer> multiplicationVectorToMatrix(List<Integer> vector, int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int number = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                number += matrix[j][i] * vector.get(j);
            }
            result.add(number);
            number = 0;
        }
        return result;
    }

    public static void addTwoMatrix(int[][] firstMatrix, int[][]
            secondMatrix, int[][] matrixADD) {
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[0].length; j++) {
                    matrixADD[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
    }

    public static List<Integer> subtractTwoVector(List<Integer> list1, List<Integer> list2) {
        List<Integer> returnList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            returnList.add(list1.get(i) - list2.get(i));
        }
        return returnList;
    }
    public static int findMatrixMinValue(int[][] matrix){
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .min().getAsInt();
    }

    public static void printMatrix(int[][] resultMatrix) {
        for (int[] l : resultMatrix) {
            System.out.println(Arrays.toString(l));
        }
    }
}