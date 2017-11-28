/**
 * Created by 230645 on 11/28/2017.
 */
import java.util.Scanner;
import java.io.File;
public class Deli {
    public static void main(String args[])throws Exception{
        Scanner inputs = new Scanner(System.in);
        Scanner readMenu = new Scanner(new File("menu.txt"));
        helpers helper = new helpers();
        String tempId = "";
        String tempName = "";
        double tempPrice = 0.0;
        int i = 0;
        int numItems = 0;
        item[] items = new item[100];
        while (readMenu.hasNext()){
            tempId = readMenu.next();
            tempName = readMenu.next();
            tempPrice = readMenu.nextDouble();
            items[numItems] = new item(tempId, tempName, tempPrice);
           // System.out.println(items[numItems].toString());
            numItems++;
        }
        boolean looping = true;
        boolean checking = true;
        String[] idList = new String[100];
        item[] cart = new item[100];
        int cartTracker = 0;
        String order = "";
        while(looping){
            inputs.reset();
            System.out.println("Enter your order.");
            order = inputs.nextLine();
            i = 0;
            cartTracker = 0;
            cart = new item[100];
            idList = helper.splitString(order);
/*
            for(i = 0; i < idList.length;i++){
                System.out.println(idList[i]);
            }
*/
            for(int j = 0; j < idList.length;j++) {
                checking = true;
                i = 0;
                while(checking){
                    //System.out.println(idList[j]+ " " + items[i].returnId());
                    if (items[i].returnId().equals("-1")){
                        checking = false;

                    }
                    if (idList[j].equals(items[i].returnId())){
                        checking = false;

                        cart[cartTracker] = items[i];
                        cartTracker++;


                    }
                    i++;
                }
            }
            System.out.println(cartTracker);
            for (i = 0; i < cartTracker;i++){
                System.out.println(cart[i].toString());
            }

        }
    }
}
