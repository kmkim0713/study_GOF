package FactoryMethod;

public class MainEntry {
    public static void main(String[] args) {
        
        ItemFactory factory = new ItemFactory();

        for (int i=0; i < 5; i++){
            Item item = factory.create("sword");
            if(item != null)item.use();
        }

    }
}
