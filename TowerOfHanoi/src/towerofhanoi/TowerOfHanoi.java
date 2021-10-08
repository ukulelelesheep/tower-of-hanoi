package towerofhanoi;

public class TowerOfHanoi {

	final private static char[] SLOTS = {'A', 'B', 'C'};
	
	public static String solve(int n) {
		return solve(n, 'A', 'C');
	}
	
	private static String solve(int n, char origin, char destination) {
		String answer = "";
		
		if (n > 1) {
			answer = answer + solve(n - 1, origin, spareSlot(origin, destination));
			answer = answer + ", ";
		}
		
		answer = answer + origin + " to " + destination;
		
		if (n > 1) {
			answer = answer + ", ";
			answer = answer + solve(n - 1, spareSlot(origin, destination), destination);	
		}
		
		return answer;
	}
	
	private static char spareSlot(char a, char b) {
		for (char c : SLOTS)
			if (!(c == a) && !(c == b))
				return c;
		
		
		return '?';
	}

}
