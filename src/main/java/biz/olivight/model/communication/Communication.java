package biz.olivight.model.communication;

import biz.olivight.model.investor.Investor;

public class Communication {
    private ChatBox chat_box;
    private Investor investor;
    public Communication(Investor investor, ChatBox chat_box) {
        this.investor = investor;
        this.chat_box = chat_box;
    }

    public ChatBox getChat_box() {
        return chat_box;
    }

    public Investor getInvestor() {
        return investor;
    }
}
