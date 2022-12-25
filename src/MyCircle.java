public class MyCircle {
    private MyPoint center = null;
    private int radius;

    public MyCircle() {
        center = new MyPoint(0,0);
        radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        this.radius = radius;
        center = new MyPoint(x, y);
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }


    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x)   {
        this.center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y)   {
        this.center.setY(y);
    }

    public int[] getCenterXY()    {
        return new int[]{center.getX(), center.getY()};
    }

    public void setCenterXY(int x, int y)   {
        this.center.setX(x);
        this.center.setY(y);
    }

    public String toString() {
        return "MyCircle[" +
                ", radius=" + radius +
                "center=(" + center.toString() + ")]";
    }

    public double getArea() {
        return getCenterX() * getCenterY();
    }

    public double getCircumference()    {
        return radius * 3.14 * 2;
    }
}
