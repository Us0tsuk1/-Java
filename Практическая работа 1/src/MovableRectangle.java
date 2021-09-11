public class MovableRectangle implements Movable{

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.topLeft = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean hasSameSpeed(){
        return (this.topLeft.xSpeed == this.bottomRight.xSpeed) && (this.topLeft.ySpeed == this.bottomRight.ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        if (hasSameSpeed())
        {
            bottomRight.moveUp();
            topLeft.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (hasSameSpeed())
        {
            bottomRight.moveDown();
            topLeft.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (hasSameSpeed())
        {
            bottomRight.moveLeft();
            topLeft.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (hasSameSpeed())
        {
            bottomRight.moveRight();
            topLeft.moveRight();
        }
    }
}
