// look forward in the page reference string and decide which page
// needed to be replace

// replace the page that will not be used for the longest period of time
//in future

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
//Optimal Page Replacement
public class OPRDemo {

    public static void main(String[] args) {
        int[] pages = {1, 3, 0, 3, 5, 6, 3};
        int capacity = 3;
        System.out.println("Optimal Page Faults: " +
        pageFaultsOptimal(pages, capacity));
    }

    public static int pageFaultsOptimal(int[] pages, int capacity) {
       ArrayList<Integer> pageFrames = new ArrayList<>();
       int pageFaults = 0;
       
       for (int i=0;i<pages.length;i++)
       {
    	   int page = pages[i];
    	   if(!pageFrames.contains(page))
    	   {
    		   if(pageFrames.size() < capacity)
    		   {
    			   pageFrames.add(page);
    		   }
    		   else {
    			   int furthestIndex = -1;
    			   int frameToReplace = -1;
    			   
    			   for(int j=0;j<pageFrames.size();j++)
    			   {
    				   int currentFrame = pageFrames.get(j);
    				   int nextIndex = findNextOccurence(pages,i+1,currentFrame);
    				   
    				   if (nextIndex==-1)
    				   {
    					   frameToReplace=j;
    					   break;
    				   }
    				   else if(nextIndex > furthestIndex) {
    					   furthestIndex = nextIndex;
    					   frameToReplace = j;
    				   }
    				   
    			   }
//    			   replacing the frames
    			   pageFrames.set(frameToReplace,page);
    		   }
    		   pageFaults++;
    	   }
    	   
       }
       
       return pageFaults;

       
    }

	private static int findNextOccurence(int[] pages, int start, int page) {
		for(int i=start;i<pages.length;i++)
		{
			if (pages[i] == page)
			{
				return 1;
			}
		}
		return -1;
	}
}
