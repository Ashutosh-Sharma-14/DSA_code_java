public class Reverse_Linkedlist {
    class LL {
        Node head;
        private int size;

        //    what is the need for this piece of code
        LL() {
            size = 0;
        }

        class Node {
            int data;
            Node next;

            //        creating a constructor of node class
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void print(){
            Node currnode = head;
            while(currnode != null){
                System.out.print(currnode.data + "-->");
                currnode = currnode.next;
            }
            System.out.print("null");
            System.out.println();
        }

    }

    public static void main(String[] args) {

    }
}
