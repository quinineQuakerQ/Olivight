package biz.olivight.model.service;

import biz.olivight.model.communication.Communication;

import java.util.List;

public class Service {
    private List<String> service_type;
    private List<String> service_type_details;
    private List<Integer> service_provider_amount_per_type;
    private Communication communication;
    private List<Portfolio> portfolio_list;
    private List<Assignment> task_list;


    public Service(List<String> service_type, List<String> service_type_details,
                   List<Integer> service_provider_amount_per_type, Communication communication,
                   List<Portfolio> portfolio_list, List<Assignment> task_list) {
        this.service_type = service_type;
        this.service_type_details = service_type_details;
        this.service_provider_amount_per_type = service_provider_amount_per_type;
        this.communication = communication;
        this.portfolio_list = portfolio_list;
        this.task_list = task_list;
    }

    public List<String> getService_type() {
        return service_type;
    }

    public void setService_type(List<String> service_type) {
        this.service_type = service_type;
    }

    public List<String> getService_type_details() {
        return service_type_details;
    }

    public void setService_type_details(List<String> service_type_details) {
        this.service_type_details = service_type_details;
    }

    public List<Integer> getService_provider_amount_per_type() {
        return service_provider_amount_per_type;
    }

    public void setService_provider_amount_per_type(List<Integer> service_provider_amount_per_type) {
        this.service_provider_amount_per_type = service_provider_amount_per_type;
    }

    public Communication getCommunication() {
        return communication;
    }

    public void setCommunication(Communication communication) {
        this.communication = communication;
    }

    public List<Portfolio> getPortfolio_list() {
        return portfolio_list;
    }

    public void setPortfolio_list(List<Portfolio> portfolio_list) {
        this.portfolio_list = portfolio_list;
    }

    public List<Assignment> getTask_list() {
        return task_list;
    }

    public void setTask_list(List<Assignment> task_list) {
        this.task_list = task_list;
    }
}
