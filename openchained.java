public class openchained {

    static class openhash{
         static int[] table;
         static int size;

         public void openchained(int size){
             this.size = size;
             table = new int[size];

             for(int i = 0; i < size; i++){
                 table[i] = -1;
             }
         }
         private static int hash(int key){
             return key %  size;
         }
         public void insect( int item){
             int index = hash(item);

             while(table[index] != -1) {
                 index = (index + 1) % size;
             }
             table[index] = item;
         }
         public static void delete(int item){
             int index = hash(item);
             int start = index;

             while(table[index] != -1){
                 if(table[index]== item){
                     table[index] =-2;
                     return;
                 }
                 if(table[index]==start){
                     return;
                 }
                 index = (index + 1) % size;
             }
         }
         public static boolean search (int item){
            int index = hash(item);

            while(table[index] != -1){
                if(table[index] == item){
                    return true;
                }
                index = (index + 1) % size;
            }
             return false;
         }
         public void lookup(){
             for(int i = 0; i < size; i++){
                 if(table[i] == -1){
                     System.out.println(i);
                 }else if(table[i]==-2){
                     System.out.println(i);
                 }else System.out.println(table[i]);
             }
         }
    }

}
