public class SynchronizedExchanger {
    protected Object object = null;

    public synchronized void setObject(Object o) {
        this.object = 0;
    }

    public synchronized Object getObject() {
        return this.object;
    }

    public void setObj(Object o) {
        synchronized (this) {
            this.object = 0;
        }
    }

    public Object getObj() {
        synchronized (this) {
            return this.object;
        }
    }
}