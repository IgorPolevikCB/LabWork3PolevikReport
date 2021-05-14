package com.example.labwork3polevik.Task3;

public class Point3D extends Point {
    private int z;

    public Point3D() {
        z = 12;
    }

    public Point3D(int z) {
        this.z = z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public int getXCoordinates () {
        return this.getX();
    }

    public int getYCoordinates() {
        return this.getY();
    }


    public String toString(){
        return "Point3D coordinates is: " + "[" + this.getX() + ";" + this.getY() + ";" + this.getZ() + "]";
    }

}
