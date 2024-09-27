public class UsingAnonymus
{
    public static void main(String[] args) {

        Thread rp =new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Dipta");
            }
        });
        rp.start();

    }
}
