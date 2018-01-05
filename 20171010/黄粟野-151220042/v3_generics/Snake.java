public class Snake extends Space {
    //private Position position;
    public Snake(String matter) {
        super(7, 2);
        for (int i = 0; i < 7; i++) {
            this.content[i][0] = matter;
        }
    }
}

