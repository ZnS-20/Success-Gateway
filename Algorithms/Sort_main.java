import java.util.Scanner;

class Sort_main{

	static void printArray(int a[],String sort_type){
		System.out.printf("Sorted using %s \n",sort_type);
		for(Integer i:a){
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int result[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter 1.Insertion 2.Selection 3.Bubble with flag 4.Bubble without flag 5.Heap Sort 6.Merge Sort 7.exit");
		int swit = sc.nextInt();
		Sort_Algorithms algo = new Sort_Algorithms();
			switch(swit){
			case 1: result = algo.insertion_sort(a);
					printArray(result,"Insertion");
					break;
			case 2: result = algo.selection_sort(a);
					printArray(result,"Selection");
					break;
			case 3: result = algo.bubble_Sort_with_flag(a);
					printArray(result,"Bubble with flag");
					break;
			case 4: result = algo.bubble_Sort_without_flag(a);
					printArray(result,"Bubble without flag");
					break;
			case 5: result = algo.heap_Sort(a);
					printArray(result,"Heap Sort");
					break;
			case 6: algo.merge_sort(a,0,a.length-1);
					printArray(a,"Merge Sort");
					break;
			case 7: System.exit(0);
			default: System.out.println("Please Enter valid options");
		}
	}
}