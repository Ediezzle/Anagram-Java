package anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {
	public static List<String> funWithAnagrams(List<String> text) {
	    // Write your code here
	    //String[] stArray = new String[text.size()];
	    ArrayList<String> al = (ArrayList)text;
	    //String[] s = text.toArray(stArray);
	    ArrayList<String> s1=new ArrayList<String>();
	        ArrayList<String> newList=new ArrayList<String>();
	        String x;
	        for(int i=0;i<al.size();i++)
	        {
	            char[] c=al.get(i).toCharArray(); //i=0: {'c','o','d','e'}, //i=1: {'f','r','a','m','e','r'}
	            Arrays.sort(c);	//{'c','d','e','o'}, {'a','e','f','m','r', 'r'}
	            x=new String(c); //"cdeo", "aefmrr"
	            if(!s1.contains(x))
	            {
	                newList.add(al.get(i));
	                s1.add(x);
	            }

	            else
	                continue;


	        }
	        Collections.sort(newList);
	        return newList;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<String>();
		ls.add("code");
		ls.add("framer");
		ls.add("refam");
		ls.add("dceo");
		System.out.println(funWithAnagrams(ls));
		//System.out.println("x");

	}

}
