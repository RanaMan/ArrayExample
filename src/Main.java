/**
 * Created by Rana on 10/30/2016.
 */
public class Main {

    public static void main(String[] args){

        args = new String[]{
            "Hello ",
            "there ",
            "Ladies ",
            "and ",
            "Gentlemen!",
        };



        for(String argument : args){
            System.out.println(argument);
        }

        changeGreeting(args);

        for(String argument : args){
            System.out.println(argument);
        }


    }

    public static void changeGreeting (String[] greeting){
        if(greeting.length >=2){
            greeting[0] = "Goodnight";
            greeting[1] = "now";
        }
    }

}
