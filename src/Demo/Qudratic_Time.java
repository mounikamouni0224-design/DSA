package Demo;
//
//public class Qudratic_Time {
//	public static void main(String[] args) {
//		int n = 5;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				System .out.println(i + " "+ j);
//			}
//		}
//	}
//
//}


//duplicate page
//public class Qudratic_Time {
//	public static void main(String[] args) {
//		int[] arr= {2,8,3,7,5,5};
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i +1; j < arr.length; j++) {
//				if (arr[i] + arr[j] == 10) {
//					System.out.println(arr[i] + " + "+ arr[j] + " = 10 ");
//				}
//			}
//		}
//	}
//}



//public class Qudratic_Time {
//	public static void main(String[] args) {
//		int[] arr = {10, 20, 30, 40, 50};
//		boolean sorted = true;
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] > arr[i + 1]) {
//				sorted = false;
//				break;
//				}
//		}
//		if (sorted) {
//			System.out.println("Sorted");
//		}else {
//			System.out.println("Not Sorted");
//		}
//	}
//}


//Count frequency
  public class Qudratic_Time {
	 public static void main(String[] args) {
		 int[] arr = {2, 4, 5, 7, 8};
		 for (int i = 0; i < arr.length; i++) {
			 boolean alreadyCounted = false;
			 for (int k = 0; k < i; k++) {
				 if (arr[k] == arr[i]) {
					 alreadyCounted = true;
					 break;
				 }
			 }
			 if (alreadyCounted) {
				 continue;
			 }
			 int count = 0;
			 for (int j = 0; j < arr.length; j++) {
				 if (arr[i] == arr[j]) {
					 count++;
				 }
			 }
			 System.out.println(arr[i] + " -> " + count);
		 }
		 
	 }
			
 }
		




