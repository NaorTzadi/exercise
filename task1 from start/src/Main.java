import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //printDiamond();
        //primeNumbers();
        //fibonacci();
        //sumOfNumbers();
        sequence();
    }
    public static void printDiamond(){
        Scanner scanner=new Scanner(System.in);
        int input;
        do{
            System.out.println("please enter an uneven number that is larger than 3");
            input= scanner.nextInt();
        }while(input<=3 || input%2==0);

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = input - 2; i >= 0; i--) {
            for (int j = 0; j < input - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void primeNumbers(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number");
        int num= scanner.nextInt();
        if(num==2) {
            System.out.println(2);
            return;
        }else {
            if(num==3){
                System.out.println(2);
                System.out.println(3);
            }
        }
        int counter=0;
        System.out.println(2);
        System.out.println(3);
            for(int i=4;i< Math.pow(num,2*num);i++){
                if (i % 2 != 0 && i % 3 != 0) {
                    System.out.println(i);
                    counter++;
                }
                if(counter==num-2){
                        break;
                }
            }

    }

    public static void fibonacci(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number");
        int num= scanner.nextInt();
      int sum=0,first=0,second=1;
      do {
          first += sum;
          second += first;
          sum =second;
      }while (sum<num);

      if(second==num || first==num){
          System.out.println("fibonacci");
      }else {
          System.out.println("not fibonacci");
      }
    }
    public static void sumOfNumbers(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number");
        int num= scanner.nextInt();
        int sum=0;
        do{
            sum+=num%10;
            num=num/10;
        }while (num>0);

        System.out.println(sum);
    }
    public static void sequence(){
        for(int i=0;i<=1000;i++){
            int sumOfNumbers;
            int sumOfSequence=0;
            int current=i;
            do{
                sumOfNumbers=current%10;
                sumOfSequence+=Math.pow(sumOfNumbers,3);
                current/=10;
            }while (current>0);

            if(sumOfSequence==i){
                System.out.println(i);
            }
        }

    }
}