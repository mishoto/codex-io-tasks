package shop.before;

public class SalesConsultant {

    //field can be final
    private  Shop workingShop;
    private double earnedMoney;

    public  SalesConsultant() {
        this.workingShop =  Shop.getInstance();
        this.workingShop.addWorker(this);
    }

    public void sellProduct(double price) {
        this.earnedMoney += Math.max(price, 0);
    }

    public double getMoney() {
        return this.earnedMoney;
    }
}
