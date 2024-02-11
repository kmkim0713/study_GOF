package StartegyTest;

class SumPrinter {

    void print(SumStrategy startegy, int N) {
        System.out.printf("The Sum of 1 - %d : ", N);
        System.out.println(startegy.get(N));
    }
}