import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.println("========== Введите целое число q >= 1 ===================");
        System.out.println("=========================================================");
        int q = scanner.nextInt();
        long[] massiv = new long[q];
        System.out.println("=========================================================");
        System.out.println("======= Введите " + q + " целых числа/чисел множества S =======");
        System.out.println("=========================================================");

        for (int i = 0; i < q; i++) {
            massiv[i] = scanner.nextLong();
        }
        long[] maxMassiv = new long[q]; // заведем массив для максимального XOR
        long maxim = 0L; // промежуточный максимум
        maxMassiv[0] = 0L; //
        if (q > 1) {
            for (int i = 1; i < q; i++) {
                for (int j = 0; j <= i; j++) {   // цикл попарного сравнения числа до i-го элемента
                    long xorIJ = massiv[i] ^ massiv[j];
                    if (xorIJ > maxim) {
                        maxim = xorIJ;
                    }
                }
                maxMassiv[i] = maxim;
            }
        }

        System.out.println("=========================================================");
        for (int i = 0; i < q; i++) {
            System.out.println(" После первых i = " + (i + 1) + " операций наш максимальный XOR = " + maxMassiv[i]);
        }
        System.out.println("=========================================================");

    }
}