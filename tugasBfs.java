import java.util.*;

public class tugasBfs {
    static Map<String, List<String>> graph = new HashMap<>();

    public static void bfs(String start, String target){
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){
            String current = queue.poll();
            System.out.println("mengecek node : " + current);

            if(current.equals(target)){
                System.out.println("node ditemukan : " + target);
                return;
            }

            for(String neighbor : graph.getOrDefault(current,Collections.emptyList())){
                if (!visited.contains(neighbor)){
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args){
        graph.put("a1", Arrays.asList("a2", "a3"));
        graph.put("a2", Arrays.asList("a4", "a5"));
        graph.put("a3", Arrays.asList("a6", "a8"));
        graph.put("a4", Arrays.asList());
        graph.put("a5", Arrays.asList());
        graph.put("a6", Arrays.asList("a7"));
        graph.put("a7", Arrays.asList());
        graph.put("a8", Arrays.asList());

        String start = "a1";
        String target = "a8";
        bfs(start,target);
    }
}