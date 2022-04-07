package Hcn;

public class Hcn {
    private int width, height; //private nó là cái để

    public Hcn() {
    }

    public Hcn(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public static int getArea(int height,int width){
        return height*width;
    }
}
