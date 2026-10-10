package com.horimap.waypoint;

/**
 * Represents a single waypoint in HoriMap.
 */
public class Waypoint {
    private String name;
    private double x, y, z;
    private int dimension;
    private int color;
    private boolean visible = true;
    private boolean showDistance = true;
    private long createdAt;

    public Waypoint(String name, double x, double y, double z, int dimension) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.dimension = dimension;
        this.color = 0xFFFFFF;
        this.createdAt = System.currentTimeMillis();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public double getZ() { return z; }
    public void setZ(double z) { this.z = z; }

    public int getDimension() { return dimension; }
    public void setDimension(int dimension) { this.dimension = dimension; }

    public int getColor() { return color; }
    public void setColor(int color) { this.color = color; }

    public boolean isVisible() { return visible; }
    public void setVisible(boolean visible) { this.visible = visible; }

    public boolean isShowDistance() { return showDistance; }
    public void setShowDistance(boolean showDistance) { this.showDistance = showDistance; }

    public long getCreatedAt() { return createdAt; }
}
