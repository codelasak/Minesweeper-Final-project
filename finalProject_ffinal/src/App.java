
public class App {

    public static final int WIDTH = 500, HEIGHT = 500;
    public static final int GRIDSIZE = 10;
    public static final int MINECOUNT = 9;

    private Handler handler = new Handler();

    public App() {
        new UI(WIDTH, HEIGHT, GRIDSIZE, "OOP Final project: Minesweeper", this, handler);
        UI.update(0);
    }

    public static void main(String[] args) {
        new App();
    }

}