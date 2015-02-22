package interaction_strategies;

import model.ball.Ball;
import model.ball.Dispatcher;

/**
 * Strategy that defines a directed interaction between two balls where the balls are NOT
 * equivalently processed. 
 * 
 * @author swong
 * 
 */
public interface IInteractStrategy {

	/**
	 * Performs a directed interaction between the context ball and the target Ball from the 
	 * perspective of the context Ball.
	 * @param context  The Ball from whose perspective the interaction 
	 * processing takes place.
	 * @param target  The Ball that is the "other ball" in the perspective of this processing.
	 * @param disp  The Dispatcher that is to be used if desired.
	 */
	public void interact(Ball context, Ball target, Dispatcher disp);

	
	
	/**
	 * Null strategy with no-op behavior.
	 */
	public static final IInteractStrategy NULL_STRATEGY = new IInteractStrategy() {

		@Override
		/**
		 * No-op behavior
		 * @param context Ignored
		 * @param target Ignored
		 * @param disp Ignored
		 */
		public void interact(Ball context, Ball target, Dispatcher disp) {
		}

	};
}