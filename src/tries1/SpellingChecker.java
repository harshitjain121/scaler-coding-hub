import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Node{
    HashMap<Character, Node> hm;
    int pf;
    int c;

    Node(){
        this.hm = new HashMap<Character,Node>();
        this.pf = 0;
        this.c = 0;
    }
}
public class SpellingChecker {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>(
            Arrays.asList("ab","ab", "abc", "abcd", "abcde", "abcdef", "abcdefg")
        );
        ArrayList<String> B = new ArrayList<>(
            Arrays.asList("a", "b", "ab", "abcd")
        );
        solve(A,B);
    }
    public static ArrayList<Integer> solve(ArrayList<String> A, ArrayList<String> B) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Node root = new Node();
        for(String s : A){
            insert(root, s);
        }
        
        for(String w : B){
            list.add(search(root, w));  
        }
        System.out.println(list);
        return list;
    }

    //insert word into the TRIE
public static void insert(Node cur, String w){
    // Node cur = root;
    for(int i=0; i<w.length(); i++){
        char ch = w.charAt(i);

        //check if it is present in the trie or not
        if(!cur.hm.containsKey(ch)){
            Node t = new Node();
            cur.hm.put(ch, t);
        }
        //update current Node
        cur = cur.hm.get(ch);
        cur.pf++;
    }
    cur.c++;
}

//search for a word
public static int search(Node cur, String w){
    // Node cur = root;
    for(int i=0; i<w.length(); i++){
        char ch = w.charAt(i);

        //check if it is present in the trie or not
        if(!cur.hm.containsKey(ch)){
            //not containsKey
            return 0;
        }
        //update current Node
        cur = cur.hm.get(ch);
    }
    return cur.c == 0 ? 0 : 1;
}
}

