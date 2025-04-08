package pkg;
import java.util.ArrayList;
public class Stopwatch{
		private long startTime;
		private long stopTime;
		private long timePassed;//maximum time is ~290 million years
		private ArrayList<Integer> gap;//stores the gap between the start time and each lap time-maximum time for a lap is ~600hrs
		private boolean running = false;
		/**
		 * Constructs a Stopwatch 
		 */
		public Stopwatch(){
			gap = new ArrayList<Integer>();
		}


		/**
		 * starts the stopwatch<br>
		 * @return the time it took to start the stopwatch, typically very small
		 */
		public int start(){
			if(!running){
				startTime = startTime+System.currentTimeMillis()-stopTime;
				running = true;
				gap.add(0);
			}
			else{
				lap();
			}
			return read();
		}
		/**
		 * stops the stopwatch<br>
		 * can be restarted with "start()"<br>
		 * if stopwatch is not running, this is equivalent to reset()<br>
		 * @return equivalent to read()
		 */
		public int stop(){
			if(running){
				stopTime = System.currentTimeMillis();
				timePassed = stopTime-startTime;
				running = false;
			}
			else{
				reset();
			}
			return read();
		}
		/**
		 * laps the stopwatch<br>
		 * if the stopwatch is not running, this is equivalent to start()<br>
		 * @return equivalent to read()
		 */
		public int lap(){
			if(running){
				
				gap.add((int)(System.currentTimeMillis()-startTime));
			}
			else{
				start();
			}
			return read();
		}
		/**
		 * reads the value of this stopwatch<br>
		 * @return value of this stopwatch
		 */
		public int read(){
			if(running){
				return (int)(System.currentTimeMillis()-startTime);
			}
			return (int)timePassed;
		}
		/**
		 * reads the specific value of a lap on this stopwatch<br>
		 * lap numbers start from 0<br>
		 * @param lap the lap number<br>
		 * @return the length of this lap<br>
		 * equivalent to read(lap, false)
		 */
		public int read(int lap){
			return read(lap, false);
		}
		/**
		 * reads the specific value of a lap on this stopwatch<br>
		 * lap numbers start from 0<br>
		 * @param lap the lap number<br>
		 * @param totalTime whether or not to count the total time since start()(true) or to count lap-to-lap(false)<br>
		 * @return the length of this lap
		 */
		public int read(int lap, boolean totalTime){
			if(totalTime){
				if(running){
					return (int)(System.currentTimeMillis()-startTime-gap.get(lap));
				}
			return (int)(timePassed-gap.get(lap));
			}
			//returns the gap between the gaps
			if(running){
				if(lap<gap.size()-1){
					if(gap.get(lap+1)!=0){
						return gap.get(lap+1)-gap.get(lap);
					}
				}
				return (int)(System.currentTimeMillis()-startTime-gap.get(lap));
			}
			if(lap<gap.size()-1){
					if(gap.get(lap+1)!=0){
						return gap.get(lap+1)-gap.get(lap);
					}
				}
			return (int)(timePassed-gap.get(lap));
		}
		/**
		 * resets the stopwatch<br>
		 * equivalent to writing (variable) = new Stopwatch();
		 */
		public void reset(){
			startTime = 0;
			stopTime = 0;
			timePassed = 0;
			running = false;
			gap = new ArrayList<Integer>();
		}
		/**
		 * waits for a set time<br>
		 * @param ms the time to wait in ms
		 */
        public void wait(int ms){
			try{
				Thread.sleep(ms);
			}
			catch(Exception ex){}
		}
		/**
		 *converts the time in milliseconds to a human-readable string
		 *@param milliseconds the number of milliseconds to convert
		 *@return human-readable string
		*/
		public static String readable(long milliseconds){
			if (milliseconds < 0) {
				throw new IllegalArgumentException("Milliseconds cannot be negative.");
			}

			long seconds = milliseconds / 1000;
			long minutes = seconds / 60;
			long hours = minutes / 60;
			long days = hours / 24;

			milliseconds %= 1000;
			seconds %= 60;
			minutes %= 60;
			hours %= 24;

			StringBuilder result = new StringBuilder();

			if (days > 0) {
				result.append(days).append(" days ");
			}
			if (hours > 0) {
				result.append(hours).append(" hours ");
			}
			if (minutes > 0) {
				result.append(minutes).append(" minutes ");
			}
			if (seconds > 0) {
				result.append(seconds).append(" seconds ");
			}
			if (milliseconds > 0) {
				result.append(milliseconds).append(" milliseconds");
			}

			return result.toString().trim();
		}
      /*
		public static void main(String[] args){
            Stopwatch s = new Stopwatch();
            
            s.start();
            
            System.out.println("stopwatch started: waiting");
            
            try{
                Thread.sleep(589);//simulates a task
            }
            catch(Exception ex){}
            
            
            s.stop();


            System.out.println("stopwatch stopped");
            
            int time = s.read();
            
            
            //note: Stopwatch does not have to be stopped to read
            
            System.out.println("Time elapsed: "+time+" ms\n\n\nWithLaps: ");


			//optional use: with laps
			Stopwatch withLaps = new Stopwatch();
			withLaps.start();
			withLaps.wait(50);
			withLaps.lap();
			withLaps.wait(1000);
			withLaps.lap();
			withLaps.stop();
			for(int i = 0; i<3; i++){
				System.out.println("lap " +i+": "+readable(withLaps.read(i)));
			}
			System.out.println(readable(99999999l));
        }
      */
	}