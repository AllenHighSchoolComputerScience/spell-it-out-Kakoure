import sun.util.logging.PlatformLogger;

public class Main {

    public static void main(String[] args) {

        Level1 crypto1 = new Level1();
        Level2 crypto2 = new Level2();
        Level3 crypto3 = new Level3();
        Bonus cryptobonus = new Bonus();
        System.out.println("---------------------------");
        System.out.println("Level 1 Problem 1");
        System.out.println(crypto1.prob1());
        System.out.println("Level 1 Problem 2");
        System.out.println(crypto1.prob2());
        System.out.println("Level 1 Problem 3");
        System.out.println(crypto1.prob3());
        System.out.println("Level 1 Problem 4");
        System.out.println(crypto1.prob4());
        System.out.println("Level 1 Problem 5");
        System.out.println(crypto1.prob5());
        System.out.println("---------------------------");
        System.out.println("Level 2 Problem 1");
        System.out.println(crypto2.prob1());
        System.out.println("Level 2 Problem 2");
        System.out.println(crypto2.prob2());
        System.out.println("Level 2 Problem 3");
        System.out.println(crypto2.prob3());
        System.out.println("Level 2 Problem 4");
        System.out.println(crypto2.prob4());
        System.out.println("Level 2 Problem 5");
        System.out.println(crypto2.prob5());
        System.out.println("---------------------------");
        System.out.println("Level 3 Problem 1");
        System.out.println(crypto3.prob1());
        System.out.println("Level 3 Problem 2");
        System.out.println(crypto3.prob2());
        System.out.println("Level 3 Problem 3");
        System.out.println(crypto3.prob3());
        System.out.println("Level 3 Problem 4");
        System.out.println(crypto3.prob4());
        System.out.println("Level 3 Problem 5");
        System.out.println(crypto3.prob5());
        System.out.println("---------------------------");
        System.out.println("Bonus Problem 1");
        System.out.println(cryptobonus.bonusprob1());
        System.out.println("Bonus Problem 2");
        System.out.println(cryptobonus.bonusprob2());
        System.out.println("Bonus Problem 3");
        System.out.println(cryptobonus.bonusprob3());

}
}
