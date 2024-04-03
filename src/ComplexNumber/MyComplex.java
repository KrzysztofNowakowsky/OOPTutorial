package ComplexNumber;

public class MyComplex {
    private double real;
    private double imag;
    MyComplex(){
        real = 0.0;
        imag = 0.0;
    }
    MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public boolean isReal(){
        if(imag==0) return true;
        return false;
    }
    public boolean isImaginary(){
        if(real==0) return true;
        return false;
    }
    public boolean equals(double real, double imag){
        if (this.real == real&&this.imag==imag) return true;
        return false; 
    }
    public boolean equals(MyComplex number){
        if(this.real == number.real && this.imag == number.imag) return true;
        return false;
    }

    public double magnitude(){
        return Math.sqrt(this.real*this.real + this.imag*this.imag);
    }

    public String toString() {
        return ""+real+" + "+imag+"i";
    }
    public MyComplex addInto(MyComplex right){
        this.imag += right.imag;
        this.real += right.real;
        return this;
    }
    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real + right.real,this.imag+ right.imag);
    }
    

}
