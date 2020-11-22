public class NodeWrapper {
    Node node;
    NodeWrapper next;
    NodeWrapper(Node node){
        this.node = node;
        next = null;
    }

public String getNodeName (){
    return node.name;
}
}