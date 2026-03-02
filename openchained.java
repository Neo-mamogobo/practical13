public class openchained {

    static class openhash{
         int[] table;
         int size;

         public void openchained(int size){
             this.size = size;
             table = new int[size];

             for(int i = 0; i < size; i++){
                 table[i] = -1;
             }
         }
         private int hash(int key){
             return key %  size;
         }
         public void insect( int item){
             int index = hash(item);

             while(table[index] != -1) {
                 index = (index + 1) % size;
             }
             table[index] = item;
         }
         public void delete(int item){
             int index = hash(item);
             int start = index;

             while(table[index] != -1){
                 if(table[index]== item){
                     table[index] =-2;
                     return;
                 }
                 if(table[index])
             }
         }
    }

}
