public class Main {
    public static void main(String[] args) {
        System.out.println(nodeInfo());;
    }
    static Nodes node1 = new Nodes(3486,3513,-154);
    static Nodes node2 = new Nodes(2895,-2142,-443);
    static Nodes node3 = new Nodes(-3461,126,-600);
    static Nodes node4 = new Nodes(3341,345,0);
    static Nodes node5 = new Nodes(3236,3701,-1992);
    static Nodes node6 = new Nodes(4574,-2881,4970);
    static Nodes node7 = new Nodes(-1170,1606,-4100);
    public static String nodeInfo() {
        String str = "";
        Nodes node = new Nodes(0,0,0);
        str += "\nNode1: " + nodeDistance(node, node1);
        str += "\nNode2: " + nodeDistance(node, node2);
        str += "\nNode3: " + nodeDistance(node, node3);
        str += "\nNode4: " + nodeDistance(node, node4);
        str += "\nNode5: " + nodeDistance(node, node5);
        str += "\nNode6: " + nodeDistance(node, node6);
        str += "\nNode7: " + nodeDistance(node, node7);
        return str;
    }

    public static double nodeDistance(Nodes nod1, Nodes nod2) {
        return (Math.sqrt(Math.pow(nod1.getX() - nod2.getX(),2) + Math.pow(nod1.getY() - nod2.getY(),2) + Math.pow(nod1.getZ() - nod2.getZ(),2)));
    }
}