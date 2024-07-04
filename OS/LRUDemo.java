
import java.util.HashMap;
import java.util.LinkedList;

public class LRUDemo {

    public static void main(String[] args) {
        int[] pages = {1, 3, 0, 3, 5, 6, 3};
        int capacity = 3;

        System.out.println("LRU Page Faults: " + pageFaultsLRU(pages, capacity));
    }

    public static int pageFaultsLRU(int[] pages, int capacity) {
        LinkedList<Integer> pageList = new LinkedList<>();
        HashMap<Integer, Integer> pageMap = new HashMap<>();
        int pageFaults = 0;

        for (int i = 0; i < pages.length; i++) {
            int page = pages[i];

            if (!pageMap.containsKey(page)) {
                if (pageList.size() == capacity) {
                    int lruPage = pageList.removeFirst();
                    pageMap.remove(lruPage);
                }
                pageList.add(page);
                pageMap.put(page, i);
                pageFaults++;
            } else {
                pageList.remove((Integer) page);
                pageList.add(page);
            }
        }

        return pageFaults;
    }
}
