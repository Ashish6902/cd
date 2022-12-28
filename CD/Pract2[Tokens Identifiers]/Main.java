import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class Main{
    public static void token_detector(String statement){
        int c=0,i=0,s=0,k=0;
        List<String> keywords = Arrays.asList("int","String","boolean","double","char","if","else","for",
        "while","do","return","public","private","protected","void","static","true","false");
        char[] charac = new char[999];
        char[] integer = new char[999];
        char[] spec_char = new char[999];
        String[] key = new String[999];
        for(int j=0;j<statement.length();j++){
            char ch = statement.charAt(j);
            if(Character.isLetter(ch)){
                charac[c++] = ch;    
            }
            else if(Character.isDigit(ch)){
                integer[i++] = ch;
            }
            else if(Character.isWhitespace(ch)){
                continue;
            }
            else{
                spec_char[s++] = ch;
            }
        }
        String[] temp = statement.split("\\s+");
        for(int x=0;x<temp.length;x++){
            if(keywords.contains(temp[x]) == true){
                key[k++] = temp[x];
            }
            else{
                continue;
            }
        }
        System.out.println("Characters: ");
        for(int j=0;j<c;j++){
            System.out.print(charac[j]);
        }System.out.println();
        System.out.println("Integers: ");
        for(int j=0;j<i;j++){
            System.out.print(integer[j]);
        }System.out.println();
        System.out.println("Special Characters: ");
        for(int j=0;j<s;j++){
            System.out.print(spec_char[j]);
        }System.out.println();
        System.out.println("Keywords: ");
        for(int j=0;j<k;j++){
            System.out.print(key[j]);
        }
    }
    
	public static void main(String[] args) {
		String statement;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		statement = sc.nextLine();
		token_detector(statement);
	}
}
