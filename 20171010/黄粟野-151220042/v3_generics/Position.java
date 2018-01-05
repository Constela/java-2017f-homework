public class Position < T extends Creature> {

    private int x;
    private int y;


    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Position(int x, int y){
        super();
        this.x = x;
        this.y = y;
    }

    //public Creature getHolder() {
    public T getHolder() {
        return holder;
    }

    //public void setHolder(Creature holder) {
    public void setHolder(T holder) {
        this.holder = holder;
    }

    //private Creature holder;
    private T holder;
}
