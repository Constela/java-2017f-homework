public class Goose extends Space{
    public Goose(String matter) {
        super(7, 4);
        for (int i = 0; i < 4; i++) {
            content[i][i] = matter;
        }
        for (int i = 4; i < 7; i++) {
            content[i][2 - i % 4] = matter;
        }
    }

}
