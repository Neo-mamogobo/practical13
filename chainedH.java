public class chainedH {

    static class Node{
        int data;
        Node next;
        private int size;
        private Node[] table;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        static class ChainHash{
            private Node[] table;
            private int size;
        }
        public void ChainHash(int size){
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
        public boolean search(int item){
            int index = hash(item);
            Node current  = table[index];
            
            while (current != null){
                if(current.data == item){
                    return true;
                }
                current = current.next;
            }
            return false;
        }
        public void delete(int item) {
            int index = hash(item);
            Node current = table[index];
            Node prev = null;

            while (current != null) {
                if (current.data == item) {
                    if (prev.data == item) {
                        table[index] = current.next;
                    } else {
                        prev.next = current.next;
                    }
                    return;
                }
                prev = current;
                current = current.next;
            }
        }
        public void display(){
           for(int i = 0; i < size; i++){
               System.out.println(i);
               Node current = table[i];
               
               while(current != null){
                   System.out.println(current.data + " to ");
                   current = current.next;
               }
           }
        }
    }
}
