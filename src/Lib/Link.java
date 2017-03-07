package Lib;

/**
 * Created by L i o n on 3/7/2017.
 * Seyed Iman Hosseini Zavaraki
 * Github @ https://github.com/ImanHosseini
 * Wordpress @ https://imanhosseini.wordpress.com/
 */
public class Link {
    public Node from;
    public Node to;
    public double cost;
    public Link (Node from,Node to,double cost){
        this.from=from;
        this.to=to;
        this.cost=cost;
    }
}
