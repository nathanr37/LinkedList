public class Node<T>{
    private T data;
    Node next;
    Node prev;
    
    public Node(T t) {
        data = t;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T t) {
        data = t;
    }
    
    
}
