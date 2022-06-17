package biz.olivight.model.utility;

import java.util.List;

public class Statistics {
    private int visitors_amount;
    private List<String> months;
    private List<Integer> per_month_visitors;

    public Statistics(int visitors_amount, List<String> months, List<Integer> per_month_visitors) {
        this.visitors_amount = visitors_amount;
        this.months = months;
        this.per_month_visitors = per_month_visitors;
    }

    public int getVisitors_amount() {
        return visitors_amount;
    }

    public void setVisitors_amount(int visitors_amount) {
        this.visitors_amount = visitors_amount;
    }

    public List<String> getMonths() {
        return months;
    }

    public void setMonths(List<String> months) {
        this.months = months;
    }

    public List<Integer> getPer_month_visitors() {
        return per_month_visitors;
    }

    public void setPer_month_visitors(List<Integer> per_month_visitors) {
        this.per_month_visitors = per_month_visitors;
    }
}
