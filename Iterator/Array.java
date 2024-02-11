package Iterator;

public class Array implements Aggregator {
    private Item[] items;

    public Array(Item[] items) {
        this.items = items;
    }

    // getItem과 getCount는 "Iterator" 인터페이스의 구현체인 "ArrayIterator" 클래스에서 사용된다

    public Item getItem(int index) {
        return items[index];
    }

    public int getCount() {
        return items.length;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(this);
    }


}
