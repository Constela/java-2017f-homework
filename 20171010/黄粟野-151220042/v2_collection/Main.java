import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Ground g = new Ground(10);
        ArrayList<Guys> guys = new ArrayList<Guys>();
        ArrayList<Huluwa> brothers = new ArrayList<Huluwa>();


        Guys[] guyy = new Guys[7];
        for (int i = 0; i < guyy.length; i++) {
            guyy[i] = new Guys(SENIORITY.values()[i]);
            guys.add(guyy[i]);
        }


        Huluwa[] bro = new Huluwa[7];
        for (int i = 0; i < bro.length; i++) {
            bro[i] = new Huluwa(COLOR.values()[i], SENIORITY.values()[i]);
            brothers.add(bro[i]);
        }

        Grangpa gp = new Grangpa();
        Scorpion scorpion = new Scorpion();
        scorpion.queuefirst();
        Position scorpion_first_position = new Position(scorpion.getPosition().getX(),scorpion.getPosition().getY());


        Snake guy = new Snake(guys.get(0).getPlaceHolder());
        Goose hulu = new Goose(brothers.get(0).getPlaceHolder());
        Single grandpa = new Single(gp.getPlaceHolder());
        Single s = new Single(scorpion.getPlaceHolder());


        g.layout(guy, new Position(2,0));
        g.layout(hulu, new Position(2,6));
        g.layout(grandpa,new Position(5,5));
        g.layout(s,scorpion_first_position);

        System.out.print(g);

        g.cleanall();

        System.out.print(g);

        Goose guy1 = new  Goose(guys.get(0).getPlaceHolder());
        Snake hulu1 = new Snake(brothers.get(0).getPlaceHolder());
        g.layout(guy, new Position(2,7));
        g.layout(hulu, new Position(2,0));
        g.layout(grandpa,new Position(5,4));

        scorpion.queuesecond();
        Position scorpion_second_position = new Position(scorpion.getPosition().getX(),scorpion.getPosition().getY());
        g.layout(s,scorpion_second_position);



        System.out.print(g);


        }

    }

