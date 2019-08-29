package studio1;
import support.cse131.ArgsProcessor;
public class Average {
    public static void main(String[] args){
        ArgsProcessor n1 = new ArgsProcessor(args);
        ArgsProcessor n2 = new ArgsProcessor(args);
        int a1 = n1.nextInt("The first of two integers to be averaged?");
        int a2 = n2.nextInt("The second of two integers to be averaged?");
        double a3 = (double)(a1 + a2)/2;
        System.out.println("Average of "  + a1 + " and " + a2 + " is " + a3 + ".");
    }
}
