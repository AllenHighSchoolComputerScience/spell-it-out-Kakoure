/**
 * Created by 230645 on 11/28/2017.
 */
public class item {
    private String Id;
    private String Name;
    private double Price;
    item(String id, String name, double price){
        Id = id;
        Name = name;
        Price = price;
    }
    public String returnId(){
        return Id;
    }
    public String returnName(){
        return Name;
    }
    public double returnPrice(){
        return Price;
    }
    public String toString(){
        String ret  = "";
        ret += Id + " " + Name + " ";
        ret += ".";
        return ret;
    }

}
