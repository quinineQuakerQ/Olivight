package biz.olivight.model.service;

import java.util.List;

public class Portfolio {
    private String id;
    private String title;
    private List<String> accomplishment_list;
    private List<String> feedback;

    public Portfolio(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public List<String> getAccomplishment_list() {
        return accomplishment_list;
    }

    public void setAccomplishment_list(List<String> accomplishment_list) {
        this.accomplishment_list = accomplishment_list;
    }

    public List<String> getFeedback() {
        return feedback;
    }

    public void setFeedback(List<String> feedback) {
        this.feedback = feedback;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
