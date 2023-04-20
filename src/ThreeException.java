class ExceptionA extends Exception {
    ExceptionA(String message) { super(message); }
}

class ExceptionB extends Exception {
    ExceptionB(String message) { super(message); }
}

class ExceptionC extends Exception {
    ExceptionC(String message) { super(message); }
}

public class ThreeException {
    public static void f(int x) throws ExceptionA, ExceptionB, ExceptionC {
        if(x < 0) throw new ExceptionA("x < 0");
        if(x == 0) throw new ExceptionB("x == 0");
        if(x > 0) throw new ExceptionC("x > 0");
    }
    public static void main(String[] args) {
        try {
           // f(1);
           // f(0);
            f(-1);
        } catch(ExceptionA | ExceptionB | ExceptionC e) {
           e.printStackTrace(System.out);
        }
    }
}
