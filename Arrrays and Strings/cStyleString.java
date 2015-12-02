import java.util.*;
public class cStyleString{
	public static String reverseString(String str){
		if(str.length()==1)
			return " "+str;
		else{
			String reverse = " ";
			String []arr = str.split("");
			for(int i=arr.length-1;i>=0;i--){
				reverse+=arr[i];
			}
			return " "+reverse;
		}

	}
	public static String alternative(String str){
		StringBuilder  builder = new StringBuilder(str);
		return " "+String.valueOf(builder);
	}
	public static void main(String []args){
		String rever = "a";
		System.out.println(alternative(rever));
	}
}
