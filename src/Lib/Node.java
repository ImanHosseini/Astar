package Lib;

import java.util.Set;

/**
 * Created by L i o n on 3/7/2017.
 * Seyed Iman Hosseini Zavaraki
 * Github @ https://github.com/ImanHosseini
 * Wordpress @ https://imanhosseini.wordpress.com/
 */
public abstract class Node implements Comparable<Node> {
    public abstract double totalVal();

    public abstract double f();

    public abstract double h();

    public abstract boolean isGoal();

    public abstract Node getFather();

    public abstract Set<Link> getLinks();

    @Override
    public int compareTo(Node anotherNode) {
        if (this.totalVal() > anotherNode.totalVal()) return 1;
        else if (this.totalVal() == anotherNode.totalVal()) return 0;
        else return -1;
    }

    public abstract String toString();
}


