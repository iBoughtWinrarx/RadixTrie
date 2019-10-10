import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Node implements Comparable<Node> {
    public char ch;
    public String word;
    public boolean isWord;
    public Node[] children = new Node[26];
    int childrenCount = 0;

    public int compareTo(Node n) {
        return n.ch - ch;
    }
}
