import java.util.*;

public class loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the number to print table");
        // int num = sc.nextInt();

        // for(int i = 1; i<=10 ; i++){
        //     System.out.println(num + "x" + i + "=" + num*i);
        // }

        // int i = 0;

        // while (i<=10) {
        //     System.out.println(num + "x" + i + "=" + num*i);
        //     i++;
        // }

        // do{
        //     System.out.println(num + "x" + i + "=" + num*i);
        //     i++;
        // }while(i <= 10);



        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1 ; i<=num; i++){
            sum+=i;
        }
        System.out.println("Total number of sum is :" + sum);
    }
}
