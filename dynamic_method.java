class smartphone{
        public void greet(){
                System.out.println("ashutosh");
        }
        public void name(){
                System.out.println("hello");
        }
}
class phone extends smartphone{
        public void swagat(){
                System.out.println("ashutosh");
        }
        public void name(){
                System.out.println("bye");
        }
}
public class dynamic_method{
        public static void main(String[] args) {
                phone obj = new phone();
                smartphone smobj = new smartphone();
                obj.name();
        }
}