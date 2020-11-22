class GraphTest {
    public static void main (String [] args){
        Graph graph = new Graph();
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(a);
        graph.addVertex(b);
       // graph.displayList();
        graph.connect(a, b);
        graph.connect(a, c);
        graph.connect(a, d);
        graph.displayConnected(a);
       // graph.displayConnected(b);
       //graph.displayConnected(c);
       
    }
    
}