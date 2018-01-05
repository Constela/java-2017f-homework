public class Grangpa <T extends Creature>//implements Creature
{
    private Position position;
    public static final String PLACE_HOLDER = "👴";
    private T creatrueg;


    //@Override
    public Position getPosition() {
        return position;
    }

    //@Override
    public void setPosition(Position position) {
        this.position = position;
        //position.setHolder(this.position);
        position.setHolder(this.creatrueg);
    }

    //@Override
    public void report() {
        System.out.print(this.toString());
    }

    @Override
    public String toString(){
        return "爷爷 @" + this.position.getX() + "," + this.position.getY() + ";";
    }

    public String getPlaceHolder() { return PLACE_HOLDER; }

}
