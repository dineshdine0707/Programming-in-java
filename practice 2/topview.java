import java.util.*;

public class topview {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public void topView(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        q.add(new Info(root, 0));
        q.add(null);
        int min = 0, max = 0;

        while (!q.isEmpty()) {
            Info current = q.remove();
            if (current == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(current.hd)) {
                    map.put(current.hd, current.node);
                }
                if (current.node.left != null) {
                    min = Math.min(min, current.hd - 1);
                    q.add(new Info(current.node.left, current.hd - 1));
                }
                if (current.node.right != null) {
                    max = Math.max(max, current.hd + 1);
                    q.add(new Info(current.node.right, current.hd + 1));
                }
            }
        }
        for(int i=min;i<=max;i++)
        {
            System.out.print(map.get(i).data+" ");
        }
    }

    public static void main(String[] args) {
        topview ob = new topview();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        ob.topView(root);
    }
}
