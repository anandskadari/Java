public class Multiple3and5 {
    public static void main(String[] args)
    {
        MyNumber myNum = new MyNumber();
        new Thread(new Multiple3(myNum), "Thread 3:").start();
        new Thread(new Multiple5(myNum), "Thread 5:").start();
    }
}

class Multiple3 implements Runnable{
    MyNumber myNum = null;
    Multiple3(MyNumber myNum)
    {
        this.myNum = myNum;
    }

    public void run(){
        for(int i=0;i<20;i++)
        {
            synchronized (myNum) {
                if (!myNum.mul5IsDone && (myNum.mul5 < myNum.mul3)) {
                    try {
                        myNum.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + myNum.mul3);
                myNum.mul3 = myNum.mul3 + 3;
                myNum.notifyAll();
            }
        }
        myNum.mul3IsDone = true;
    }
}

class Multiple5 implements Runnable{
    MyNumber myNum = null;
    Multiple5(MyNumber myNum)
    {
        this.myNum = myNum;
    }

    public void run(){
        for(int i=0;i<20;i++)
        {
            synchronized (myNum)
            {
                if( !myNum.mul3IsDone && ((myNum.mul3 < myNum.mul5))){
                    try {
                        myNum.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(myNum.mul5 % 3 != 0) {
                    System.out.println(Thread.currentThread().getName() + " " + myNum.mul5);
                }
                myNum.mul5 = myNum.mul5 + 5;
                myNum.notify();
            }
        }
        myNum.mul5IsDone = true;
    }
}

class MyNumber{
    int mul3 = 3;
    int mul5 = 5;
    boolean mul3IsDone = false;
    boolean mul5IsDone = false;
}

