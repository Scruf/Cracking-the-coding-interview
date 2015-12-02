import java.util.*;
public class Anagram{
	public static boolean isAnagram(String str1,String str2){
		if(str1.length()==1 && str2.length()==1){
			return str1.equals(str2);
		}
		ArrayList<String> str1A = new ArrayList<String>();
		ArrayList<String> str2A = new ArrayList<String>();
		for(String s : str1.split("")){
			str1A.add(s);
		}
		for(String s : str2.split("")){
			str2A.add(s);
		}
		return str1A.containsAll(str2A) && str2A.containsAll(str1A);
	}
	public static void main(String []args){
		String s1 = "silent";
		String s2 = "list";
		boolean flag = isAnagram(s1,s2);
		if(flag){
			System.out.println("Is anagram");
		}
		else{
			System.out.println("Is not anagram");
		}
	}
}