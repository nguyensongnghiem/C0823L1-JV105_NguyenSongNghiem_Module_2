package session06.exers03;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point() {

    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;        
    } 
    public void setX(float x) {
        this.x = x;
    }
    public float getX() {
        return x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getY() {
        return y;
    }
    public void setXY (float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] xy = new float[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }
    public String toString () {
        return "(" + getX() + ";" + getY() + ")";
    }
}
