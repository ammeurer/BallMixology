package view;

import java.awt.Graphics;

import update_strategies.IStrategyFac;
/**
 * Adapter from the view back to the model
 */
public interface IModelAdapter<TStrategyDropListItem, TPaintDropListItem> {

	
	/**
	 * Method to paint the sprites back in the model.
	 * @param g   The current Graphics context
	 */
	public void paint(Graphics g);
	
	/**
	 * Method to clear all the balls from the screen
	 */
	public void clearBalls();
	
	/**
	 * Add a strategy to the droplist and create a strategy factory 
	 * @param classname
	 * @return
	 */
	public TStrategyDropListItem addStrategy(String classname);
	
	/**
	 * Create a ball.
	 */
	public void makeBall(TStrategyDropListItem item, TPaintDropListItem myPaint);
	
	/**
	 * combine strategies
	 * @param selectedItem1 strategy to combine
	 * @param selectedItem2 strategy to combine
	 * @return
	 */
	public TStrategyDropListItem combineStrategies(TStrategyDropListItem selectedItem1, TStrategyDropListItem selectedItem2);
	
	/**
	 * Set a new strategy for the switcher balls
	 * @param switcher new strategy
	 */
	public void setSwitch(TStrategyDropListItem switcher);
	
	/**
	 * create a switcher ball
	 */
	public void makeSwitcher();
	
	/**
	 * retrieve paint strategy 
	 * @return
	 */
	public TPaintDropListItem getPaintStrategy();
	
	/**
	 * Add a paint strategy to the droplist, and create a factory for it
	 * @param text
	 * @return
	 */
	public TPaintDropListItem addPaintStrategy(String text);

	/**
	 * No-op singleton implementation of IModelAdapter (Null Object Design Pattern).
	 */
	public static final IModelAdapter<?, ?> NULL_OBJECT = new IModelAdapter() {

		public void paint(Graphics g) {
			
		}
		
		public void clearBalls(){
			
		}
		


		@Override
		public IStrategyFac addStrategy(String classname) {
			return null;
		}


		@Override
		public IStrategyFac combineStrategies(Object selectedItem1,
				Object selectedItem2) {
			return null;
		}

		@Override
		public void makeBall(Object item, Object thisPaint) {
			
		}

		@Override
		public void setSwitch(Object switcher) {
			
		}

		@Override
		public void makeSwitcher() {
			
		}

		@Override
		public Object getPaintStrategy() {
			return null;
		}

		@Override
		public Object addPaintStrategy(String text) {
			return null;
		}



	};


	





	

}
