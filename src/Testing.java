import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		int myLoc = 0;
		int[] cabId = { 1, 2, 3, 4 };
		int[] dist = { 2, 5, 7, 1 };
		
//		Scanner sc = new Scanner(System.in);
//		myLoc = sc.nextInt();
		quicksort(dist, 0, dist.length - 1);
		System.out.println("Nearest Cab Distance"+dist[0]);
//		for (int i = 0; i < dist.length; i++) {
//			System.out.print(dist[i] + " ");
//		}
	}

	private static void quicksort(int[] dist, int low, int high) {
		if (low < high) {
			int pivot = partition(dist, low, high);
			quicksort(dist, low, pivot - 1);
			quicksort(dist, pivot + 1, high);
		}

	}

	private static int partition(int[] dist, int low, int high) {
		int pivot = dist[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (dist[j] <= pivot) {
				i++;
				int temp = dist[i];
				dist[i] = dist[j];
				dist[j] = temp;
			}
		}
		int temp1 = dist[i + 1];
		dist[i + 1] = dist[high];
		dist[high] = temp1;
		return i + 1;
	}
	// New comment added
	// 1 more comment got added
}
