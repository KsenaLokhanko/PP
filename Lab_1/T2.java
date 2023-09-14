package Lab_1;

public class T2 extends Thread {

    int N;
    int[][]  MG, MH, MK, ML;
    @Override
    public void run() {
        System.out.println("T2 is started");
        N = Data.inputN();
        if (N <= 3) {
            MG = Data.inputMatrix(N);
            MH = Data.inputMatrix(N);
            MK = Data.inputMatrix(N);
            ML = Data.inputMatrix(N);
        } else {
            MG = Data.fillRandomMatrix(N);
            MH = Data.fillRandomMatrix(N);
            MK = Data.fillRandomMatrix(N);
            ML = Data.fillRandomMatrix(N);
        }

        // F2: MF = (MG + MH)*(MK * ML)*(MG + ML)
        int[][] XX1 = new int[N][N];
        int[][] XX2 = new int[N][N];
        int[][] XX3 = new int[N][N];
        int[][] XX = new int[N][N];
        int[][] MF = new int[N][N];

        Data.addTwoMatrix(MG, MH, XX1);
        Data.multiplicationTwoMatrix(MK, ML, XX2);
        Data.addTwoMatrix(MG, ML,XX3);
        Data.multiplicationTwoMatrix(XX1, XX2, XX);
        Data.multiplicationTwoMatrix(XX, XX3, MF);

        System.out.println("MF: ");
        Data.printMatrix(MF);
        System.out.println("T2 is finished");
    }
}