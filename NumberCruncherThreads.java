package fall2021;

import java.time.Duration;
import java.time.Instant;

public class NumberCruncherThreads {
	
	private int data [];
	
	public NumberCruncherThreads() {
		data = new int[8];
		data[0] = 90;
		data[1] = 81;
		data[2] = 78;
		data[3] = 95;
		data[4] = 79;
		data[5] = 72;
		data[6] = 885;
		data[7] = 100;
	}
	
	class Max implements Runnable{

		@Override
		public void run() {
			int max = max();
			System.out.println("Max is: " + max);
		}
		
		public int max() {
			int max = data[0];
			
			for(int i = 1; i <data.length; i++) {
				if (data[i] > max)
					max = data[i];
			}
			
			return max;
		}
		
	} // end of max
	
	
	class Min implements Runnable{

		@Override
		public void run() {
			int min = min();
			System.out.println("Min is: " + min);
		}
		
		public int min() {
			int min = data[0];
			
			for(int i = 1; i <data.length; i++) {
				if (data[i] < min)
					min = data[i];
			}
			
			return min;
		}
		
	} // end of max	
	
	
	class Avg implements Runnable{

		@Override
		public void run() {
			double avg = avg();
			System.out.println("Avg is: " + avg);
		}
		
		public int sum() {
			int total = 0;
			
			for(int i = 0; i <data.length; i++) {
				total = total + data[i];
			}
			
			return total;
		}
		
		
		public double avg() {
			return sum() / (double)data.length;
		}
		
		
	} // end of max	
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		NumberCruncherThreads  numberCruncher = new NumberCruncherThreads();
		
		Thread t1 = new Thread(numberCruncher.new Max());
		Thread t2 = new Thread(numberCruncher.new Min());
		Thread t3 = new Thread(numberCruncher.new Avg());
		t1.start();
		t2.start();
		t3.start();
		
		try {
			/* Wait for the above threads to finish before continuing*/
			t1.join();
			t2.join();
			t3.join();
			
		}catch(Exception e) {
			System.out.println("An error occurred!!!!");
		}
		System.out.println("Instruction after threads have started");
		
		/* How many threads in here?
		 * 4 
		 * 
		 */

		//thread1.start();

	}

}
