package biz.olivight.model.organisation;

import biz.olivight.model.communication.ChatBox;
import biz.olivight.model.communication.Communication;
import biz.olivight.model.communication.Contact;
import biz.olivight.model.investor.Investor;
import biz.olivight.model.investor.InvestorCategory;
import biz.olivight.model.legislation.Legislation;
import biz.olivight.model.service.Portfolio;
import biz.olivight.model.service.Service;
import biz.olivight.model.service.ServiceExtension;
import biz.olivight.model.utility.Statistics;

import java.util.ArrayList;
import java.util.List;

public class Organisation {
    private String id;
    private String name;
    private Legislation legislation;
    private List<String> motives;
    private List<Investor> investor_list;
    private Service service;

    public Organisation() {
        this.id = "002039977";
        this.name = "Olivight";
        legislation = new Legislation();

        motive_organiser();
        investor_organiser();
        service_organiser(communication_organiser(),portfolio_organiser());
    }

    private void service_organiser(Communication communication, List<Portfolio> portfolio_list) {
        service = new Service(ServiceExtension.get_all_service_type(),
                              ServiceExtension.get_all_service_details(),
                              ServiceExtension.get_service_provider_amount_per_type(),
                              communication,portfolio_list,null);
    }

    private Communication communication_organiser(){
        Contact contact = new Contact("a@gmail.com","0123456789");
        Investor investor = new Investor("002083","Almond",
                                             InvestorCategory.COLLABORATOR.toString(),contact);
        ChatBox chat_box = new ChatBox();
        return new Communication(investor,chat_box);
    }

    private List<Portfolio> portfolio_organiser(){
        List<Portfolio> list = new ArrayList<Portfolio>();

        for (int i=0; i<5; i++){
           Portfolio portfolio = new Portfolio("company"+i,"doom"+i);
           list.add(portfolio);
        }

        return list;
    }

    private void investor_organiser() {
       investor_list = new ArrayList<Investor>();

       for (int i=1; i<5; i++){
           Contact contact = new Contact(i+"@gmail.com",i+""+i+""+i);
           Investor investor = new Investor("bolod"+i,
                                          "Aladin"+i,
                                                InvestorCategory.COLLABORATOR.toString(),
                                                contact);
           investor_list.add(investor);
       }
    }

    private void motive_organiser() {
        motives = new ArrayList<String>();
        motives.add("Halal Income");
        motives.add("Get rid of being unemployed");
    }


    public Legislation getLegislation() {
        return legislation;
    }

    public Service getService() {
        return service;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getMotives() {
        return motives;
    }

    public List<Investor> getInvestor_list() {
        return investor_list;
    }
}
