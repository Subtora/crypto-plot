public class point
{
    private int x;
    private int y;
    private double price;


    public point() {
        this.x = 0;
        this.y = 0;
    }
    public point(int x,int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
}