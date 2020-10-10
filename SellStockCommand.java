//Koty B
public class SellStockCommand implements Command {

	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	
	//initializes variables
	public SellStockCommand(StockTrade stockTrade, String stockName, int shares) {
		this.stockTrade = stockTrade;
		this.stockName = stockName;
		this.shares = shares;
	}
	
	//executes the command sell
	public void execute() {
		stockTrade.sell(stockName, shares);
	}
}
