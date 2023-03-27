package com.company;

import java.util.Locale;

public class Polygon implements Shape{
    Vec2 points[];

    public Polygon(Vec2[] points) {
        this.points = points;
    }

    public String toSvg(String parameters) {
        String pointsString = "";
        for(Vec2 point : points)
            pointsString += point.x + "," + point.y + " ";

        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" %s />", pointsString, parameters);
    }

//    public Point rightBottom() {
//        double bottom = 0, right = 0;
//        for(Point point : points) {
//            if(point.x > right)
//                right = point.x;
//            if(point.y > bottom)
//                bottom = point.y;
//        }
//        return new Point(right, bottom);
//    }
}
