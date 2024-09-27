public class mulllltithread
{
    public static void main(String[] args) {
        heyThread k=new heyThread();
        Thread tt=new Thread(k,"my thread 1");
        tt.start();
        System.out.println(tt.getName());
        Thread.currentThread();
        Thread kkk=Thread.currentThread();
        System.out.println("inside the main method: "+Thread.currentThread().getName());


    }
}
class heyThread extends pp implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside the run method: "+Thread.currentThread().getName());
        for(int i=0;i<10;i++){
            System.out.println("1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class pp{

}
