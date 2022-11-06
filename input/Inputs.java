package input;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
//        Create Scanner/Input Object
        Scanner sc = new Scanner(System.in);
////        Input single token
//        String name = sc.next();

////        Input multiple token / full sentences
//        String name = sc.nextLine();
//        System.out.println(name);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }

}
