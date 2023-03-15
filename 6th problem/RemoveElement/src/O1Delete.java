import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class O1Delete<x> {

    private Map<x, Integer> indexMap;
    private List<x> items;

    public O1Delete() {
        indexMap = new HashMap<>();
        items = new ArrayList<>();
    }

    public boolean add(x item) {
        if (indexMap.containsKey(item)) {
            return false;
        }
        indexMap.put(item, items.size());
        items.add(item);
        return true;
    }

    public boolean remove(x item) {
        Integer index = indexMap.get(item);
        if (index == null) {
            return false;
        }

        int lastIndex = items.size() - 1;
        x lastItem = items.get(lastIndex);
        items.set(index, lastItem);
        items.remove(lastIndex);

        indexMap.put(lastItem, index);
        indexMap.remove(item);
        return true;
    }

    public int size() {
        return items.size();
    }

    public static void main(String[] args) {
        O1Delete<Integer> dataStructure = new O1Delete<>();

        dataStructure.add(1);
        dataStructure.add(2);
        dataStructure.add(3);

        System.out.println("Before deleting data: " + dataStructure.size());

        int indexToRemove = 1;
        boolean removed = dataStructure.remove(indexToRemove);
        if (removed) {
            System.out.println("Delete some index" + indexToRemove);
        } else {
            System.out.println("Wrong index!!!");
        }

        System.out.println("After deleting data: " + dataStructure.size());
    }
}