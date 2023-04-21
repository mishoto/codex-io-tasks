package shop.before;

public class MarketingSpecialist {

    // can be final
    private Shop workingShop;

    // hardcoded values can be replaced by constants
    private double budget = 5000.00;

    public MarketingSpecialist() {
        this.workingShop =  Shop.getInstance();
        this.workingShop.addWorker(this);
    }

    /*
     method is more general and not specific to this class
     method name is not very descriptive
     access modifier can be protected or package-private
    */
    public void spendMoney(double marketingCampaignCost) {
        this.budget -= Math.max(marketingCampaignCost, 0);
    }

    // this method is more general and not specific to this class
    public double getBudget() {
        return this.budget;
    }
}
