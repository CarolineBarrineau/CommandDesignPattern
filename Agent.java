import java.util.ArrayList;
/**
 * This class acts as an agent that will place and process orders for the stocks
 * @author daleman123
 *
 */
public class Agent {

	private ArrayList<Command> orders;
	
	/**
	 * This is the default constructor that initializes the ArrayList of Commands called orders
	 */
	public Agent() {
		orders = new ArrayList<Command>();
	}
	
	/**
	 * This method adds a command to the ArrayList of orders
	 * @param command variable that is added to the ArrayList of orders
	 */
	public void placeOrder(Command command) {
		orders.add(command);
	}
	
	/**
	 * This method will loop through the list of orders and execute each one
	 */
	public void processOrders() {
		for(Command order : orders) {
			order.execute();
		}
	}
}
