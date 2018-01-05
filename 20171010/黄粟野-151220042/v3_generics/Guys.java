public class Guys <T extends Creature>//implements Creature
{
    private Position position;
    private SENIORITY seniority;
    public static final String PLACE_HOLDER = "👺";
    private T creatureguy;

    //@Override
    public Position getPosition() {
        return position;
    }

    //@Override
    public void setPosition(Position position) {
        this.position = position;
        //position.setHolder(this.position);
        position.setHolder(this.creatureguy);
    }

    //@Override
    public void report() {
        System.out.print(this.toString());
    }

    @Override
    public String toString(){
        return "小喽啰" + this.seniority + "@" + this.position.getX() + "," + this.position.getY() + ";";
    }

    Guys(SENIORITY seiority) {
        this.seniority = seiority;
    }
    public String getPlaceHolder() { return this.PLACE_HOLDER; }

}
