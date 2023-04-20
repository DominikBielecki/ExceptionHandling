public class UseFinally {
    public static void generateExcepiton(int what) {
        int t;
        int numbers[] = new int[2];
        System.out.println("Input value " + what);
        try{
            switch (what){
                case 0:
                    t = 10/what; //generates a divide by zero exception
                    break;
                case 1:
                    numbers[4] = 4; //generates an array index exception
                    break;
                case 2:
                    return; //return from a try block
            }
        }
        catch (ArithmeticException e){
            //catches the exception
            System.out.println("You cannot divide by zero");
            return; //return from catch
        }
        catch (ArrayIndexOutOfBoundsException e){
            //catches the exception
            System.out.println("There is no such index in the array");
        }
        finally { //executed after the try / catch block has finished
            System.out.println("These code will always be used");
        }
    }
}
class FinallyDemo{
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            UseFinally.generateExcepiton(i);
            System.out.println();
        }
    }
}
