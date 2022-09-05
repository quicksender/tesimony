package homework5;

public class Text {
    public static void main(String[] args) {
        Cat cat1 = new Cat("pet1", 9, 9, 9);
        Cat cat2 = new Cat("pet1", 3, 6, 5);
        Cat cat3 = new Cat("pet1", 5, 7, 3);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}


//1. Create class Cat
//    1.1. Create class Cat
//    1.2. Cat should have name (String), age (int), weight (int)
//    1.3. Create getters and setters for each variable
//2. Implement method fight
//    2.1. Create method - boolean fight(Cat anotherCat)
//    2.2. Implement the method with the logic of fighting the cats
//         that depends on weight, age and strength.
//         The method should calculate the result of fighting, did we win(this)
//         and if yes - return true, if no - return false
//         Should calculate next condition:
//         if cat1.fight(cat2) == true -> cat2.fight(cat1) == false
//3. Create 3 object of Cat
//    3.1. In the method main create 3 object of type Cat, fill them with data
//4. Create 3 rounds of fight in pairs between the cats.
//5. The result of each fight print to the console