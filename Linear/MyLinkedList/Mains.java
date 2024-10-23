public class Mains {
    public static void main(String args[]){
        MyLinkedList list = new MyLinkedList();
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        // list.insertAt(1,0);
        list.reverseRec();
        // list.del_from_end();
        System.out.println(list.toString());
        // System.out.println(list.count());
    }
}
