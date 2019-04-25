public class MLinkedList<T> {
    public MLinkedList<T> next;
    public T data;

    public void add(T data)
    {
        this.data = data;
    }

    public MLinkedList<T> next()
    {
        next = new MLinkedList<T>();
        return next;
    }

    public T get()
    {
        return data;
    }
}
