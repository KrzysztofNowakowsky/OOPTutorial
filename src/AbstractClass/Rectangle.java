package AbstractClass;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    };

    @Override
    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    };

    @Override
    public String toString(){
        return "Rectangle=["+super.toString()+",width="+this.width+",length="+this.length+"]";
    }
}
