package Interfaces;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint myMovablePoint = new MovablePoint(1, 2, 3, 3);
        MovableCircle myMovableCircle = new MovableCircle(1, 1, 2, 2, 3);
        MovableCircle myMovableCircle2 = new MovableCircle(myMovablePoint,2);
        System.out.println(myMovableCircle);
        System.out.println(myMovableCircle2);
        System.out.println(myMovablePoint);
        System.out.println("myMovableCircle moving right!");
        System.out.println("myMovableCircle2 moving left and up!");
        System.out.println("myMovablePoint moving down!");
        myMovablePoint.moveDown();
        myMovableCircle.moveRight();
        myMovableCircle2.moveLeft();
        myMovableCircle2.moveUp();
        System.out.println(myMovableCircle);
        System.out.println(myMovableCircle2);
        System.out.println(myMovablePoint);
    }
    
}
