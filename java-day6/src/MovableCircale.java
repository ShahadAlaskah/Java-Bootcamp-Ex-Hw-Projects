public class MovableCircale implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircale(int x, int y, int xSpeed, int ySpeed,int radius) {
        this.radius = radius;
        this.center =new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveRight() {

    }
}
