import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.lang.ThreadLocal;
import java.util.concurrent.TimeUnit;

class LockOne implements Lock{
    private boolean[] flag = new boolean[2];
    //线程本地索引，0或者1
    public void lock(){
        int i = ThreadID.get();
        int j = 1 - i;
        flag[i] = true;
        while(flag[j]){ //等待，直到flag[j] == false
        }
    }
    public void unlock(){
        int i = ThreadID.get();
        flag[i] = false;
    }

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