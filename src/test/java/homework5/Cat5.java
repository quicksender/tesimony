package homework5;


public class Cat5 {
    private static int catCount = 0;

    public static void main(String[] args) {
        Cat5 cat1 = new Cat5();
        cat1.catCount++;
        //implement here
        Cat5 cat2 = new Cat5();
        cat2.catCount++;
        //implement here
        System.out.println("Cats count is: " + Cat5.catCount);
    }

    }
