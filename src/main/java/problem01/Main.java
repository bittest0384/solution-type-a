package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		String test = "" + number;
		int returnNum = 0;
		for (int i = 0; i < test.length(); i++) {
			if (test.charAt(i) == '3' || test.charAt(i) == '6' || test.charAt(i) == '9') {
				returnNum++;
			}
		}
		
		return returnNum;
	}
}