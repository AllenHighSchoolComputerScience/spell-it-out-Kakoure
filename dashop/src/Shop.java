/**
 * Created by 230645 on 11/15/2017.
 */
import java.util.InputMismatchException;
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


        boolean betaLoop = true;
        boolean alphaLoop = true;
        boolean checking;
        int pluRead = 0;
        double weight;
        String decide;
        double totalCost = 0;
        while (alphaLoop) {
            System.out.println("Welcome to the Shop! Enter a PLU code or 0 to finish shopping.");
            while (betaLoop) {
                pluRead = inputs.nextInt();
                checking = true;
                numProducts = 0;
                if (pluRead == 0) {
                    betaLoop = false;
                } else {
                    while (checking) {
                        if (pluRead == products[numProducts].checkCode()) {
                            checking = false;
                        } else {
                            if (products[numProducts].checkCode() == -1) {
                                checking = false;
                            } else {
                                numProducts++;
                            }
                        }
                    }
                    if (products[numProducts].checkCode() == -1) {
                        System.out.println("PLU Code not found. Please try again...");
                    } else {
                        System.out.print("You have selected ");
                        System.out.print(products[numProducts].checkName());
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
            System.out.print("Your total cost is $");
            System.out.print(totalCost);
            System.out.println(". Have a nice day!");
            System.out.println("Would you like to shop again? (y/n)");
            checking = true;
            while(checking) {
                decide = inputs.next();
                if (decide.equals("y")){
                    checking = false;
                    betaLoop = true;
                    System.out.println("Okay!");
                } else if (decide.equals("n")){
                    checking = false;
                    alphaLoop = false;
                    System.out.println("Okay, Goodbye.");
                } else {
                    System.out.println("Input not recognized. Please try again.");
                }
            }
        }
    }

}
