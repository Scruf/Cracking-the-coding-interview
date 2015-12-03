import java.util.*;
public class Duplicates{
	public static String removeDuplicate(String str){
		if(str.length()==1)
			return str;

		Set<String> set = new HashSet<String>();
		for(String s : str.split("")){
			set.add(s);
		}
		str =" ";
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			str += String.valueOf(iter.next());

		}
		return str.substring(1,str.length());
	}
	public static void main(String []args){
		String str1 = "abbbsscc";
	
			System.out.println(removeDuplicate(str1));
		

	}
}