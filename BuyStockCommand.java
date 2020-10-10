//Koty B
public class BuyStockCommand implements Command {
	
	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	
	//initializes variables
	public BuyStockCommand(StockTrade stockTrade, String stockName, int shares) {
		this.stockTrade = stockTrade;
		this.stockName = stockName;
		this.shares = shares;
	}
	
	//executes the command buy
	public void execute() {
		stockTrade.buy(stockName, shares);
	}
}
