import java.util.*;

class ProductSum {
  public static int productSum(List<Object> array) {
    // Write your code here.

    return productSum(array, 1);
  }
	public static int productSum(List<Object> array, int level){
		int sum = 0;
		for (Object element : array){
			if (element instanceof ArrayList){
					sum += productSum((ArrayList) element, level+1);
			}else {
				sum += (int)element;
			}
		}
		return sum*level;
	}
}
