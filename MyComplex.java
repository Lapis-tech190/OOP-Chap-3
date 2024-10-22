class MyComplex {
    double real;
    double image;

    public MyComplex(double real, double image) {
        this.real = real;
        this.image = image;

    }

    public double getReal() {
        return real;
    }


    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;

    }

    ;

    public void setImage(double Image) {
        this.image = image;
    }

    public void setValue(double real, double Image) {
    }

    @Override


    public String toString() {
        return "(" + real + "+" + image + "i)";

    }

    public boolean isReal() {
        return image == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    public boolean equals(double real, double image) {
        return this.real == real && this.image == image;

    }

    public boolean equals(MyComplex another) {
        return this.real == another.real && this.image == another.image;
    }

    public double magtinude() {
        return Math.sqrt(real * real + image * image);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.image += right.image;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.image + right.image);
    }

    public MyComplex subtractInto(MyComplex right) {
        this.real -= right.real;
        this.image -= right.image;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.image - right.image);
    }
}
