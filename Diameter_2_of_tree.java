public class Diameter_2_of_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }
    static class Info{
        int dia;
        int ht;
        Info(int dia,int ht){
            this.dia = dia ;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root ){
        if(root == null){
            return new Info(0,0);
        }
        Info lftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int diam = Math.max(Math.max(lftInfo.dia,rightInfo.dia),lftInfo.ht+rightInfo.ht+1);
        int hght= Math.max(lftInfo.ht,rightInfo.ht)+1;
        return new Info(diam,hght);
            
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(7);
        root.right.right.right = new Node(6);
        System.out.println(diameter(root).dia);
        System.out.println(diameter(root).ht);

    }
}
