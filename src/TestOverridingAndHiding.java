/**
 * Created by a1 on 2017-04-30.
 */
public class TestOverridingAndHiding {
    public static void main(String[] arc){

        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod(); // the static method in Animal
        myAnimal.testInstanceMethod(); // the static method in Cat

    }
}

class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }




}