import java.util.ArrayList;
import java.util.List;

public class Ground {
    public static final String PLACE_HOLDER = "🈳";    //"\uD83C\uDF3F";
    private int sideLength;

    private List exists;

    public Ground(int n) {
        this.sideLength = n;
        exists = new ArrayList();
    }

    public void layout(Space formation, Position location) {

        formation.setPosition(location);

        exists.add(formation);
    }

    public String toString() {


        String[][] content = new String[sideLength][sideLength];

        for (int i = 0; i < this.sideLength; i++) {
            for (int j = 0; j < this.sideLength; j++) {
                content[i][j] = PLACE_HOLDER;
            }
        }
        for (Object o : exists) {
            Space f = (Space) o;

            for (int i = 0; i < f.getWidth(); i++) {
                for (int j = 0; j < f.getHeight(); j++) {
                    content[i + f.getPosition().getX()][j + f.getPosition().getY()] = f.getContent()[i][j];
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < content.length; j++) {
            for (int i = 0; i < content[j].length; i++) {
                sb.append(content[i][j] + " ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public void cleanall() {
        exists.clear();
    }


}
