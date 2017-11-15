/**
 * Created by 230645 on 11/15/2017.
 */
import java.util.Scanner;
import java.io.File;
public class Shop {

    public static void main(String args[]) throws Exception{
        Scanner inputs = new Scanner(System.in);
        Scanner prodGet = new Scanner(new File("products.txt"));
        int tempId;
        String tempName;
        double tempPrice;
        Product products[] = new Product[100];
        int numProducts = 0;
        while (prodGet.hasNext()){
            tempId = prodGet.nextInt();
            tempName = prodGet.next();
            tempPrice = prodGet.nextDouble();
            products[numProducts] = new Product(tempId, tempName, tempPrice);
            numProducts++;
        }
        boolean loop = true;
        boolean checking;
        int pluRead;
        double weight;
        double totalCost = 0;
        System.out.println("Welcome to the Shop! Enter a PLU code or 0 to finish shopping.");
        while(loop){
            pluRead = inputs.nextInt();
            checking = true;
            numProducts = 0;
            while (checking){
                if (pluRead == products[numProducts].checkCode()){
                    checking = false;
                } else {
                    numProducts++;
                }
            }
            System.out.print("You have selected ");
            System.out.print(products[numProducts].name);
            System.out.println(". Please Enter Weight.");
            weight = inputs.nextDouble();
            totalCost += products[numProducts].findCost(weight);
            System.out.print("You have added $");
            System.out.print(products[numProducts].findCost(weight));
            System.out.print(" to your balance, for a total cost of $");
            System.out.print(totalCost);
            System.out.println(". Enter another PLU code or 0  to finish Shopping.");
        }
    }

}
