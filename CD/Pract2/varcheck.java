import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class varcheck{
    public static boolean check_validity(String var){
        if((var.charAt(0) == '_') || (Character.isLetter(var.charAt(0)))){
            for(int i=1;i<var.length();i++){
                char ch = var.charAt(i);
                if((Character.isLetter(ch)) || (Character.isDigit(ch) || (ch == '_'))){
                    continue;} 
                else{
                    return false;}}}
        else{
            return false;}
        return true;}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter variable name: ");
		String var = sc.nextLine();
		List<String> keywords = Arrays.asList("int","String","boolean","double","char","if","else","for","while","do","return","public","private","protected","void","static","true","false");
		boolean ans = check_validity(var);
		if (ans == true){
		    boolean c = keywords.contains(var);
		    if(c == true){
		        System.out.println("Variable name ALREADY EXISTS as KEYWORD");}
		    else{
		        System.out.println("Variable name is VALID");}}
		else{
		    System.out.println("Variable name is INVALID");
		}
	}
}
