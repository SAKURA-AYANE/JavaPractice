
public class ReverseString {
	   public static void main(String args[]){
		   System.out.println(reverse("abcd"));
	   }
	   
	   public static String reverse(String s){
		    if(s==null){
		    return null;
		    }
		    if(s.length()==1 || s.length()==0){
		    return s;
		    }

		    /*
		    String temp = "";
		    for(int i =1;i<=s.length();i++){
		        temp = temp + s.charAt(s.length()-i);
		    }
		    return temp;
		    */
		    
		    return reverse(s.substring(1, s.length())) + s.charAt(0);
		}
}
