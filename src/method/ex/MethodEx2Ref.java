package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {
        String message = "Hello java!";
        printMessage(message,5);
    }
    public static void printMessage(String messages, int count){
        for (int i = 0; i < count; i++){
            System.out.println(messages);
        }
    }
}
