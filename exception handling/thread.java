class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("processing");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        System.out.println("running");
    }
}

class thread{
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}