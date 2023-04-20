package shop.after;

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

    private List workers = new ArrayList();

    public void addWorker(Object worker) {
        this.workers.add(worker);
    }

    public double getTurnover() {
        var turnOver = 0.0;
        for (var worker : this.workers) {
            if (worker instanceof SalesConsultant); {
                turnOver += ((SalesConsultant)worker).getMoney();
            }

            if (worker instanceof MarketingSpecialist) {
                turnOver += ((MarketingSpecialist)worker).getBudget();
            }
        }

        return turnOver;
    }
}
