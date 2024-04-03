package ComplexNumber;
import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first complex number, enter real and imaginary part: ");
        String number = scan.nextLine();
        String [] arrString = number.split(" ");
        double real = Double.valueOf(arrString[0]);
        double imag = Double.valueOf(arrString[1]);
        MyComplex complex1 = new MyComplex(real,imag);
        System.out.print("Enter second complex number, enter real and imaginary part: ");
        number = scan.nextLine();
        arrString = number.split(" ");
        real = Double.valueOf(arrString[0]);
        imag = Double.valueOf(arrString[1]);
        MyComplex complex2 = new MyComplex(real,imag);
    
            System.out.println("Number 1 : " +complex1);
            if (complex1.isImaginary()) System.out.println("Number" + complex1 + "Is not imaginary");
            if (complex1.isReal()) System.out.println("Number" + complex1 + "Is not real");
            System.out.println("Number 2 : " +complex2);
            if (complex2.isImaginary()) System.out.println("Number" + complex2 + "Is not imaginary");
            if (complex2.isReal()) System.out.println("Number" + complex2 + "Is not real");
            System.out.println(complex1 + " + " + complex2 + " = " + complex1.addNew(complex2) );
        
    }
    
}

