public class Main {
    public static void main(String[] args) {
        double[][] paths = {
                {0.0, 5693.138, 7741.543, 3175.054, 1864.427, 8265.734, 6394.208},
                {5693.139, 0.0, 6750.348, 2565.216, 6054.447, 5715.394, 6629.131},
                {7741.543, 6750.348, 0.0, 6831.922, 7718.037, 10228.791, 4437.237},
        {3175.053, 2565.216, 6831.922, 0.0, 3904.078, 6052.128, 6224.888},
            {1864.426, 6054.447, 7718.037, 3904.077, 0.0, 9673.800, 5314.651},
                {8265.733, 5715.394, 10228.791, 6052.128, 9673.800, 0.0, 11635.789},
                    {6394.208, 6629.131, 4437.237, 6224.888, 5314.651, 11635.789, 0.0}
};
        nodePaths(node1);
        nodePaths(node2);
        nodePaths(node3);
        nodePaths(node4);
        nodePaths(node5);
        nodePaths(node6);
        nodePaths(node7);
        for (double[] i : arr) {
            System.out.print("[");
            for (double j : i) {
                System.out.print(j + ", ");
            }
            System.out.println("]");
        }
    }
    static double[][] arr = new double[7][7];
    static Nodes node1 = new Nodes(3486,3513,-154,1);
    static Nodes node2 = new Nodes(2895,-2142,-443,2);
    static Nodes node3 = new Nodes(-3461,126,-600,3);
    static Nodes node4 = new Nodes(3341,345,0,4);
    static Nodes node5 = new Nodes(3236,3701,-1992,5);
    static Nodes node6 = new Nodes(4574,-2881,4970,6);
    static Nodes node7 = new Nodes(-1170,1606,-4100,7);
    public static void nodePaths(Nodes node) {
        arr[node.getNum()][0] = nodeDistance(node, node1);
        arr[node.getNum()][1] = nodeDistance(node, node2);
        arr[node.getNum()][2] = nodeDistance(node, node3);
        arr[node.getNum()][3] = nodeDistance(node, node4);
        arr[node.getNum()][4] = nodeDistance(node, node5);
        arr[node.getNum()][5] = nodeDistance(node, node6);
        arr[node.getNum()][6] = nodeDistance(node, node7);
    }
    public static double getSmallestNum(int row) {
        int index = 0;
        int currentIndex = 0;
        double lowest = 10000;
        for (double i : arr[row]) {

             if (lowest > i && i != 0) {
                 lowest = i;
                 System.out.println(lowest);
                 index = currentIndex;
             }
             currentIndex++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i][index] = 0;
        }
        return lowest;
    }
    public static double nodeDistance(Nodes nod1, Nodes nod2) {
        return (Math.sqrt(Math.pow(nod1.getX() - nod2.getX(),2) + Math.pow(nod1.getY() - nod2.getY(),2) + Math.pow(nod1.getZ() - nod2.getZ(),2)));
    }
}