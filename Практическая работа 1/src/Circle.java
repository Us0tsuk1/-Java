class Circle extends Shape{
    protected double radius;

    public Circle(){
        radius = 1;
        color = "Black";
        filled = false;
    }

    public Circle(double radius){
        this.radius =radius;
        color = "Black";
        filled = false;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this. filled = filled;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "radius = " + this.radius +"color = " + this.color + " filled = " + this.filled;
    }
}
