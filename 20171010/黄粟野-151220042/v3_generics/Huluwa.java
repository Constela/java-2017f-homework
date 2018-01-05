public class Huluwa <T extends Creature>//implements Creature
{

    private COLOR color;
    private SENIORITY seniority;
    private Position position;
    public static final String PLACE_HOLDER = "👧";
    private T creatureh;

    public COLOR getColor() {
        return color;
    }

    public SENIORITY getSeniority() {
        return seniority;
    }


    //@Override
    public Position getPosition() {
        return position;
    }

    //@Override
    public void setPosition(Position position) {
        this.position = position;
        //position.setHolder(this.position);
        position.setHolder(this.creatureh);
    }

    Huluwa(COLOR color, SENIORITY seiority) {
        this.color = color;
        this.seniority = seiority;
    }

    //@Override
    public void report() {
        System.out.print(this.toString());
    }

    @Override
    public String toString(){
        return this.seniority.toString() + "(" + this.color.toString() + ")@" + this.position.getX() + "," + this.position.getY() + ";";
    }

    public String getPlaceHolder() { return this.PLACE_HOLDER; }


}

enum COLOR {
    赤, 橙, 黄, 绿, 青, 蓝, 紫
}

enum SENIORITY {
    一, 二, 三, 四, 五, 六, 七
}