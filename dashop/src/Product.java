/**
 * Created by 230645 on 11/15/2017.
 */
public class Product {
    int pluCode;
    String name;
    double price;
    Product(int Id, String Name, double Price){
        pluCode = Id;
        name = Name;
        price = Price;
    }
    public int checkCode(){
        return pluCode;
    }
    public String toString(){
        String ret = "";
        ret += name;
        return ret;
    }
    public double findCost(double weight){
        double ret;
        ret = weight*price;
        ret = Math.round(ret*100)/100;
        return ret;
    }
}
