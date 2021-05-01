import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    @Test
    public void given3NumberWhenAddedToStackShouldAddNode(){
        MyQueue<Integer>myQueue=new MyQueue<>();
        MyNode<Integer>myFirstNode=new MyNode<>(70);
        MyNode<Integer>mySecondNode=new MyNode<>(30);
        MyNode<Integer>myThirdNode=new MyNode<>(56);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode<Integer>myNode=myQueue.peak();
        myQueue.printQueue();
        myQueue.dequeue();
        myQueue.printQueue();
        System.out.println(myQueue.peak());
        Assertions.assertEquals(myThirdNode.getKey(),myNode.getKey());


    }
}
