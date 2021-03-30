package bag;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the length");
        int lengh=Integer.parseInt(scan.next());
        System.out.println("Please enter the width");
        int width=Integer.parseInt(scan.next());
        System.out.println("Please enter the height");
        int height=Integer.parseInt(scan.next());
        System.out.println("lengh"+lengh+"\t"+"width"+width+"\t"+"height"+height);
        if(lengh<10 && width<10&& height<10) {
            System.out.println("Box3");
        }else if(lengh<10 && width<20&& height<20){
                System.out.println("Box5");
        }
    }
}