public class Space
{
    public static final String PLACE_HOLDER = "🈳";

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) { this.height = height; }

    private Position position;
    public Position getPosition() { return position; }
    public void setPosition(Position position) { this.position = position; }

    protected String[][] content;
    public String[][] getContent() { return content; }
    public void setContent(String[][] content) { this.content = content; }


    public Space(int x, int y)
    {

        this.width = x;
        this.height = y;

        this.content = new String[x][y];
        for(int i=0;i<width;i++)
            for(int j=0;j<height;j++)
            {
                content[i][j] = PLACE_HOLDER;
            }

    }

    public String toString() {
        StringBuilder stringb = new StringBuilder();
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                stringb.append(content[i][j] + " ");
            }
            stringb.append("\n");
        }

        return stringb.toString();
    }


}
