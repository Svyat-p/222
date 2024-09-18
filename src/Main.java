//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        String a="";
        while(num>=1){
            a=a+num%2;
            num=num/2;

        }
        String reverse="";
        char b;
        for(int i=a.length()-1; i>=0; i=i-1){
            b=a.charAt(i);
            reverse=reverse+b;

        }
        System.out.println(reverse);


    }
}