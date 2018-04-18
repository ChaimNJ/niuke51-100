package _070_offer_reverseList;

class Node{
    int val;
    Node next;

    public Node(int val) {
        super();
        this.val=val;
    }
}
public class Soution {
    public static void main(String[] args) {
        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//        Node node5 = new Node(5);
//        Node node6 = new Node(6);
//        Node node7 = new Node(7);
//        node1.next=node2;
//        node2.next=node3;
//        node3.next=node4;
//        node4.next=node5;
//        node5.next=node6;
//        node6.next=node7;
        Node re = reverse(null);
        while(re!=null){
            System.out.println(re.val);
            re=re.next;
        }

    }
    public static Node reverse(Node node){
        if(node==null){
            return null;
        }
        Node reversenode = null;
        Node cur = node;
        Node pre = null;
        while(cur!=null){
            Node nex = cur.next;
            if(nex==null){
                reversenode = cur;
            }
            cur.next=pre;
            pre = cur;
            cur = nex;
        }
        return reversenode;
    }
}
