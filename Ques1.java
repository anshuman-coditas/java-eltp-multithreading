package MultiThreadingAssignment;

public class Ques1 extends Thread {
    public void run(){
        System.out.println("Running");
    }
    public static void main(String[] args) {
        Ques1 obj_q = new Ques1();
        obj_q.start();
        obj_q.start();
    }
}
//**********OUTPUT************************
//Exception in thread "main" java.lang.IllegalThreadStateException
//	at java.base/java.lang.Thread.start(Thread.java:793)
//	at MultiThreadingAssignment.Ques1.main(Ques1.java:10)
//Running
//After starting a thread it can never be started again.
