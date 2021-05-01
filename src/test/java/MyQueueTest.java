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
        myQueue.printQueue();
        myQueue.printQueue();


    }
}
