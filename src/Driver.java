public class Driver {

    public static void main(String[] args) {
        RadixTrie t = new RadixTrie();
        t.insert("asdad");
        t.insert("asda");
        t.insert("hgfhf");
        t.insert("hrhfh");
        t.traverse(t.root);
    }

}
