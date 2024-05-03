public class Nodes {
    private int x;
    private int y;
    private int z;
    private  int num;
    public Nodes(int x, int y, int z, int num) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.num = num;
    }
    public int getNum() {
        return num - 1;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }
}
