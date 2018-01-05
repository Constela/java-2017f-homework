public class Scorpion implements Creature
{
    private Position position;
    public static final String PLACE_HOLDER = "🦂";

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
        position.setHolder(this);
    }

    @Override
    public void report() {
        System.out.print(this.toString());
    }

    @Override
    public String toString(){
        return "蝎子精 @" + this.position.getX() + "," + this.position.getY() + ";";
    }

    public void queuefirst()
    {
        Position p = new Position(5,1);
        this.setPosition(p);

    }

    public void queuesecond()
    {
        Position p = new Position(5,6);
        this.setPosition(p);

    }

    public String getPlaceHolder() { return PLACE_HOLDER; }
}
