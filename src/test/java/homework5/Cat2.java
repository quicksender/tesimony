package homework5;



public class Cat2 {
    private static int catsCount = 0;

    public static void addNewCat() {
        catsCount++;
    }
public static void main(String[] args) {
            addNewCat();
            addNewCat();
            addNewCat();
            System.out.println(catsCount);
        }

}
