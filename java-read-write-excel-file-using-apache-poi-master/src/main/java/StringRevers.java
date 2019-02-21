
public class StringRevers {

	public static void main(String[] args) {

		String str = "a!b,@cd";
		// outPut=d!c,ba

		String withoutSpec = str.replace("!", "").replace(",", "").replace("@", "");
		char[] a = withoutSpec.toCharArray();
		int len = a.length;
		char[] rev = new char[len];
		String revesre="";
		int offset = 0;
		int position1=1;
		int position3=3;
		
		for (int i = len-1; i >=0; i--) {
			rev[i] = withoutSpec.charAt(i);
			revesre=revesre+rev[i];	
		}
		char[] newWord=new char[rev.length+1];
		
		
		char[] arr=revesre.toCharArray();
		for(int i=0;i<newWord.length;i++) {
			if(position1 ==i) {
				newWord[i]='!';
				offset=1;
				
			}else if(position3 == i) {
				newWord[i]=',';
				
				offset=4;
				
			}else {
				newWord[i]=arr[i-offset];
			}
		}
		

		   System.out.println(newWord);
	
	}
}
