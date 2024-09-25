package MutualExclusive;

class MyclassSynchronized{
	private static int cnt = 0;
	public void add(int value) {
		synchronized (this) {
			this.cnt += value;
			System.out.println("\n "+cnt);
		}
	}
}

public class Synchroblock extends Thread {
	
	MyclassSynchronized obj = new MyclassSynchronized();
	public void run() {
		obj.add(10);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Synchroblock obj1 = new Synchroblock();
		Synchroblock obj2 = new Synchroblock();
		obj1.start();
		obj2.start();
	}
}
