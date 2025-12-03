import java.util.*;

public class tugasDfs {
    static Map<String, List<String>> graph = new HashMap<>();
    static Set<String> visited = new HashSet<>();

    public static void dfs(String current, String target){
        System.out.println("mengunjungi : " + current);

        if(current.equals(target)){
            System.out.println("node berhasil ditemukan : " + target);
        }

        visited.add(current);

        for(String neighbor : graph.getOrDefault(current, Collections.emptyList())){
            if(!visited.contains(neighbor)){
                dfs(neighbor, target);
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
        dfs(start,target);
    }

    }


