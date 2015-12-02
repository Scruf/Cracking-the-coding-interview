public class ReplaceSpace{
	public static String replace(String str1){
		String []arr = str1.split(" ");
		if(str1.length()==1 && !str1.equals(" "))
			return str1;
		if(str1.equals(" "))
			return "%20";
		str1=" ";
		for(String s : arr){
			str1+=s+"%20";
		}
		return str1.substring(1,str1.length());
	}
	public static void main(String []args){
		String str1 = "Hello";
		System.out.println(replace(str1));
	}
}