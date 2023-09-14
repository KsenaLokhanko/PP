package Lab_1;

/** Лабораторна робота №1
 *  Варінат 1.05, 2.29, 3.24
 *  F1: C = A *(MA*ME) - B
 *  F2: MF = (MG + MH)*(MK * ML)*(MG + ML)
 *  F3: s=MIN(MO*MP+MS)
 *  Лоханько Ксенія ІО-11
 *  .09.2023
 */
public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Lab1 is started");
        Thread T1 = new Thread(new T1());
        Thread T2 = new Thread(new T2());
        Thread T3 = new Thread(new T3());
        T1.start();
        T2.start();
        T3.start();

        try {
            T1.join();
            T2.join();
            T3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Lab1 is finished");
    }
}
