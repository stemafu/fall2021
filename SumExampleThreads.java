package fall2021;

public class SumExampleThreads implements Runnable{
	
	int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	int [][ ] sudokuGrid = { 
			{1, 2, 3, 4, 5, 6, 7, 8, 9},
			{1, 2, 3, 4, 5, 6, 7, 8, 9},
			{1, 2, 3, 4, 5, 6, 7, 8, 9},
			{1, 2, 3, 4, 5, 6, 7, 8, 9},
			{1, 2, 3, 4, 5, 6, 7, 8, 9},
			{1, 2, 3, 4, 5, 6, 7, 8, 9},
			{1, 2, 3, 4, 5, 6, 7, 8, 9},
			{1, 2, 3, 4, 5, 6, 7, 8, 9},
			{1, 2, 3, 4, 5, 6, 7, 8, 9},
			{1, 2, 3, 4, 5, 6, 7, 8, 9}};
	
	
	
	public int total  = 0;
	
	public SumExampleThreads() {
	
		
	}
	
	public int sum(int start, int end) {
		//We need to make a change here
		for(int i = start; i < end; i++) {
			total = total + nums[i];
		}
		
		return total;
	}
	
	public void run() {
		String threadName = Thread.currentThread().getName();
		
		if(threadName.equals("first half")) {
			sum(0, nums.length /2);
		}else if (threadName.equals("last half")) {
			sum(nums.length /2, nums.length);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumExampleThreads sum = new SumExampleThreads();
		Thread th1 = new Thread( sum, "first half");
		Thread th2 = new Thread( sum, "last half");
		
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}/**/
		
		System.out.println(sum.total);
		

	}

}
