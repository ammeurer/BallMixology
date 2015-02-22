package update_strategies;

import model.ball.Ball;
import model.ball.Dispatcher;

/**
 * Interface for strategies
 * @author ammeurer
 *
 */
public interface IUpdateStrategy {
	/**
	 * Update the ball's state each time the dispatcher calls
	 * @param thisBall
	 * @param d
	 */
	public void updateState(Ball thisBall, Dispatcher d);

	/**
	 * Optional initialization method for an IUpdateStrategy object
	 * @param context
	 */
	public void init(Ball context);
}
