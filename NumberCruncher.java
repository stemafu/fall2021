package fall2021;



public class NumberCruncher {
	// implements Runnable 
	private int data [];
	
	public NumberCruncher() {
		data = new int[8];
		data[0] = 90;
		data[1] = 81;
		data[2] = 78;
		data[3] = 95;
		data[4] = 79;
		data[5] = 72;
		data[6] = 85;
		data[7] = 100;
		
		
	}
	
	
	
	public int sum() {
		int total = 0;
		
		for(int i = 0; i <data.length; i++) {
			total = total + data[i];
		}
		
		return total;
	}
	
	
	public double agv() {
		return sum() / (double)data.length;
	}
	
	public int max() {
		int max = data[0];
		
		for(int i = 1; i <data.length; i++) {
			if (data[i] > max)
				max = data[i];
		}
		
		return max;
	}
	
	public int min() {
		int min = data[0];
		
		for(int i = 1; i <data.length; i++) {
			if (data[i] < min)
				min = data[i];
		}
		
		return min;
	}
	/*
	public void run() {
		System.out.println("Thread example");
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberCruncher stat = new NumberCruncher();
		
		
		//Thread thread1 = new Thread(stat);
		
		
		
		
		System.out.println(stat.agv()); //5
		System.out.println(stat.min()); //5
		System.out.println(stat.max()); //5
		

		
		

	}

}
