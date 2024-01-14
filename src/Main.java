public class Main {
    public static void main(String[] args) {
        System.out.println("Hello please enter the dimensions of the window!");
        set_params(70,30);
        double height = Window.getHeight();
        System.out.println("The height of the window is " + height + " mm.");
    }

    public static void set_params(double h, double w){
        Window.set_height(h);
    }
}