package main;

import ru.javawebinar.webapp.model.Link;

import java.util.Date;

/**
 * User: gkislin
 * Date: 18.06.2014
 */
public class Main {
    /**
     * First java program
     *
     * @param args : program arguments
     */
    public static void main(String[] args) {
        Link link = new Link("name", "url");
        link.setName("name2");
        link.setUrl("ulr2");
//        System.out.println(link.toString());
//        System.out.println(link.getName());
        Date startDate  = new Date(2016,1,1);
        System.out.println(startDate.toString().substring(4,7));
        System.out.println("\n Date: " + startDate.getYear() + " " + startDate.getMonth() + " " + startDate);

    }
}
