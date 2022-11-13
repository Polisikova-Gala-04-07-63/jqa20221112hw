package JavaQA.com;

public class Main {

    public static void main(String[] args){
    Person john = new Person();
    john.move();
    john.talk();

    Person ann = new Person("Ann", 23);
    ann.move();
    ann.talk();


    Phone nokia = new Phone("Nokia",1234, 3.2);

    Phone sony = new Phone("Sony", 5678, 3.4);

    Phone samsung = new Phone("Samsung", 9876, 3.6);

    nokia.show();
    sony.show();
    samsung.show();

    nokia.receiveCall("Alex");
    System.out.println(nokia.getNumber());

    sony.receiveCall("Vera");
    System.out.println(sony.getNumber());

    samsung.receiveCall("Tom");
    System.out.println(samsung.getNumber());


    }
}
