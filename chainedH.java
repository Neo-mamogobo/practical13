public class chainedH {

    static class Node{
        int data;
        Node next;
        private int size;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        static class chainhash{
            private Node[] table;
            private int size;
        }
        public void chainhash(int size){
            this.size = size;
            table = new Node[size];
        }
        private int hash(int item){
            return item % size;
        }
        public void insert(int item){
            int index = hash(item);
            Node newNode = new Node(item);
            newNode.next = table[index];
            table[index] = newNode;
        }
    }
}
