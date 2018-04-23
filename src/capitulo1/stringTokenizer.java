package capitulo1;

import java.util.StringTokenizer;

public class stringTokenizer {
	// tokenizer
	public static void main(String[] args) {
	String u = "ok|oky|roku|focus|thum|trump|dump";
	StringTokenizer st = new StringTokenizer(u, "|");
	
	String tok;
	
	while(st.hasMoreTokens()){
		tok = st.nextToken();
		System.out.println(tok);
		}
	
	System.out.println("");
// 	Split
		String s= "sisi|jaja|jeje|kekeke";
		
		String tokens[] = s.split("[|]");
		
		for(int i=0; i<tokens.length;i++) {
			
			System.out.println(tokens[i]);
			
		}
  }

}
