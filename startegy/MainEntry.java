package startegy;

public class MainEntry {
    
    public static void main(String[] args) {
        SumPrinter cal = new SumPrinter();

        // SumPrinter 클래스는 print 메소드가 있고 이 print 메소드는 "SumStrategy" 인터페이스를 파라미터로 받는다
        // "SumStrategy"인터페이스를 구현한 구현체를 "SumPrinter"클래스의 print()메소드의 인자로 넣을 수 있으므로
        // 이로서 SumPrinter 클래스의 print() 메소드를 수행시 
        // "SumStrategy"를 구현한 구현체를 자유롭게 넣을 수 있다.
        cal.print(new SimpleSumStrategy(), 10);
        cal.print(new GaussSumStrategy(), 10);
    }

}
