public class CompileTimeExecution {
    public static void main(String[] args){
        Thread T = new Thread(()->{
            try{
                System.out.println("Thread Sleeping");
                Thread.sleep(5000);
            }catch(InterruptedException e){
                //TODO : Handle Exception
                System.out.println("Sleep Interrupted");
            }
        });
        T.start();
        //T.interrupt();
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            //TODO : Handle Exception
            System.out.println("Not T");
        }
        T.interrupt();
    }
}
