import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.TimeUnit;

class LockTwo implements Lock{
    private int victim;
    //线程本地索引，0或者1
    public void lock(){
        int i = ThreadID.get();
        victim = i;//让另一个线程先跑
        while(victim == i){} //等待
    }
    public void unlock() {}

    // Any class implementing Lock must provide these methods
  public Condition newCondition() {
    throw new java.lang.UnsupportedOperationException();
  }
  public boolean tryLock(long time,
      TimeUnit unit)
      throws InterruptedException {
    throw new java.lang.UnsupportedOperationException();
  }
  public boolean tryLock() {
    throw new java.lang.UnsupportedOperationException();
  }
  public void lockInterruptibly() throws InterruptedException {
    throw new java.lang.UnsupportedOperationException();
  }
}