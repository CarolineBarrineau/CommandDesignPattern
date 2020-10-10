//Team Victor
public class SellStockCommand implements Command {

	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	
	public SellStockCommand(StockTrade stockTrade, String stockName, int shares) {
		this.stockTrade = stockTrade;
		this.stockName = stockName;
		this.shares = shares;
	}
	
	public void execute() {
		//depends on the command names
		//SellStockCommand.sell();
	}
}
