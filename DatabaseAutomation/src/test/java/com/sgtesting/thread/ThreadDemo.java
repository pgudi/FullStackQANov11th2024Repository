package com.sgtesting.thread;
class MyClass implements Runnable
{
    @Override
    public void run() {
        showOddNumbers();
    }

    public synchronized void showOddNumbers()
    {
        try
        {
            for(int i=10;i<=30;i++)
            {
                Thread.sleep(1000);
                if(i%2==1)
                {
                    System.out.println(Thread.currentThread().getName()+" displays Odd Number :"+i);
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyClass job=new MyClass();

        Thread t1=new Thread(job);
        t1.setName("Alpha");
        t1.start();

        Thread t2=new Thread(job);
        t2.setName("Omega");
        t2.start();
    }
}
