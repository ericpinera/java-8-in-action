package lambdasinaction;

public class RunnableExample {

   public static void main(String...args){
       Thread myLambdaThread = new Thread(()->System.out.println("Printed inside Lambda Runnable"));
       myLambdaThread.run();
   }

}
