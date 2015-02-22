package model;

import java.awt.Component;

import update_strategies.IUpdateStrategy;

/*
 * ViewAdapter is anonymously instantiated in Controller
 * Allows model to communicate with view.
 */
public interface ViewAdapter {

	/**
	 * Returns the panel of the GUI where the balls bounce
	 * @return GUI ball panel
	 */
	public Component getPanel();
	
	/**
	 * Update the view based on the model
	 */
	public void update();
	
	/**
	 * Getter method for the strategy in the Switcher balls
	 * @return the IUpdateStrategy in the Switcher object
	 */
	public IUpdateStrategy getSwitcher();

}
