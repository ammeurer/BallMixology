package controller;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;

import model.*;
import paint_strategies.IPaintStrategyFac;
import update_strategies.IStrategyFac;
import update_strategies.IUpdateStrategy;
import view.BallWorldFrame;
import view.IModelAdapter;

public class Controller<TStrategyDropListItem, TPaintDropListItem> {
	
	/**
	 * The view component of the MVC design pattern
	 */
	private BallWorldFrame<TStrategyDropListItem, TPaintDropListItem> view;
	
	/**
	 * The model component of the MVC design pattern
	 */
	private BallWorldModel model;
	
	/**
	 * Constructor instantiates anonymous inner classes of
	 * adapters and link adapters to model and view.
	 */
	public Controller(){
		view = new BallWorldFrame<TStrategyDropListItem, TPaintDropListItem>(new IModelAdapter<TStrategyDropListItem, TPaintDropListItem>(){

			@Override
			public void paint(Graphics g) {
				model.update(g);				
			}

			@Override
			public void makeBall(TStrategyDropListItem strategyItem, TPaintDropListItem paintItem) {
				if (null != strategyItem)
					model.loadBall(((IStrategyFac) strategyItem).make(), ((IPaintStrategyFac) paintItem).make());
			}

			@Override
			public void clearBalls() {
				model.clearBalls();				
			}
			@Override
			public TStrategyDropListItem addStrategy(String className){
				return (TStrategyDropListItem) model.makeStrategyFac(className);
			}
			
			public TPaintDropListItem addPaintStrategy(String className){
				return (TPaintDropListItem) model.makePaintStrategyFac(className);

			}

			@Override
			public TStrategyDropListItem combineStrategies(Object selectedItem1,
					Object selectedItem2) {
					return (TStrategyDropListItem) model.combineStrategyFacs((IStrategyFac)selectedItem1, (IStrategyFac)selectedItem2);
			}
			@Override
			public void setSwitch(Object switcher){
				model.setSwitcher(((IStrategyFac) switcher).make());
			}


			@Override
			public void makeSwitcher() {
				model.makeSwitcherBall();				
			}
			
			public TPaintDropListItem getPaintStrategy(){
				return null;
				
			}
	
		});
		
		model = new BallWorldModel(new ViewAdapter(){
			
			public Component getPanel(){
				return view.getPanel();				
			}
			public void update(){
				view.update();				
			}
			@Override
			public IUpdateStrategy getSwitcher() {
				// TODO Auto-generated method stub
				return null;
			}		
		});
	}
	
	/*
	 * Start up the Controller and the whole model/view
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Controller<Object,Object>().startControl();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

	}
	
	/*
	 * Call start methods in both model and view
	 */
	public void startControl(){
		view.start();
		model.start();
	}
}
