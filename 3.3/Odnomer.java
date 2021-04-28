import java.util.Arrays;
import java.util.Scanner;

class Odnomer {
    static int [] a;
    static Scanner sc;

    static void fillArr(int i){
        if(i<a.length){
            System.out.println("Заполните " + i + " элемент массива");
            a[i] = sc.nextInt();
            fillArr(++i);
        }
    }
    static void printArr(int i){
        if(i<a.length){
            System.out.print(a[i] + " ");
            printArr(++i);
        }
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Size");
        int size = sc.nextInt();
        sc.nextLine();
        a = new int[size];
        fillArr(0);
        printArr(0);
    }
}
