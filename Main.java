

import java.util.Scanner;

public class Main{
    public void checkPallindrome(){

        Scanner sc = new Scanner(System.in);


        int n,s=0,c,r;
        System.out.println("Enter any number");
        n = sc.nextInt();
        c=n;

        while(n>0) {

            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }

        if(c==s){

            System.out.println("Its a pallindrome number");
        }
        else
            System.out.println("Not a pallindrome number");
    }


    public void printPattern(){

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for( int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void checkPrimeNumber(){

        int n,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any value");
        n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(n%i==0) {
                count++;

            }
        }
        if(count==2) {
            System.out.println("Its a prime number");
        }

        else {
            System.out.println("Not a prime number");
        }
    }

    public void printFibonacciSeries(){

        int series,a=0,b=1,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the series number");
        series = sc.nextInt();

        for(int i=1;i<=series;i++)
        {
            System.out.print(a+"  ");
            c=a+b;
            a=b;
            b=c;

        }
    }

    public static void main(String[] args){
        Main obj = new Main();

        int choice;

        Scanner in = new Scanner(System.in);

        do{

            System.out.println("Enter your choice from below list.\n" + "1.Find the pallindrome number.\n" + " 2.Print pattern for given number.\n" +"3. check whether the number is prime number.\n" + "4.Print Fibonacci series.\n" + "--> enter 0 to exit.\n");
            System.out.println();

            choice = in.nextInt();

            switch (choice) {

                case 0:

                    choice = 0;

                    break;



                case 1: {

                    obj.checkPallindrome();

                }

                break;



                case 2: {



                    obj.printPattern();

                }

                break;



                case 3: {

                    obj.checkPrimeNumber();

                }

                break;



                case 4: {



                    obj.printFibonacciSeries();

                }

                break;



                default:

                    System.out.println("Invalid choice. Enter a valid no.\n");

            }



        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        in.close();




    }
}