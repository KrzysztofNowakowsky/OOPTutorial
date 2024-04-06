package Interfaces;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    MovableCircle(MovablePoint point, int radius){
        this.center = point;
        this.radius = radius;
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return center.toString()
                + "radius="
                + this.radius;
    };

}