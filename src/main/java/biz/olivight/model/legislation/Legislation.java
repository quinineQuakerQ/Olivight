package biz.olivight.model.legislation;

public class Legislation {
    private String conditions;
    private String terms;
    private String trade_license;
    private String security;
    private String policy;

    public Legislation() {
        this.conditions = "Alu";
        this.terms = "Begun";
        this.trade_license = "Potol";
        this.security = "Derosh";
        this.policy = "Mar ja tu";
    }

    public String getConditions() {
        return conditions;
    }

    public String getTerms() {
        return terms;
    }

    public String getTrade_license() {
        return trade_license;
    }

    public String getSecurity() {
        return security;
    }

    public String getPolicy() {
        return policy;
    }
}
