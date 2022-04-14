package InterfaceResizeable;

public class Square extends Shape implements Colorable  {
    public double width;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void howTocolor() {
        System.out.println("Color all four sides");
    }
    @Override
    public void resize(double percent) {
        width = width*percent/100;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }


}
