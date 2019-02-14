package problem02;

public class SmartPhone extends MusicPhone {
	
	@Override
	public void execute( String function ) {
		if (function.equals("음악")) {
			System.out.println(playMusic());
			return;
		} else if (function.equals("앱")) {
			System.out.println("앱실행");
		} else {
			super.execute(function);
		}		
		
	}	
	
	@Override
	public String playMusic() {
		return runApp();
	}
	
	
	public String runApp() {
		return "스트리밍";
	}
}