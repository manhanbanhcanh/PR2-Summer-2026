package TUT3.Rectangle;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){
        this.length = getLength();
        this.width = getWidth();
    }

    public Rectangle(float length, float width){
        setLength(length);
        setWidth(width);
    }

    //getter and setter
    public float getLength(){
        return length;
    }

    public void setLength(float length){
        this.length = length;
    }

    public float getWidth(){
        return width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (length + width) * 2;
    }

    @Override
    public String toString(){
        return ("Rectangle[length="+ getLength() +",width="+ getWidth()+"]");
    }
}
