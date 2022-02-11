package MultiThreadingAssignment;

public class Ques3 extends Thread {
    public void run() {

            for (int i = 0; i < 2; i++) {
                System.out.println("Thread Running: " + Thread.currentThread());

            }
    }
    public static void main(String[] args) throws InterruptedException {
     Ques3 obj_q2=new Ques3();
     Ques3 obj_q3=new Ques3();
     Ques3 obj_q4=new Ques3();
     obj_q2.setName("thread1");
     obj_q3.setName("thread2");
     obj_q4.setName("thread3");
     obj_q2.setPriority(1);
     obj_q3.setPriority(2);
     obj_q4.setPriority(10);
        System.out.println(obj_q2.getState());
        System.out.println(obj_q3.isAlive());
        System.out.println(obj_q4.isInterrupted());
     obj_q2.start();
     obj_q2.join(100);
     obj_q3.start();
     obj_q4.start();


    }

}
//*********BEFORE JOIN
//Thread Running: Thread[thread3,8,main]
//        Thread Running: Thread[thread2,5,main]
//        Thread Running: Thread[thread1,2,main]
//        Thread Running: Thread[thread3,8,main]
//        Thread Running: Thread[thread2,5,main]
//        Thread Running: Thread[thread1,2,main]
//**********AFTER JOIN AND OTHER METHODS
//        NEW  ==> getState(Before Start)
//        false ==>isAlive(Before Start)
//        false ==>isInterrupted(Before start)
//        Thread Running: Thread[thread1,1,main] ==> Priority 1 but executing due to join
//        Thread Running: Thread[thread1,1,main]
//        Thread Running: Thread[thread3,10,main]==> Priority to be maximum
//        Thread Running: Thread[thread3,10,main]
//        Thread Running: Thread[thread2,2,main]==> Priority is 2
//        Thread Running: Thread[thread2,2,main]