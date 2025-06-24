

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Main {
    int index = -1;

    public Node buildTree(int[] nodes) {
        index++;
        if (index >= nodes.length || nodes[index] == -1) {
            return null;
        }
        Node newnode=new Node(nodes[index]);
        newnode.left=buildTree(nodes);
        newnode.right=buildTree(nodes);
        return newnode;
    }

    public void display(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            display(root.left);
            display(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1,2,-1,3,4,-1,5,6,-1,7,8 };
        Main root = new Main();
        Node Root = root.buildTree(nodes);
        root.display(Root);
    }
}

