package Iterator;
public class MainEntry{

    public static void main(String[] args){

        Item[] items = {
            new Item("CPU", 1000),
            new Item("KeyBoard", 2000),
            new Item("Mouse", 3000),
            new Item("HDD", 4000)
        };
        
        Array array = new Array(items);
        Iterator it = array.iterator();

        while(it.next()){
            Item item = (Item)it.current();
            System.out.println(item);
        }

    }

}