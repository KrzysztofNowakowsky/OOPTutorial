package Interfaces;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y = this.y + this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y = this.y - this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x = this.x - this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x = this.x + this.xSpeed;
    }

    public String toString() { 
        return "("
                +this.x
                +","
                +this.y
                +"),speed=("
                +this.xSpeed
                +","
                +this.ySpeed
                +")";
    };
}
