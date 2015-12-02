public class uniqueCharacters{
	public static boolean isUnique(String str){
		if(str.length()==1)
			return false;
		String []strArr = str.split(""); 
		for(int i=0;i<str.length();i++){
			for(int j=1;j<str.length()-1;j++){

				if(strArr[i].equals(strArr[j])){
					return true;
				}

			}
		}
		return false;
	}
	public static void main(String []args){
		String test1 = "S";
		boolean flag = isUnique(test1);
		if(flag){
			System.out.println("Its not unique");
		}
		else{
			System.out.println("Its unique");
		}
	}
}