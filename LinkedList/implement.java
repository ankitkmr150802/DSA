
public class implement {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;

        //insert at end
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){ //for empty list
                head = temp;   
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }

        //insert at start
        void insertAtBegin(int val){
            Node temp = new Node(val);
            if(head == null){
                tail = temp;
            }
            else{
                temp.next = head;
            }
            head = temp;
        }

        //insert at index i
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == length()) {
                insertAtEnd(val);
                return;
            }
            else if(idx == 0){
                insertAtBegin(val);
                return;
            }
            else if (idx <0 || idx > length()) {
                System.out.println("wrong index");
                return;
            }
            for(int i = 0; i < idx-1 ; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        //get element
        void get(int idx){
            Node temp = head;

            if (idx < 0 || idx > length()-1) {
                System.out.println("wrong index");
                return;
            }

            for(int i = 0; i < idx; i++){
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

        //delete at index i
        void delete(int idx){
            Node temp = head;
            if(idx == 0){
                head = head.next;
                return;
            }
            else if(idx == length()-1){
                for(int i = 0; i < idx-1; i++){
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                return;
            }
            else if(idx<0 || idx > length()-1 ){
                System.out.println("deletion not possible! ");
                return;
            }

            for(int i = 0; i < idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;

        }

        //display
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println();
        }

        //length
        int length(){
            Node temp = head;
            int cnt = 0;
            while(temp != null){
                cnt++;
                temp = temp.next;
            }
            return cnt;
    
        }
    }

    public static void main(String[] args) {

        linkedList list = new linkedList();
        list.insertAtEnd(6);
        list.insertAtEnd(45);
        list.insertAtEnd(23);
        list.insertAtBegin(15); //insert at start
        list.insertAt(1, 32);
        // list.display();
        list.insertAt(5, 16);
        list.display();
        // list.get(1);
        list.delete(5);
        list.display();
        System.out.println(list.tail.data);

    }
    
}
