import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cats = 1 + (int)(Math.random() * 3);
        int dogs = 1 + (int)(Math.random() * 3);
        int tigers = 1 + (int)(Math.random() * 3);
        int total = cats + dogs + tigers;
        Animal[] animals = new Animal[total];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < cats; i++){
            System.out.println("Insert cat name:");
            Cat cat = new Cat(in.next());
            animals[i] = cat;
        }
        for(int i = cats; i < cats + dogs; i++){
            System.out.println("Insert dog name:");
            Dog dog = new Dog(in.next());
            animals[i] = dog;
        }
        for(int i = cats + dogs; i < total; i++){
            System.out.println("Insert tiger name:");
            Tiger tiger = new Tiger(in.next());
            animals[i] = tiger;
        }
        cats = 0; dogs = 0; tigers = 0;
        Cat cat = new Cat("");
        Dog dog = new Dog("");
        Tiger tiger = new Tiger("");
        for(int i = 0; i < total; i++){
            animals[i].Run((int)(1 + Math.random() * 1000));
            animals[i].Swim((int)(1 + Math.random() * 1000));
            if(animals[i].getClass().equals(cat.getClass())){
                cats++;
            }
            if(animals[i].getClass().equals(dog.getClass())){
                dogs++;
            }
            if(animals[i].getClass().equals(tiger.getClass())){
                tigers++;
            }
        }
        System.out.println("Cats count: " + cats);
        System.out.println("Dogs count: " + dogs);
        System.out.println("Tigers count: " + tigers);
    }
}