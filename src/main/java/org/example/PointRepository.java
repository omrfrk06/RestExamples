package org.example;

import java.util.ArrayList;
import java.util.List;

public class PointRepository {
    List<Point> points;

    public PointRepository(){
        points = new ArrayList<>();

        Point p1 = new Point();
        p1.setId(101);
        p1.setName("Test1");
        p1.setPoint(20);

        Point p2 = new Point();
        p2.setId(102);
        p2.setName("Test2");
        p2.setPoint(40);

        points.add(p1);
        points.add(p2);
    }

    public List<Point> getPoints(){
        return points;
    }

    public Point getPoint(int id){
        for (Point p : points){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public void create(Point p1) {
        points.add(p1);
    }
}
