public class MyLinkedList<K> {
    public INode<K>head;
    public INode<K>tail;
    public MyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void add(INode<K>newNode){
        if(this.tail==null){
            this.tail=newNode;
        }
        if(this.head==null){
            this.head=newNode;
        }
        else{
            INode<K>tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }
    public INode<K>popLast(){
        INode<K>tempNode=this.head;
        while (tempNode.getNext()!=tail){
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tail.setNext(null);
        return tail;
    }
    public void printMyNodes(){
        System.out.println("My Nodes: "+head);
    }


}
