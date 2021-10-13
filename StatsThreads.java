package fall2021;

public class StatsThreads implements Runnable {
	// implements Runnable 
		private int data [];
		
		public StatsThreads() {
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
		
		
		public double avg() {
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
		
		
		public void run() {
			//System.out.println("Thread example");
			
			String threadCurrentlyRunning = Thread.currentThread().getName();
			
			//System.out.println(threadCurrentlyRunning );
			
			if(threadCurrentlyRunning.equals("Sum")) {
				System.out.println("The sum is " +sum());
			}else if(threadCurrentlyRunning.equals("Avg")) {
				System.out.println("The average is " +avg());
			}else if(threadCurrentlyRunning.equals("Max")) {
				System.out.println("The Max is " + max());
			}else if(threadCurrentlyRunning.equals("Min")) {
				System.out.println("The Min is " + min());
			}
			
			
			
		}/**/
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StatsThreads stat = new StatsThreads();
			
			
			Thread th1 = new Thread(stat, "Sum");
			Thread th2 = new Thread(stat, "Avg");
			Thread th3 = new Thread(stat, "Min");
			Thread th4 = new Thread(stat, "Max");
			
			th1.start();
			th2.start();
			th3.start();
			th4.start();
			
			
			
			
			//System.out.println(stat.agv()); //5
			//System.out.println(stat.min()); //5
			//System.out.println(stat.max()); //5
			

			
			

		}

	}
