package com.example.android.searchabledict;

import com.google.maps.android.quadtree.PointQuadTree;
import com.google.maps.android.geometry.Point;

public class QuadTreeItem implements PointQuadTree.Item{
	private Point mPoint;
	
	public QuadTreeItem(double xval, double yval){
		mPoint = new Point(xval, yval);
	}
	
	public Point getPoint() {
        return mPoint;
    }
}
