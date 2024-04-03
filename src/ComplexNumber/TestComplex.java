package ComplexNumber;

public class TestComplex {
    public static void main(String[] args) {
        MyComplex numero = new MyComplex(1,2);
        MyComplex nero = new MyComplex();
        System.out.println(numero);
        System.out.println(numero.getImag());
        System.out.println(numero.getReal());
        nero.setValue(2, 3);
        System.out.println(nero.equals(2, 3)); // true
        System.out.println(nero.isImaginary() || nero.isReal());//false
        System.out.println(nero.magnitude());
        System.out.println(numero.addInto(nero));
        System.out.println(numero.addNew(nero));
    }
}
