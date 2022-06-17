package biz.olivight.model.investor;

import biz.olivight.model.communication.Contact;

public class Investor {
    private String id;
    private String name;
    private String type;
    private Contact contact;

    public Investor(String id, String name, String type, Contact contact) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
