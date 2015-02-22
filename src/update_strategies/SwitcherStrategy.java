package update_strategies;

import model.ball.Ball;
import model.ball.Dispatcher;

/**
 * SwitcherStrategy allows the user to change all balls at once
 * @author ammeurer
 *
 */
public class SwitcherStrategy implements IUpdateStrategy {

	public static SwitcherStrategy Singleton = new SwitcherStrategy();
	
	public SwitcherStrategy(){
		
	}
		private IUpdateStrategy strategy = new StraightStrategy();

		public void updateState(Ball context, Dispatcher d) {
			strategy.updateState(context, d);
		}

		public void setStrategy(IUpdateStrategy newStrategy) {
			strategy = newStrategy;
		}
		public IUpdateStrategy getStrategy(){
			return strategy;
			
		}

		@Override
		public void init(Ball context) {
			// TODO Auto-generated method stub
			
		}
}