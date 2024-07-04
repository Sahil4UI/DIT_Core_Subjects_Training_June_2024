import java.util.LinkedList;
import java.util.Queue;

public class FIFODemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] pages = {1,3,0,3,5,6,3};
		int capacity = 6;
		
		System.out.println("PAGE FAULT :"
		+pageFaults(pages,capacity));

	}

	static int pageFaults(int[] pages, int capacity) {
		// TODO Auto-generated method stub
		Queue<Integer> pageQueue = new LinkedList<>();
		int pageFault = 0;
		
		for (int page : pages)
		{
			if (!pageQueue.contains(page))
			{
				if (pageQueue.size()==capacity)
				{
					System.out.println("QUEUE IS FULL , REMOVE FIRST ");
					pageQueue.poll();
				}
				System.out.println("There is a space in Queue , ADD page");
				pageQueue.add(page);
				pageFault++;
			}
		}
		return pageFault;
	}

}
