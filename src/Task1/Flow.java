package Task1;

public class Flow {
//1.1 og 1.2
    public void methodA(String input){
        System.out.println("");
        methodE( "slut");

        if(!input.equals("start")) {
            System.out.println("d");
            methodB("input");
        } else{
            System.out.println("u");

        }
         System.out.println("e");
    }

    public void methodB(String input) {
      System.out.print("r");

    }

    public void methodC(String start){
        System.out.println("s");

    }

    public void methodD(int number){
        System.out.println("o");
        if (number > 3);
        System.out.println("d");

    }

    public void methodE(String slut){
        System.out.println("javeersjovt");
    }

}
