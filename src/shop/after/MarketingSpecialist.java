package shop.after;

public class MarketingSpecialist {

    private Shop workingShop;
    private double budget = 5000.00;

    public MarketingSpecialist() {
        this.workingShop =  Shop.getInstance();
        this.workingShop.addWorker(this);
    }

    public void spendMoney(double marketingCampaignCost) {
        this.budget -= Math.max(marketingCampaignCost, 0);
    }

    public double getBudget() {
        return this.budget;
    }
}
