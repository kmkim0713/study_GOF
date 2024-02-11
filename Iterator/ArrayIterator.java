package Iterator;
public class ArrayIterator implements Iterator{
    
    private Array array; // Array 클래스의 객체를 "필드"로서 참조해야하므로 필요한 코드
    private int index; // 순서값을 반환하기 위해 필요한 코드
    
    public ArrayIterator(Array array) {
        this.array = array;
        this.index = -1;
    }

    @Override
    public boolean next() {
        index ++;
        return index < array.getCount();
    }

    @Override
    public Object current() {
        return array.getItem(index);
    }

}
