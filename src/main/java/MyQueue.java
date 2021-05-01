public class MyQueue<K> {
        private final MyLinkedList<K>myQueueList;


        public MyQueue() {
            myQueueList = new MyLinkedList<>();
        }
        public void enqueue(INode<K>element){
            myQueueList.add(element);
        }
        public void printQueue(){
            myQueueList.printMyNodes();
        }

    }

