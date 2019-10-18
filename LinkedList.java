class Node<T>{
	T data; 
	Node next; 

	public Node(Object data){
		this.data = (T) data; 
	}
}

public class LinkedList <T> implements List<T>{

	Node<T> head; 
	int size; 

	public LinkedList(){
		head = null; 
		size = 0; 
	}
	

	public void add(int pos, T item){
		

		if(pos == 0){
			Node<T>temp = new Node<T>(item);
			temp.next = head; 
			head = temp; 
			++size; 
			return;
		}
	
			Node<T> temp = new Node<T>(item); 
			Node<T> temp2 = head; 
			for(int i = 0; i <pos-1; i++){
				temp2 = temp2.next; 
			}
			temp.next = temp2.next; 
			temp2.next = temp; 
			++size; 
			return;
		
	}

	public void add(T item){
		if(head == null){
			head = new Node<T>(item); 
			++size; 
		}
		else{
			Node<T>temp2 = head; 
			while(temp2.next != null){
				temp2 = temp2.next; 
			}
		
			temp2.next = new Node<T>(item); ; 
			++size; 

		}
	}

	public T get(int pos){
		
		Node temp = head;  
		for(int i = 0; i <pos; i++){
			temp = temp.next; 
		}
		return (T) temp.data; 

	}

	public T remove(int pos){
		
		if(pos == 0){
			T item = (T) head.data; 
			head = head.next; 
			size--; 
			return item; 
		}
		else{
			Node temp2 = head; 
			Node<T>temp = temp2; 
			for(int i =0; i < pos-1; i++){
				temp2 = temp2.next; 
			}
			Node temp3 = temp2.next;
			T item = (T) temp3.data; 
			size--; 
			return item; 
		}
	}
	
	public int size(){
		return size; 
	}
}