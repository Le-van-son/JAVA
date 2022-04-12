package MoveablePoint;

public class MoveablePoint extends Point {
    private float xspeed,yspeed;

    public MoveablePoint(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public MoveablePoint(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }
    public MoveablePoint(){
    }

    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }

  public void setSpeed(float xspeed, float yspeed){
        this.xspeed = xspeed;
        this.yspeed = yspeed;
  }
  public float [] getSpeed(){
        float [] arr = new float[]{xspeed,yspeed};
        return arr;
  }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + super.getX() +
                "y=" + super.getY() +
                "xspeed=" + xspeed +
                ", yspeed=" + yspeed +
                '}';
    }
    public MoveablePoint move(){
        super.setX(super.getX() + xspeed);
        super.setY(super.getY() + yspeed);
        return this;
    }
}
