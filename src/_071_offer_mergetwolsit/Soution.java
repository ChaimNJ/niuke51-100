package _071_offer_mergetwolsit;

class Node {
    int val;
    Node next;

    public Node(int val, Node node) {
        super();
        this.val = val;
        this.next = node;
    }
}

public class Soution {
    public static void main(String[] args) {
        Node node = new Node(1,new Node(3,new Node(5,new Node(6,null))));
        Node node2 = new Node(2,new Node(4,new Node(6,new Node(7,null))));
        Node re = merge(node,node2);
        while(re!=null){
            System.out.println(re.val);
            re=re.next;
        }
    }

    public static Node merge(Node n1, Node n2) {
        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }
        Node node = null;
        if (n1.val < n2.val) {
            node = n1;
            node.next = merge(n1.next, n2);
        } else {
            node = n2;
            node.next = merge(n1, n2.next);
        }
        return node;
    }
}
