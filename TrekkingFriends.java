
public class TrekkingFriends {
	
	public static long length_of_track(int[] element_array)
	{
		long length_of_track = 1;
		int divisor = 2;
		
		while (true) {
			int counter = 0;
			boolean divisible = false;
			
			for (int i = 0; i < element_array.length; i++) {

			

				if (element_array[i] == 0) {
					return 0;
				}
				else if (element_array[i] < 0) {
					element_array[i] = element_array[i] * (-1);
				}
				if (element_array[i] == 1) {
					counter++;
				}

				
				if (element_array[i] % divisor == 0) {
					divisible = true;
					element_array[i] = element_array[i] / divisor;
				}
			}

		
			if (divisible) {
				length_of_track = length_of_track * divisor;
			}
			else {
				divisor++;
			}

			
			if (counter == element_array.length) {
				return length_of_track;
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		int[] element_array = { 10, 20, 12};
		System.out.println( "Total length of Track= "+ length_of_track(element_array));
	}
}