public class Human {
    Human(){
        System.out.println("Constructor is running");
    }
    abstract void eat();
    abstract void walk();
    void breathing(){
        System.out.println("Breathing");
    }
}
class Man extends Human{
    @java.lang.Override
    void eat() {
        System.out.println("Anything eath");
    }

    @java.lang.Override
    void walk() {
        System.out.println("Any kind of walk");
    }

    @java.lang.Override
    void breathing() {
        super.breathing();
        System.out.println("Lab Dab");
    }
}
class Gawesh extends Man{
    @java.lang.Override
    void breathing() {
        super.breathing();
        System.out.println("GAwesh Breathing ");
    }

    @java.lang.Override
    void eat() {
        super.eat();
        System.out.println("Eating food");
    }

    @java.lang.Override
    void walk() {
        super.walk();
        System.out.println("Runing");
    }
}
class Run {
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 =new Gawesh();
        Man m = new Gawesh();
        h.breathing();
        h.eat();
        h.walk();
        h1.eat();
        h1.walk();
        h1.breathing();
        m.breathing();
        m.eat();
        m.walk();
    }
}