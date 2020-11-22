public class LL {
    NodeWrapper head = null;
    LL (Node head){
        this.head = new NodeWrapper(head);
    }

public void addAfterHead (Node a){
    NodeWrapper new_Node = new NodeWrapper(a);
    if (head.next== null){
    head.next = new_Node;
    }else { 
        NodeWrapper temp = head.next;
        head.next = new_Node;
        new_Node.next = temp;
    }
}
public void displayLL (){
    NodeWrapper current = head.next;
    System.out.print(head.getNodeName() + "=>");
       while(current!=null){
           System.out.print(current.getNodeName());
           if(current.next != null){
               System.out.print( "|");
           }
           current = current.next;
}
System.out.println("|");
}
}