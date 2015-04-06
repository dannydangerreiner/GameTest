import java.awt.*;

/**
 * Created by danny on 2015/04/06.
 */
public class Game extends Canvas implements Runnable {
    private static final int HEIGHT = 640;
    private static final int WIDTH = HEIGHT/12*9;
    private Thread thread;
    private boolean running = false;

    public Game(){
        new Window(WIDTH, HEIGHT, "My Game!", this);
    }

    public synchronized void start(){
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop(){
        try{
            thread.join();
            running=false;
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

    }
}
