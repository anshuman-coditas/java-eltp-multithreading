package MultiThreadingAssignment;

public class Ques2 extends Thread {
    public void run(){
        System.out.println("Run Method Invoked => "+Thread.currentThread());
    }
    public static void main(String[] args) {
        Ques2 obj_q1 = new Ques2();
        obj_q1.start();
        obj_q1.run();
    }
}
//***********OUTPUT****************
//Run Method Invoked => Thread[main,5,main]
//        Run Method Invoked => Thread[Thread-0,5,main]

//When we call the run method explicitly it is treated as for the current thread i.e. main not the new obj_q1 thread.