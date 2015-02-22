package model.ball;

import interaction_strategies.CollideStrategy;
import interaction_strategies.IInteractStrategy;
import interaction_strategies.NormalElasticStrategy;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Observable;
import java.util.Observer;

import paint_strategies.IPaintStrategy;
import update_strategies.*;

/**
 * Concrete class Ball defines invariable methods for ball implementations.
 */
public class Ball implements Observer{
	
	/**
	 * Ball radius
	 */
	private double radius;
	
	/**
	 * Ball velocity
	 */
	private Point velocity;
	
	/**
	 * Ball location;	
	 */
	private Point location;
	
	/**
	 * Ball color
	 */
	private Color color;
	
	/**
	 * JPanel that ball is painted onto.
	 */
	private Component panel;
	
	/**
	 * IUpdateStrategy object for ball strategy
	 */
	private IUpdateStrategy strategy;
	
	/**
	 * IPaintStrategy object for ball painting
	 */
	private IPaintStrategy paintThis;
	
	/**
	 * IInteractStrategy object for ball's interaction behavior
	 */
	private IInteractStrategy interact;
	/**
	 * Constructor
	 */
	public Ball(Point myLocation,double myRadius, Point myVelocity, Color myColor, Component myPanel, IUpdateStrategy myStrategy, IPaintStrategy myPaint){
		this.radius = myRadius;
		this.location = myLocation;
		this.color = myColor;
		this.velocity = myVelocity;
		this.panel = myPanel;
		this.strategy = myStrategy;
		this.paintThis = myPaint;
		interact =  new NormalElasticStrategy();
	}
	

	/**
	 * Getters and Setters for Ball model.
	 */
	public double getRadius(){
		return this.radius;
	}
	
	public Point getVelocity(){
		return this.velocity;
	}
	
	public Point getLocation(){
		return this.location;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	public void setRadius(double newRadius){
		this.radius = newRadius;
	}
	
	public void setVelocity(Point newVelocity){
		this.velocity = newVelocity;
	}
	
	public void setLocation(Point newLocation){
		this.location = newLocation;
	}
	
	public void setColor(Color newColor){
		this.color = newColor;
	}
	
	public Component getPanel(){
		return this.panel;
	}
	public void setStrategy(IUpdateStrategy newStrategy){
		this.strategy = newStrategy;
	}
	public IUpdateStrategy getStrategy(){
		return this.strategy;
	}
	public void setPaintStrategy(IPaintStrategy newStrategy){
		this.paintThis = newStrategy;
	}
	public IPaintStrategy getPaintStrategy(){
		return this.paintThis;
	}
	public IInteractStrategy getInteractStrategy(){
		return interact;
	}
	public void setInteractStrategy(IInteractStrategy newInteraction){
		interact = newInteraction;
	}
	
	/**
	 * Update method is called when the dispatcher notifies all 
	 * the balls each timer cycle.
	 * @param Dispatcher d is the dispatcher
	 * @param Graphics g is the graphics object from the view
	 */
	public void update(Observable d, Object cmd){
		
		((IBallCmd)cmd).apply(this, (Dispatcher) d);

	}
	
	/**
	 * Paint method paints circle to the view during the update method
	 * @param g Graphics object
	 */
	public void paint(Object g){
		paintThis.paint((Graphics)g, this);
	}
	
	/**
	 * The bounce method defines the behavior of the ball when it 
	 * passes the boundary of the JFrame.
	 */
	public void bounce(){
		int yLoc = location.y;
		int xLoc = location.x;
		
		if (xLoc - radius < 0){
			velocity.x = -velocity.x;
			location.x = (int) (2*radius - location.x);
		}
		if (xLoc + radius > panel.getWidth()){
			velocity.x = -velocity.x;
			location.x = (int) (2*(panel.getWidth()-radius) - location.x);
		}
		if (yLoc - radius < 0){
			velocity.y = -velocity.y;
			location.y = (int) (2*radius - location.y);
		}
		if (yLoc + radius > panel.getHeight()){
			velocity.y = -velocity.y;
			location.y = (int) (2*(panel.getHeight()-radius) - location.y);
		}
	}
	
	/**
	 * Method to define behavior of this ball when it interacts with
	 * another ball.
	 * @param target ball to interact with
	 * @param dispatcher
	 */
	public void interactWith(Ball target, Dispatcher dispatcher){
		interact.interact(this, target, dispatcher);
	}
}
