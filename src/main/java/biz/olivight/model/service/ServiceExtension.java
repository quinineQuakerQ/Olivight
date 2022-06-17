package biz.olivight.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ServiceExtension {

    public static List<String> get_all_service_type(){
        return new ArrayList<String>(get_all_service_info().keySet());
    }


    public static List<String> get_all_service_details(){
        return new ArrayList<String>(get_all_service_info().values());
    }

    public static List<Integer> get_service_provider_amount_per_type(){
        return new ArrayList<Integer>(get_all_service_capacity().values());
    }

    private static HashMap<String, String> get_all_service_info(){
       HashMap<String, String> service_info = new HashMap<String,String>();
       service_info.put("Brain-wash","We will get your money and you will be doomed");
       service_info.put("Explosion","On Start your pc will explode");
       service_info.put("Repair","Your tools with half-life cycle will loose 100% life overnight");
       return service_info;
    }

    private static HashMap<String, Integer> get_all_service_capacity(){
        HashMap<String, Integer> service_capacity = new HashMap<String,Integer>();
        service_capacity.put("Brain-wash",2);
        service_capacity.put("Explosion",1);
        service_capacity.put("Repair",3);
        return service_capacity;
    }
}
