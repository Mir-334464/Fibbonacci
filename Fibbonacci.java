import java.util.*;

class Fibbonacci

 {

       public static void main(String[]args)

            {

            Scanner sc=new Scanner(System.in);
 
            System.out.print("Enter a Number to print Fibbonacci Series: ");

            int N=sc.nextInt();

            int a=0, b=1, c, i=2;

  while(i<=N)

      {
   System.out.println(+a+" ");
        c=a+b;
        a=b;
        b=c;

	i++;

      }

    }
}