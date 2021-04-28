import java.util.Scanner;
public class Dvoichnaya {
    public static void m(int x) {
        if(x!=0) {
            m(x/2);
        }
System.out.print(x%2);
    }
    public static void main(String[]args ){
        Scanner sc=new Scanner(System.in,"cp1251");
        System.out.println("Введите число=> ");
        int n=sc.nextInt(); // количество стран
        Dvoichnaya country[]=new Dvoichnaya[n];

        m(50);
    }
}
