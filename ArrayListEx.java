package prgmtest;

import java.util.ArrayList;
import java.util.List;
//Adding Comments for Demo Modified

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a1= new ArrayList();
		a1.add("Aarti");
		a1.add("Shekhar");
		a1.add("Prasad");
		a1.add("Pooja");
		a1.add("Tejas");
		a1.add("Bhushan");
		a1.add("Anushree");
		a1.add(3, "Vandana");
		a1.add("Jack");
		System.out.println(a1);
		a1.remove(8);
		System.out.println(a1);
		
		List<String> a2=new ArrayList();
		a2.add("Shradha");
		a2.add("Rushi");
		a2.add("Prabha");
		a2.add("Sangita");
		a2.add("Raju");
		a1.addAll(a2);
			for(String s :a1)
			{
				System.out.println(s);
			}
			System.out.println("Retain Using");
			a1.retainAll(a2);
			for(String x: a1)
			{
				System.out.println(x);
			}
		List<String> childList= new ArrayList(a1);
		System.out.println("Childlist is equal to a1 List: "+childList.equals(a1));
		System.out.println("ChildList is empty:"+childList.isEmpty());
		System.out.println("Total no. of ChilsList:"+childList.size());
		
			
	
	}

}
