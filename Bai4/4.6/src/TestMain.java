public class TestMain {
    public static void main(String[] args) {
        Animal a = new Animal("Generic Animal");
        System.out.println(a);

        Mammal m = new Mammal("Generic Mammal");
        System.out.println(m);

        Cat c = new Cat("Tom");
        System.out.println(c);
        c.greets();

        Dog d1 = new Dog("Spike");
        Dog d2 = new Dog("Tyke");
        System.out.println(d1);
        d1.greets();
        d1.greets(d2);
    }
}