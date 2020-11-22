import java.util.ArrayList;

public class Graph {
    ArrayList <LL> list = new ArrayList<>();
    Graph(){}
public void addVertex (Node n){
        LL li = new LL(n);
        list.add(li);
}
public void displayList (){
    for (LL li: list){
        System.out.println(li.head.getNodeName());
    }
}
public void connect (Node a, Node b){
    int index=0;
    int index2=0;
    for(LL li : list){
        if(li.head.node.equals(a)){
             index = list.indexOf(li);
        }else if (li.head.node.equals(b)){
            index2 = list.indexOf(li);
        }
    }
    LL li = list.get(index);
    li.addAfterHead(b);
    
    LL li2 = list.get(index2);
    li2.addAfterHead(a);
}
public void displayConnected (Node a){
   for (LL li : list){
       if(li.head.node.equals(a)){
           li.displayLL();
       }
   }
}
}