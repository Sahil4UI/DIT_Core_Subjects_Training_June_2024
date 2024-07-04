import java.util.ArrayList;
import java.util.List;

public class PagingDemo {
// data , paging parameters
//	total page count
//	data in every page
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> dataList = new ArrayList<>();
		for (int i=1;i<=100;i++)
		{
			dataList.add("item "+i);
		}
		
		int pageSize = 10;
		int currentPage=2;
		
		List<String> paginatedData = getPaginatedData(dataList,currentPage,pageSize);
		
		for (String item: paginatedData) {
			System.out.println(item);
		}
		
	}

private static List<String> getPaginatedData(List<String> dataList, int currentPage, int pageSize) {
	
	int startItem = (currentPage-1) * pageSize;
	int endItem = Math.min(startItem+pageSize, dataList.size());
	
	if (startItem>=dataList.size())
	{
		return new ArrayList<>();
	}
	
	return dataList.subList(startItem, endItem);
}

}
