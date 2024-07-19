package flowcontrolstatement.iterativestatement;

public class WhileLoopWithBreak {

	public static void main(String[] args) {
		
		int i = 1;
		
		
		while(i<=10) {
			
			i++;
			
			if(i==5) {
				break;
				
			}
			System.out.println(i);
		}
		

	}

}
