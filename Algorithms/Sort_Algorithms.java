/* Implementing Insertion Sort*/


class Sort_Algorithms{

	int[] insertion_sort(int a[]){
		int l = a.length;
		for(int j=1;j<l;j++){
			int i = j-1;
			int key = a[j];
			while(i>=0 && a[i]>key){
				a[i+1] = a[i];
				i = i-1;
			}
			a[i+1] = key;
		}
		return a;
	}
	int [] selection_sort(int a[]){
		int n = a.length;
		for(int i=0;i<n-1;i++){
			int min = i;
			for(int j=i+1;j<n;j++){
				if(a[min]>a[j]){
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		return a;
	}
	int[] bubble_Sort_without_flag(int a[]){
		int n = a.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-(i+1);j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	int[] bubble_Sort_with_flag(int a[]){
		int n=a.length;
		for(int i=0;i<n-1;i++){
			boolean flag = false;
			for(int j=0;j<n-(i+1);j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
			if(flag){
				break;
			}
		}
		return a;
	}

	// Heap Sort Start

	int left(int i){
		return (2*i+1);
	}
	int right(int i){
		return (2*i+2);
	}
	int parent(int i){
		return ((i-1)/2);
	}

	int[] heap_Sort(int a[]){
		int n=a.length;
		build_max_heap(a);
		for(int i=n-1;i>0;i--){
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			n=n-1;
			max_heapify(a,i,0);
		}
		return a;
	}

	void build_max_heap(int a[]){
		int n = a.length;
		for(int i=(n/2)-1;i>=0;i--){
			max_heapify(a,n,i);
		}
	}

	void max_heapify(int a[],int n,int i){
		int l = left(i);
		int r = right(i);
		int largest = i;
		if(l<n && a[l]>a[largest])
			largest = l;
		if(r<n && a[r]>a[largest]){
			largest = r;
		}
		if(largest != i){
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			max_heapify(a,n,largest);
		}
	}
	//Heap Sort End

	//Merge Sort Start

	void merge_sort(int a[],int low,int high){
		if(low<high){
			int mid = (low+high)/2;
			merge_sort(a,low,mid);
			merge_sort(a,mid+1,high);
			Merge(a,low,mid,high);
		}
	}

	void Merge(int a[],int low,int mid,int high){
		int p = mid-low+1;
		int q = high - mid;
		int L[] = new int[p+1];
		int R[] = new int[q+1];
		for(int i=0;i<p;i++){
			L[i] = a[low+i];
		}
		for(int j=0;j<q;j++){
			R[j] = a[mid+j+1];
		}
		L[p] = Integer.MAX_VALUE;
		R[q] = Integer.MAX_VALUE;
		int i=0;int j=0;
		for(int k=low;k<high;k++){
			if(L[i]<=R[j]){
				a[k]=L[i];
				i=i+1;
			}else{
				a[k] = R[j];
				j = j+1;
			}
		}
	}
}
