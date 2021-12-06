class abc{
    int a;
    public int getA() {
        return a;
    }
    abc(int a){
        this.a = a;              // this is a reference keyword for current object
    }
    public int returnone(){
        return 1;
    }
}
class xyz extends abc{
    xyz(int c){
        super(c);               // ref variable used to refer immediate parent class obj
        System.out.println("ashutosh");
    }
}
public class keyword{
    public static void main(String[] args) {
        abc e = new abc(4);
        xyz d = new xyz(5);
        System.out.println(e.getA());
    }
}
