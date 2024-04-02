package OOPTutorial;

public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println("Area: "+c1.getArea()+", radius:" + c1.getRadius());
        c1.setColor("Trolowy");
        System.out.println(c1.toString());
    }
}
