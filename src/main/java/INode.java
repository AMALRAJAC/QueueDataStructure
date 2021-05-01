
public interface INode<K>{
    K getKey();
    void setKey(K key);
    INode<K>getNext();
    void setNext(INode<K>next);

}
class MyNode<K> implements INode<K> {
    public K key;
    public INode<K>next;
    public MyNode(K key){
        this.key=key;
        this.next=null;
    }
    @Override
    public K getKey(){
        return key;
    }
    @Override
    public void setKey(K key){
        this.key=key;
    }
    public INode<K> getNext(){
        return next;
    }
    public void setNext(INode<K> next){
        this.next=next;
    }
    @Override
    public String toString(){
        StringBuilder myNodeString=new StringBuilder();
        myNodeString.append("MyNode{"+"key=").append(getKey()).append('}');
        if(next!=null){
            myNodeString.append("->").append(next);
        }
        return myNodeString.toString();
    }


}
