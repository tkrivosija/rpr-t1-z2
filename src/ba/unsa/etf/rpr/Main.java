package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int x){
        int kopija = x;
        int suma = 0;
        while(kopija!=0){
            suma = suma + kopija%10;
            kopija = kopija / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
	    int n;
        System.out.println("Unesite n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i=1;i<=n;i++){
            if(i%sumaCifara(i)==0) System.out.println(i);
        }
    }
}
