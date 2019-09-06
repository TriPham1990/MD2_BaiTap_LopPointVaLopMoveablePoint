public class MoveablePoint extends Point {
    private float speedX ;
    private float speedY ;

    public MoveablePoint(){

    }

    public MoveablePoint(float speedX, float speedY){
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public MoveablePoint(float x, float y, float speedX, float speedY){
        super(x,y);
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public float getSpeedX() {
        return speedX;
    }

    public void setSpeedX(float speedX) {
        this.speedX = speedX;
    }

    public float getSpeedY() {
        return speedY;
    }

    public void setSpeedY(float speedY) {
        this.speedY = speedY;
    }

    public void setSpeed(float speedX, float speedY){
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public float[] getSpeed(){
        float[] arraySpeed = {this.speedX, this.speedY};
        return  arraySpeed;
    }

    public MoveablePoint move(){
        super.setX(super.getX() + this.speedX);
        super.setY(super.getY() + this.speedY);
        return this;
    }

    @Override
    public String toString(){
        return "Point x = "
                + super.getX()
                + ", y = "
                + super.getY();
    }


}
