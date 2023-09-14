package Lab_1;

class T3 extends Thread {
    int N;
    int[][] MO, MP, MS;
    @Override
    public void run() {
        System.out.println("T3 is started");
        N = Data.inputN();
        if(N <= 3){
            MO = Data.inputMatrix(N);
            MP = Data.inputMatrix(N);
            MS = Data.inputMatrix(N);
        }else {
            MO = Data.fillRandomMatrix(N);
            MP = Data.fillRandomMatrix(N);
            MS = Data.fillRandomMatrix(N);
        }

        // F3: s=MIN(MO*MP+MS)
        int[][] XX = new int[N][N];
        int[][] XX1 = new int[N][N];
        Data.multiplicationTwoMatrix(MO, MP, XX); //MO*MP=XX
        Data.addTwoMatrix(XX, MS, XX1); //XX+MS=XX1
        int s = Data.findMatrixMinValue(XX1);

        System.out.println("s: " + s);
        System.out.println("T3 is finished");
    }
}