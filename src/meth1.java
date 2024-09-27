
class AA{
   public int harry(){
       return 4;
   }
   public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class BB extends AA {
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class b");
    }
    public void meth3() {
        System.out.println("I am method 3 of class B");
    }
}


public class meth1
{
    public static void main(String[] args) {
       AA c=new AA();
       c.meth2();
       BB d=new BB();
       d.meth2();

    }
    }



