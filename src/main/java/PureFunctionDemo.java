import java.util.Random;

class MyClass {
    int i;
    MyClass() {
        i = 0;
    }

    public int impureOne(int v) {
        Random r = new Random();
        return r.nextInt(100) * v;
    }

    public int impureTwo(int v) {
        i++;
        return v + i;
    }

    public int pure(int v) {
        return v * 10;
    }
}
public class PureFunctionDemo {
    public static void main(String[] args) {
        var myClass = new MyClass();
        System.out.println("myClass.impureOne(5) = " + myClass.impureOne(5));
        System.out.println("myClass.impureOne(5) = " + myClass.impureOne(5));

        System.out.println("myClass.impureTwo(5) = " + myClass.impureTwo(5));
        System.out.println("myClass.impureTwo(5) = " + myClass.impureTwo(5));

        System.out.println("myClass.pure(5) = " + myClass.pure(5));
        System.out.println("myClass.pure(5) = " + myClass.pure(5));

        System.out.println("myClass.pure(myClass.impureTwo(5)) = " + myClass.pure(myClass.impureTwo(5)));
        System.out.println("myClass.pure(myClass.impureTwo(5)) = " + myClass.pure(myClass.impureTwo(5)));
    }
}
