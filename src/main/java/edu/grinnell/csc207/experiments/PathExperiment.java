package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.Graph;

import java.io.PrintWriter;

/**
 * A quick experiment with paths.
 *
 * @author Your Name Here
 * @author Your Name Here
 * @author Samuel A. Rebelsky
 */
public class PathExperiment {

  /**
   * Run the experiment.
   *
   * @param args
   *   Command-line arguments (ignored).
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    Graph g = new Graph();

    g.addVertex("a");
    g.addVertex("b");
    g.addVertex("c");
    g.addVertex("d");
    g.addVertex("e");
    // g.addVertex("f");
    // g.addVertex("g");

    g.addEdge("a", "b", 2);
    g.addEdge("a", "c", 1);
    g.addEdge("c", "d", 5);
    g.addEdge("d", "e", 1);
    g.addEdge("b", "e", 4);

    int source = 0; // a
    int sink = 4; // e
    Integer[] path = g.shortestPath(source, sink);
    int i = sink;
    pen.println();
    do {
      pen.print(i + " <-- ");
      i = path[i];
    } while (i != source);
    pen.print(i);

    pen.println();
    // for (int i = 0; i < path.length; i++) {
    //   pen.print(path[i] + " ");
    // }
    // pen.println();

    
    // g.addEdge("d", "e", 0);
    // g.addEdge("e", "g", 0);
    // g.addEdge("e", "a", 0);
    // g.addEdge("c", "g", 0);
    // g.addEdge("g", "e", 0);

    // pen.println(g.path("a", "b"));
    // pen.println(g.path("a", "c"));
    // pen.println(g.path("a", "d"));
    // pen.println(g.path("a", "e"));
    // pen.println(g.path("a", "f"));
    // pen.println(g.path("a", "g"));
    // pen.println(g.path("a", "a"));
    // pen.println("Done");

    
  } // main(String[])

} // PathExperiment
