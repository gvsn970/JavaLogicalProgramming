public class ParseTree {
    private String s;
    private ParseTree left, right;
   
    // creat the parse tree from standard input
    public ParseTree() {
    	
       // s = StdIn.readString();
        if (s.equals("+") || s.equals("*")) {
            left  = new ParseTree();
            right = new ParseTree();
        }
    }

    // evaluate the parse tree
    public int eval() {
        if      (s.equals("+")) return left.eval() + right.eval();
        else if (s.equals("*")) return left.eval() * right.eval();
        else                    return Integer.parseInt(s);
    }

    // preorder traversal
    public String toString() {
        if (s.equals("+") || s.equals("*"))
            return s + " " + left + " " + right;
        else
            return s;
    }

    // test out the parse tree
    public static void main(String[] args) {
        ParseTree tree = new ParseTree();
        System.out.println(tree);
        System.out.println(tree.eval());
    }

}