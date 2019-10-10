public class RadixTrie {
    Node empty;
    Node root;

    public RadixTrie() {
        empty = new Node();
        root = new Node();
    }
    public void insert(String key) {
        char[] chars = key.toLowerCase().toCharArray();
        Node x = root;
        for (int i = 0; i < chars.length - 1; i++) {
            int index = chars[i] - 'a';
            if (x.children[index] != null) {
                x = x.children[index];
            } else {
                x.childrenCount++;
                Node temp = new Node();
                temp.ch = chars[i];
                x.children[index] = temp;
                x = x.children[index];
            }
        }
        int index = chars[chars.length - 1] - 'a';
        if (x.children[index] != null) {
            x.children[index].isWord = true;
            x.children[index].word = key;
        } else {
            x.childrenCount++;
            Node temp = new Node();
            temp.ch = chars[chars.length - 1];
            temp.isWord = true;
            temp.word = key;
            x.children[index] = temp;
        }
    }

    public void traverse(Node n) {
        if (n.isWord) {
            System.out.println(n.word);
        }
        for (int i = 0; i < n.childrenCount; i++) {
            traverse(getIndex(n.children, i));
        }
    }

    public Node getIndex(Node[] nodes, int num) {
        int count = 0;
        for (Node n : nodes) {
            if (n != null) {
                if (count == num) {
                    return n;
                } else {
                    count++;
                }
            }
        }
        return null;
    }
}
