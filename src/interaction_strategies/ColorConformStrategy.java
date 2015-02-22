package interaction_strategies;



import model.ball.Ball;
import model.ball.Dispatcher;
import model.ball.IBallCmd;
import update_strategies.IUpdateStrategy;
/**
 * When a ball with a ColorConform Strategy is created, all 
 * the existing balls in the GUI become the same color as the new ball
 * @author ammeurer
 *
 */
public class ColorConformStrategy implements IUpdateStrategy{

	@Override
	public void updateState(final Ball thisBall, Dispatcher d) {
		d.notifyAll(new IBallCmd(){
			
			public void apply(Ball target, Dispatcher disp){
				target.setColor(thisBall.getColor());
			}

		});		
	}

	@Override
	public void init(Ball context) {
		context.setInteractStrategy(new MultiInteractStrategy(context.getInteractStrategy(),new IInteractStrategy(){
			@Override
			public void interact(Ball context, Ball target, Dispatcher disp) {
	
			}
			
		}));		
	}

}
