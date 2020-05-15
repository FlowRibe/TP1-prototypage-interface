package tp1;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;

public class Graphs
{
    private Graph graph;
    private int itNodes;    //Iterateur identifiant les points
    private int itEdge;     //Iterateur identifiant les segments

    public Graphs(String nom) {
        graph = new SingleGraph(nom);
        itNodes = 0;
        itEdge = 0;
    }

    //GESTION DES POINTS
    public void createNode() {
        graph.addNode(Integer.toString(itNodes));
        itNodes++;
    }

    public void removeNode() {
        if(itNodes != 0)
        {
            graph.removeNode(Integer.toString(itNodes-1));
            itNodes--;
        }
    }

    //Gestion des segments
    public void createEdge(int a, int b) {
        graph.addEdge(Integer.toString(itEdge), Integer.toString(a), Integer.toString(b));
        itEdge++;
    }

    public void removeEdge() {
        if(itEdge != 0)
        {
            graph.removeEdge(Integer.toString(itEdge-1));
            itEdge--;
        }
    }



    public Graph getGraph() {
        return graph;
    }
}
