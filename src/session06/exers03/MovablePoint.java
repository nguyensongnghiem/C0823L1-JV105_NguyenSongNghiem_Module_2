package session06.exers03;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint() {
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint ( float x, float y ,float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;        
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed ) {
        this.xSpeed = xSpeed;
        this.xSpeed = ySpeed;        
    }
    public float[] getSpeed() {
        float[] speed = new float[2];
        speed[0] = xSpeed ;
        speed[1] = ySpeed; 
        return speed;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "(" + getX() + ";" + getY() + ")" + ", speed = (" + xSpeed + ";" + ySpeed + ")";
    }
    public MovablePoint move() {
        setXY(getX() + xSpeed, getY() +ySpeed);
        return this;    
    }
}
