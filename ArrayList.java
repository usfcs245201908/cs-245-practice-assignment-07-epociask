import java.util.Arrays; 

public class ArrayList <T> implements List<T>{
	T[] a; 
	int size; 

	public ArrayList(){
		a = (T[]) new Object[10]; 
		size = 0; 
	}

	public void add(Object item){
		if(size == a.length){
			grow(); 
		}
		a[size++] = (T) item; 
	}

	public void add(int pos, Object item){

		if(size == a.length){
			grow(); 
		}

		for(int i =size; i >pos; i--){
			a[i] = a[i-1]; 
		}
		a[pos] = (T) item; 
		size++; 
	}

	public T get(int pos){
		
		return a[pos]; 
	}

	public T remove(int pos){
		
		T item = a[pos]; 
		for(int i =pos; i<size-1; i++){
			a[i] = a[i+1]; 
		}
		size--; 
		return item; 
	}

	public int size(){
		return size; 
	}

	public void grow(){
		a = Arrays.copyOf(a, a.length * 2); 
	}



}