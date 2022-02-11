package MultiThreadingAssignment;

import java.util.Scanner;

public class Ques4 implements Runnable{
    @Override
    public void run() {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter num: ");
        int n= inp.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Thread t=new Thread(new Ques4());
        Thread t1=new Thread(new Ques4());
        t.start();
        t1.start();
    }
}
//****ONE THREAD*******
//Enter num:
//        20
//        1 3 5 7 9 11 13 15 17 19
//******TWO THREADS
//Enter num:
//        Enter num:
//        10 ==> Odd Numbers till 10 (1,3,7,9)
//        20 ==> Odd Numbers till 20(1,3,5,7,9,11,13,15,17,19)
//        1 3 5 7 9 1 3 5 7 9 11 13 15 17 19