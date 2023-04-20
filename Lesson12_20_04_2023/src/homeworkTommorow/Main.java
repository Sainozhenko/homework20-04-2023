package homeworkTommorow;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new ExtendThread().start();

        ExtendThread first = new ExtendThread();
        RunThread ci = new RunThread();
        Thread cit = new Thread(ci);

        first.start();
        first.join();

        cit.start();
        cit.join();

        System.out.println("End of main");
    }
}