class base{
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("hello");
        this.x = x;
    }
    public void printMe(){
        System.out.println("i am constructor");
    }
}
class derived extends base{                       // extends keyword for inheritance
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());
        derived d = new derived();
        d.setY(5);
        System.out.println(d.getY());
    }
}
