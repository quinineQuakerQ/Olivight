package biz.olivight.model.utility;

public class StatisticsExtension {
    private static int visit_amount=0;

    public static void update(){
        visit_amount++;
    }

    public static Statistics get_statistics(){
        return new Statistics(visit_amount,null,null);
    }
}
