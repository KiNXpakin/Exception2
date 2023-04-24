package Exception2;

public class LAB6 {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        }
        catch (ArithmeticException e){
            //e.printStackTrace();
           //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for (int i=0; i < stackTraceElements.length; i++) {
                System.out.println(stackTraceElements[i].getClassName());
                System.out.println(stackTraceElements[i].getMethodName());
                System.out.println(stackTraceElements[i].getFileName());
                System.out.println(stackTraceElements[i].getLineNumber());
            }
        }
    }
}
