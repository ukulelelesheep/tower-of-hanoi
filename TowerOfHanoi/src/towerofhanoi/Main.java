package towerofhanoi;

public class Main {

	public static void main(String[] args) {
		if (args.length > 0)
			System.out.println(TowerOfHanoi.solve(Integer.parseInt(args[0])));

	}

}
