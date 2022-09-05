package homework5;


public class Cat1 {
    private String name = "First";
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1();
        cat1.setName("Second");
        System.out.println(cat1.name);
    }
}