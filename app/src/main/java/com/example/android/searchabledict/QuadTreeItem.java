package com.example.android.searchabledict;

import com.google.maps.android.quadtree.PointQuadTree;
import com.google.maps.android.geometry.Point;

public class QuadTreeItem implements PointQuadTree.Item{
	private Point mPoint;
	private double x;
	private double y;
	
	public QuadTreeItem(double xval, double yval){
		mPoint = new Point(xval, yval);
		x = xval;
		y = yval;
	}
	
	public Point getPoint() {
        return mPoint;
    }
    public double getX() { return x;}
	public double getY() { return y;}
}
