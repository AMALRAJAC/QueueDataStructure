public class MyQueue<K> {
        private final MyLinkedList<K>myQueueList;


        public MyQueue() {
            myQueueList = new MyLinkedList<>();
        }
        public void enqueue(INode<K>element){
            myQueueList.add(element);
        }
        public INode<K>peak(){
            return myQueueList.head;
        }
        public INode<K>dequeue(){
            return myQueueList.popLast();
        }
        public void printQueue(){
            myQueueList.printMyNodes();
            System.out.println(myQueueList.head.getKey());
            System.out.println(myQueueList.tail.getKey());
        }

    }

