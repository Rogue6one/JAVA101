package JAVA101.UcgeninAlani;

import java.util.Scanner;

class Alan{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini sirasi ile giriniz: ");
        /**
        รรง๐๐๐๐๐ รง๐๐ฃ๐๐๐ ๐ = 2๐ข
        Alan * Alan = ๐ข * (๐ข โ ๐)* (๐ข โ ๐) * (๐ข โ ๐)
         */
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int u = (a+b+c)/2; //cevrenin yarisi
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        
        System.out.println("Ucgenin alani = "+ alan);
        scan.close();
    }
}