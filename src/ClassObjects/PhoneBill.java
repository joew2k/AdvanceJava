/**
 * 
 */
package ClassObjects;

/**
 * @author Covenant Visions
 *
 */
public class PhoneBill {

	/**
	 * @param args
	 */
	private int id;
	private double baseCost;
	double allotedMinutes;
	private double usedMinutes;
	private double overageRatePerMin = 0.25;
	private double taxRate = 0.15;
	
	public PhoneBill() {
		id = 0;
		baseCost = 0;
		allotedMinutes = 0;
		usedMinutes= 0;
		
	}
	public PhoneBill(int id) {
		this.id = id;
		baseCost = 0;
		allotedMinutes = 0;
		usedMinutes = 0;
	}
	public PhoneBill(int id,double baseCost,double allotedMinutes, double usedMinutes) {
		setId(id);
		setBaseCost(baseCost);
		setAllotedMinutes(allotedMinutes);
		setUsedMinutes(usedMinutes);
	}
	// Getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBaseCost() {
		return baseCost;
	}
	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}
	
	public double getAllotedMinutes() {
		return allotedMinutes;
	}
	public void setAllotedMinutes(double allotedMinutes) {
		this.allotedMinutes = allotedMinutes;
	}
	
	public double getUsedMinutes() {
		return usedMinutes;
	}
	public void setUsedMinutes(double usedMinutes) {
		this.usedMinutes = usedMinutes;
	}
	public double getOverageRatePerMin() {
		return overageRatePerMin;
	}
	public double getTaxRate() {
		return taxRate;
	}
	
	public double calculateOverage() {
		if(allotedMinutes<usedMinutes) {
			return (usedMinutes - allotedMinutes) * overageRatePerMin;
		}
		return 0;
	}
	
	public double calculateTotalBill() {
		return baseCost + calculateOverage() + calculateTax();
	}
	public double calculateTax() {
		double tax = (baseCost + calculateOverage()) * taxRate;
		return tax;
	}

}
