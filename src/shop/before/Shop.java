package shop.before;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static Shop instance;

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }

        return instance;
    }

    // missing generic type or raw use of List interface
    private List workers = new ArrayList();

    public void addWorker(Object worker) {
        this.workers.add(worker);
    }

    //extract this method to ShopManager and use wrappers where different type of workers can be passed
    public double getTurnover() {
        var turnOver = 0.0;
        for (var worker : this.workers) {
            if (worker instanceof  SalesConsultant); {
                // casting is not a good practice cause ClassCast Exception
                turnOver += (( SalesConsultant)worker).getMoney();
            }

            if (worker instanceof  MarketingSpecialist) {
                turnOver += (( MarketingSpecialist)worker).getBudget();
            }
        }

        return turnOver;
    }
}
