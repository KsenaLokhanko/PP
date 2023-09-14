package Lab_1;
 import java.util.List;

public class T1 extends Thread{
    int N;
    List<Integer> C, A, B;
    int[][] MA, ME;
    @Override
    public void run() {

        System.out.println("T1 is started");

        N = Data.inputN();
        if(N <= 3){
            A = Data.inputVector(N);
            B = Data.inputVector(N);
            MA = Data.inputMatrix(N);
            ME = Data.inputMatrix(N);
        }else {
            A = Data.fillRandomVector(N);
            B = Data.fillRandomVector(N);
            MA = Data.fillRandomMatrix(N);
            ME = Data.fillRandomMatrix(N);
        }

        // F1: C = A *(MA*ME) - B
        int[][] XX = new int[N][N];
        List<Integer> V;
        Data.multiplicationTwoMatrix(MA, ME, XX); //MA*ME=XX
        V = Data.multiplicationVectorToMatrix(A, XX); //A*XX=V
        C = Data.subtractTwoVector(V, B);

        System.out.println("С: " + C);
        System.out.println("T1 is finished");
    }
}