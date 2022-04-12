package MoveablePoint;

public class MainPoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(3.2f,2.2f,2.2f,3.2f);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
