/**
 * Created by 230645 on 11/15/2017.
 */
public class Product {
    private int pluCode;
    private String name;
    private double price;
    Product(int Id, String Name, double Price){
        pluCode = Id;
        name = Name;
        price = Price;
    }
    public int checkCode(){
        return pluCode;
    }
    public String checkName(){ return name;}
    public double checkPrice(){ return price;}
    public String toString(){
        String ret = "";
        ret += name;
        return ret;
    }
    public double findCost(double weight){
        double ret;
        ret = weight*price;
        ret = Math.round(ret*100);
        ret /= 100;
        return ret;
    }
}
