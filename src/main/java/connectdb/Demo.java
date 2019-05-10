package connectdb;

public class Demo {

    public static void main(String[] args) {

       Demo objDemo = demoReturnType();
              objDemo.hello();

    }


    public void hello(){

        System.out.println("Hello");
    }

    public static Demo demoReturnType(){

        /**
         * Whatever I do at the end of the day I will return and object of Demo Type
         * */

        return new Demo();
    }


}
