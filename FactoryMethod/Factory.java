package FactoryMethod;

public abstract class Factory {
    
    public Item create(String name){
        boolean bCreateable = this.isCreateable(name);

        if(bCreateable){
            Item item = this.createItem(name); // (추상메서드) 생성
            postprocessItem(name); // (추상메서드) 생성 후 후처리
            return item;
        }

        return null;
    }

    public abstract boolean isCreateable(String name);
    public abstract Item createItem(String name);
    public abstract void postprocessItem(String name);

}
