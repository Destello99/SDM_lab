import java.util.Scanner;

public class JavaDocker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        if( num1 > num2){
            System.out.println("first "+num1+" is greater");
        }
        else{
            System.out.println("second "+num2+"is greater");
        }
        sc.close();
    }
}