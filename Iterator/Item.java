package Iterator;
public class Item {
    private String name; // �̸� �ʵ�
    private int cost; // ���� �ʵ�

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return "Item [name=" + name + ", cost=" + cost + "]";
    }
    
}
