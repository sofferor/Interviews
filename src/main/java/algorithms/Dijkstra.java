//package algorithms;
//
//import com.sun.tools.javac.util.Pair;
//
//import java.util.*;
//
//public class Dijkstra {
//    public static <E> Map<Node<E>, Pair<Integer, Node<E>>> calc(Node<E> source, List<Node<E>> vertexes, Map<Edge<E>, Integer> edgeWightMap) {
//        Map<Node<E>, Pair<Integer, Node<E>>> nodeToDistanceAndPreviousNodeMap = new HashMap<>();
//        Queue<Pair<Node<E>, Integer>> nodeToDistanceHeap = new PriorityQueue<>((o1, o2) -> {
//            if (o1.snd == o2.snd) {
//                return 0;
//            } else if (o1.snd > o2.snd) {
//                return -1;
//            } else {
//                return 1;
//            }
//        });
//        for (Node<E> node : vertexes) {
//            nodeToDistanceAndPreviousNodeMap.put(node, new Pair<>(Integer.MAX_VALUE, null));
//            nodeToDistanceHeap.add(new Pair<>(node, Integer.MAX_VALUE));
//        }
//        nodeToDistanceAndPreviousNodeMap.put(source, new Pair<>(0, null));
//
//        while (!nodeToDistanceHeap.isEmpty()) {
//            Pair<Node<E>, Integer> nodeToDistancePair = nodeToDistanceHeap.remove();
//            Integer prevDistance = nodeToDistancePair.snd;
//            for (Node<E> neighbor : nodeToDistancePair.fst.getChildren()) {
//                Pair<Integer, Node<E>> distanceAndPreviousPair = nodeToDistanceAndPreviousNodeMap.get(neighbor);
//                int newDistance = prevDistance + edgeWightMap.get(new Edge<>(nodeToDistancePair.fst, neighbor));
//                if (newDistance < distanceAndPreviousPair.fst) {
//                    // the operation of update priority should be implemented in the priority queue class
//                    // it's the complexity of remove + add
//                    // also the remove & add operations should be log(n)
//                    nodeToDistanceHeap.updatePriority(new Pair<>(neighbor, newDistance));
//                    distanceAndPreviousPair.first = newDistance;
//                    distanceAndPreviousPair.second = nodeToDistancePair.first;
//                }
//            }
//        }
//
//        return nodeToDistanceAndPreviousNodeMap;
//    }
//}
