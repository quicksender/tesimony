package homework5;


    public class Cat6 {
            private String name;
            private int weight;
            private int age;
            private String color;
            private String address;

            Cat6(String name){
                this.name = name;
                this.weight = 7;
                this.age = 3;
            }
            Cat6(String name, int weight, int age){
                this.name = name;
                this.weight = weight;
                this.age = age;
            }

            Cat6(String name,  int age){
                this.name = name;
                this.weight = 7;
                this.age = age;
            }
            Cat6(int weight, String color){
                this.weight = weight;
                this.color = color;
                this.age = 3;
            }
            Cat6(int weight, String color, String address){
                this.weight = weight;
                this.color = color;
                this.address = address;
                this.age = 3;
            }
        }
