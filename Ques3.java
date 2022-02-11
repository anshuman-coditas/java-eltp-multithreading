package MultiThreadingAssignment;

public class Ques3 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Thread Running: " + Thread.currentThread());
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
     Ques3 obj_q2=new Ques3();
     Ques3 obj_q3=new Ques3();
     Ques3 obj_q4=new Ques3();
     obj_q2.setName("thread1");
     obj_q3.setName("thread2");
     obj_q4.setName("thread3");
     obj_q2.setPriority(2);
     obj_q3.setPriority(5);
     obj_q4.setPriority(8);
     obj_q2.start();
     obj_q3.start();
    obj_q3.join(100);
     obj_q4.start();
     System.out.println(obj_q2.getState());
     System.out.println(obj_q3.isAlive());
     System.out.println(obj_q4.isInterrupted());

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
//Thread Running: Thread[thread2,5,main]
//        Thread Running: Thread[thread1,2,main]
//        Thread Running: Thread[thread3,8,main]
//        TIMED_WAITING
//        true
//        false
//        Thread Running: Thread[thread2,5,main]
//        Thread Running: Thread[thread1,2,main]
//        Thread Running: Thread[thread3,8,main]