public class Scorpion <T extends Creature>//implements Creature
{
    private Position position;
    public static final String PLACE_HOLDER = "🦂";
    private T creatures;

    //@Override
    public Position getPosition() {
        return position;
    }

    //@Override
    public void setPosition(Position position) {
        this.position = position;
        //position.setHolder(this.position);
        position.setHolder(this.creatures);
    }

    //@Override
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
