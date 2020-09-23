package inheritance;

public class Shop {
    private String name;
    private String price;
    private String desc;

//=========== Shop Constructor ================
    public Shop(String name, String price, String desc){
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    //========== Getters & Setters ==========
    public String getName() { return name; }
    public void setName(String name) { this.name = name;}

    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }

    public String getDesc() { return desc; }
    public void setDesc(String desc) { this.desc = desc; }

    //=========== Methods ===================
    public String toString(){
        return String.format("%s  price: %s,  %s", name, price, desc);
    }


}
