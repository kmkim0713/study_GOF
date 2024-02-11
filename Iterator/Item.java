package Iterator;
public class Item {
    private String name; // 이름 필드
    private int cost; // 가격 필드

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return "Item [name=" + name + ", cost=" + cost + "]";
    }
    
}
