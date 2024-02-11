package Startegy;

public class GaussSumStrategy implements SumStrategy {

    @Override
    public int get(int N) {
        return (1+N)*N/2;
    }
    
}
