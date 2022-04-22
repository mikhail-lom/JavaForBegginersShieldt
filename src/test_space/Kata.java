package test_space;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static void main(String[] args) {

        var t = new Node(new Node(new Node(null, null, 9),null,2), null,4);
        treeByLevels(new Node
                (new Node
                        (null, new Node(null, null, 4),//3rd level left-left
                                2),//2nd level left
                        new Node(new Node(null, null, 5),//3rd level left-right
                                new Node(null, null, 6),//3rd level right-left
                                3),//2nd level right
                        1));
    }
    public static List<Integer> treeByLevels(Node node) {
        List<Integer> resultList = new ArrayList<>();//sorted list as a result
        List<Node> upperLevelList = new ArrayList<>();//node list
        List<Node> lowerLevelList = new ArrayList<>();//node children list

        if (node == null)
        {
            return  new ArrayList<>();
        }
        if (node.left == null && node.right == null){
            resultList.add(node.value);
        }
        //initial params block

        upperLevelList.add(node);

        //tree unzipped
        if (node.left != null || node.right != null) {
            do {
                lowerLevelList.clear();
                for (Node n :
                        upperLevelList) {
                    resultList.add(n.value);
                    if (n.left != null) {
                        lowerLevelList.add(n.left);
                    }
                    if (n.right != null) {
                        lowerLevelList.add(n.right);
                    }
                }
                upperLevelList.clear();
                upperLevelList.addAll(lowerLevelList);
            } while (!lowerLevelList.isEmpty());
        }

        return resultList;
    }
}

//class NodeBuffer {
//    List<Integer> sortedList = new ArrayList<>();
//    List<Node> upperLevelList = new ArrayList<>();//node list
//    List<Node> lowerLevelList = new ArrayList<>();//node children list
//
//    NodeBuffer(Node node) {
//        if (node != null) {
//            addToList(node);
//            upperLevelList.add(node);
//            recursiveMethod(upperLevelList);
//        }
//        List<Integer> emptyList = new ArrayList<>();
//    }
//
//    void addToList(Node node) {
//        sortedList.add(node.value);
//    }
//
//    private void recursiveMethod(List<Node> nodeList) {
//        upperLevelList = nodeList;
//        if (!lowerLevelList.isEmpty()) {
//            for (Node n :
//                    upperLevelList) {
//                if (n != null) {
//                    addToList(n);
//                    if (n.left != null) {
//                        lowerLevelList.add(n.left);
//                    }
//                    if (n.right != null) {
//                        lowerLevelList.add(n.right);
//                    }
//                }
//            }
//            upperLevelList = lowerLevelList;
//        }
//        recursiveMethod(upperLevelList);
//    }
//
//    Kata kata = Kata.treeByLevels()
//}



//enum TreeBrunch{
////    NULL_VALUE(null, null, null), //empty node instance
//    LEAF, //node instance without children
//    LEFT_BRANCH, //node instance with only left branch
//    RIGHT_BRANCH, //node instance with only right branch
//    TWO_BRANCHES; //full node instance with 2 branches
//}