public class ResizableCircle extends Circle {
   
    public ResizableCircle(double radius) {
        super(radius);
        setRadius(radius);
    }

    public void incRadius(double percent) {
        setRadius(getRadius()+getRadius()*percent/100);        
    }
    public void decRadius(double percent) {
        setRadius(getRadius()-getRadius()*percent/100);
    }
}