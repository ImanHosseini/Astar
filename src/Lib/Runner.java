package Lib;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by L i o n on 3/7/2017.
 * Seyed Iman Hosseini Zavaraki
 * Github @ https://github.com/ImanHosseini
 * Wordpress @ https://imanhosseini.wordpress.com/
 */
public class Runner {
    private Node start;
    public Runner(Node start){
        this.start=start;
    }
    public ArrayList<Node> search(){
        boolean found=false;
        PriorityQueue<Node> front=new PriorityQueue<>();
        front.add(start);
        Node goal=null;
        while(!found){
            Node popped=front.poll();
            if(popped==null) break;
            for(Link n : popped.getLinks()){
                Node child=n.to;
                if(child.isGoal()) {
                    found=true;
                    goal=child;
                    break;
                }
                front.add(child);
            }
        }
        if(!found) return null;
        ArrayList<Node> path=new ArrayList<>();
        path.add(goal);
        while(true){
            if(goal.getFather()==null) break;
            Node fa=goal.getFather();
            path.add(fa);
            goal=fa;
        }
        return path;
    }
}
