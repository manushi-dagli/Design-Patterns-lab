package singleton;
class singleton_class {

    private static singleton_class obj = new singleton_class();

    private singleton_class() {
        System.out.println("This is the private constructor");
    }

    public static singleton_class getObj() {
        System.out.println("This is the static method");
        return obj;
    }
}

public class singleton {
    public static void main(String[] args) {
        System.out.println("Making the object");
        singleton_class.getObj();
    }
}