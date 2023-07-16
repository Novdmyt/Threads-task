package task_01;

public class Robot {

    Robot(String str) {
        super(str);
    }

    public void run() {
        System.out.println(Thread.currentThread()./* отримати ім'я потоку **/ + " Started");
        try {
            Robot./* потік засинає на 1,5 секунди **/
            System.out.println(Thread.currentThread()/* отримати ім'я потоку **/ + " Waiting...");
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
        System.out.println(Thread.currentThread()/* отримати ім'я потоку **/ + " Stopped");
    }
}
