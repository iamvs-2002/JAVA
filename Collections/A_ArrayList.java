import java.util.ArrayList;
import java.util.*;
class A_ArrayList{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		//creates a new array of size n=10, of type String in the memory
		//once the list if full, a new array of size, n+n/2+1 is created and the older values are copied to the new array
		//index starts from 0

		list.add("A");
		list.add("B");//add B at the end of the list
		list.add("C");//add C at the end of the list
		list.add("D");//add D at the end of the list
		System.out.println(list);

		list.add(2,"X");////add x at index 2
		System.out.println(list);

		// to traverse each element one by one
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		for(String s:list){ //for each loop
			System.out.println(s);
		}
		Iterator<String> it = list.iterator(); 
		while(it.hasNext()){ //if there is any next element
			System.out.println(it.next());
		}

		ArrayList<String> sample = new ArrayList<>();
		sample.add("a");
		list.addAll(sample);//add the sample list at the end of the list
		System.out.println(list);

		list.remove(2); //remove the element at index 2, if its valid, else throw an exception
		System.out.println(list);

		list.remove("X"); //remove C from the list if it exists, else return
		System.out.println(list);

		System.out.println(list.contains("Y"));//returns true if the list contains "Y" else false

		list.set(2,"Y"); //update the element at index at 2 to "Y", if the index is valid, else throw an exception
		System.out.println(list);

		System.out.println(list.contains("Y"));

		list.clear(); //remove all the elements from the list
		System.out.println(list);
	}
}

/*
Removing an element takes O(N) time complexity as all the elements after that element are left shifted by one position
Inserting an element takes O(N) time complexity as all the elements after that element are right shifted by one position
*/
