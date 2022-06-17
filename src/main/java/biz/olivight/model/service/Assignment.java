package biz.olivight.model.service;

public class Assignment {
    private String given_by;
    private String given_to;
    private String status;
    private String receive_date;
    private String delivery_date;
    private String extension_date;

    public Assignment(String given_by, String given_to, String status, String receive_date, String delivery_date, String extension_date) {
        this.given_by = given_by;
        this.given_to = given_to;
        this.status = status;
        this.receive_date = receive_date;
        this.delivery_date = delivery_date;
        this.extension_date = extension_date;
    }

    public String getGiven_by() {
        return given_by;
    }

    public void setGiven_by(String given_by) {
        this.given_by = given_by;
    }

    public String getGiven_to() {
        return given_to;
    }

    public void setGiven_to(String given_to) {
        this.given_to = given_to;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReceive_date() {
        return receive_date;
    }

    public void setReceive_date(String receive_date) {
        this.receive_date = receive_date;
    }

    public String getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }

    public String getExtension_date() {
        return extension_date;
    }

    public void setExtension_date(String extension_date) {
        this.extension_date = extension_date;
    }
}
