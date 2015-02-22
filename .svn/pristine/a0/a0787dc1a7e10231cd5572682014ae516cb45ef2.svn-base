package update_strategies;



import java.awt.Color;

import model.ball.Ball;
import model.ball.Dispatcher;
import util.Randomizer;

/**
 * DiscoStrategy changes color each timer cycle.
 */
public class DiscoStrategy implements IUpdateStrategy {
		
		/**
		 * Random object to generate random color
		 */
		private Randomizer rand = new Randomizer();
		
		
		
	
		/**
		 * For DiscoBall, updateState sets the ball to a new color.
		 * 
		 */
		public void updateState(Ball ball, Dispatcher d) {
			Color newColor = rand.randomColor();
			ball.setColor(newColor);
			
		}




		@Override
		public void init(Ball context) {
			// TODO Auto-generated method stub
			
		}
	
	}


