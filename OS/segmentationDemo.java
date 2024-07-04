import java.util.ArrayList;
import java.util.List;

public class segmentationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = new ArrayList<>();
		for (int i=1;i<=100;i++)
		{
			data.add("Item : "+i);
		}
		
		int segmentSize = 10;
		
		List<List<String>> segmentedData = getSegmentedData(data,segmentSize);
		
		for (int i=0;i<segmentedData.size();i++)
		{
			System.out.println("Segment "+(i+1)+ " : "+ segmentedData.get(i));
		}
	}
  static List<List<String>> getSegmentedData(List<String> data, int segmentSize) {
		// TODO Auto-generated method stub
	   List<List<String>> segments = new ArrayList<>();
	   int totalSize = data.size();
	   int numberOfSegments = (int)Math.ceil(totalSize/segmentSize);
	   
	   for (int i=0;i<numberOfSegments;i++)
	   {
		   int start = i*segmentSize;
		   int end = Math.min(start+segmentSize,totalSize);
		   segments.add(new ArrayList<>(data.subList(start, end)));
	   }
	   return segments;
	   
	}

}