package davo.com.algo1.util;

/**
 * Keep track of the basic metrics.
 * @author davo
 *
 */
public class MetricsHelper {
	
	private int steps;
	private double start;
	private double now;
	
	/**
	 * 
	 */
	public MetricsHelper(){
		steps = 0;
	}
	
	public void addStep(){
		steps++;
	}
	
	public void removeStep(){
		steps--;
	}
	
	public void startWatch(){
		start = System.currentTimeMillis();
	}
	
	public void stopWatch(){
		now = System.currentTimeMillis(); 
	}
	
	public double getTimeElapsed() {
		if(now == 0.0){
			stopWatch();
		}
		return (now - start)/1000.00d ;
	}

	public int getSteps() {
		return steps;
	}
	
	public void printMetrics(){
		System.out.println("Metrics");
		System.out.println("/********************/");
		System.out.println("Total steps: " + steps);
		System.out.printf("Total time elapsed in seconds: %f\n",  getTimeElapsed());
		System.out.println("/********************/");
	}

}
