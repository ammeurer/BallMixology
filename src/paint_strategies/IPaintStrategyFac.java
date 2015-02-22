package paint_strategies;

/**
 * IPaintStrategyFac is a factory object to wrap around an IPaintStrategy object
 * @author ammeurer
 *
 */
public interface IPaintStrategyFac {
	
	public IPaintStrategy make();

}
