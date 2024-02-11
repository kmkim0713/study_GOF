package Iterator;
public interface Iterator {
    boolean next(); // Aggregator의 다음 데이터를 반환할 수 있으면 true, 없으면 false
    Object current(); // 구성데이터를 반환하며, 데이터의 타입은 알 수 없으므로 Object 타입 
}
