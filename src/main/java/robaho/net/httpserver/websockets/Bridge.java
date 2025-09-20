interface Color{
    public String ApplyColor();
}

class RedColor implements Color{
    public String ApplyColor(){
        return "Red";
    }
}

class BlueColor implements Color{
    public String ApplyColor(){
        return "Blue";
    }
}

abstract class Shape{
    protected Color color;
    public Shape (Color color){
        this.color = color;
    }
    public abstract void Draw();
}

class Circle extends Shape{
    Circle (Color color){
        super(color);
    }
    public void Draw (){
       System.out.println("Circle with Color " +color.ApplyColor());
    }
}

class Squire extends Shape{
    Squire (Color color){
        super(color);
    }
    public void Draw (){
       System.out.println("Squire with Color " +color.ApplyColor());
    }
}

public class Bridge {
    public static void main(String[] args) {
        Color color1 = new RedColor();
        Color color2 = new BlueColor();
        Shape shape1 = new Circle(color1);
        Shape shape2 = new Squire(color2);
        shape1.Draw();
        shape2.Draw();
        
    }
}
