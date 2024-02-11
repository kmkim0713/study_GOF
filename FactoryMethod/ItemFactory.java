package FactoryMethod;

import java.util.HashMap;

public class ItemFactory extends Factory{

    // 내부클래스 ItemData.
    // ItemData라는 내부클래스는 각 아이템의 최대 생성 갯수와 현재 갯수를 관리하기 위한 클래스
    private class ItemData {
        int maxCount ;
        int currentCount ;

        ItemData(int maxCount){
            this.maxCount = maxCount;
        }
    }

    // 현재 item 별로 생성된 갯수를 관리하기 위한 필드
    private HashMap<String, ItemData> repository;

    public ItemFactory(){
        repository = new HashMap<String, ItemData>();
        repository.put("sword", new ItemData(3));
        repository.put("shield", new ItemData(2));
        repository.put("bow", new ItemData(1));
    }


    @Override
    public boolean isCreateable(String name) {
        ItemData itemData = repository.get(name);

        if(itemData == null){
            System.out.println(name + "is not usefull item");
            
            return false;
        }

        if(itemData.currentCount >= itemData.maxCount){
            System.out.println(name + "is out of stock");

            return false;
        } 

        return true;
    }

    @Override
    public Item createItem(String name) {
        Item item = null;
        if(name == "sword") item = new Sword();
        if(name == "shield") item = new Shield();
        if(name == "bow") item = new Bow();

        return item;
    }

    @Override
    public void postprocessItem(String name) {
        ItemData itemData = repository.get(name);
        if(itemData != null) itemData.currentCount++;
    }
    
}
