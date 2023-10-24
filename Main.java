public class Main {
    public static void main(String[] args) {
        People p = new People();
       p.eat();
        p.sleep();
        
        Person1 p1 = new Person1();

        p1.eat("Burger Steak"); 
        p1.sleep(); 
        Person2 p2 = new Person2();
        p2.eat("Pizza"); 
        p2.sleep(); 

    }
}