import java.util.*;

class nonRepeatingCharacter{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		String s=sc.nextLine();
		
		int c=0;
		
		for(int i=0;i<s.length();i++){
			int count=0;
			char c1=s.charAt(i);
			for(int j=0;j<s.length();j++){
			char c2=s.charAt(j);

				if(c1==c2){
				count++;
				}
			}

			if(count==1){
			System.out.println("NonRepeatingCharacter: "+c1);
				System.out.println("Element is Found Successfully");
				c=1;
			break;
			}
			
		}

		if(c==0){
			System.out.println("There Is No NonRepeatingCharacters");
		}
		
	}


}


