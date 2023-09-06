package ru.geekbrains.Lesson1.store3D.models;

public class Flash {

    private Point3D point3D;
    private Color color;
    private Angle3d angle3d;
    private float power;

    public Flash(Point3D point3D, Color color, Angle3d angle3d, float power) {
        this.point3D = point3D;
        this.color = color;
        this.angle3d = angle3d;
        this.power = power;
    }

    public Point3D getPoint3D() {
        return point3D;
    }

    public Color getColor() {
        return color;
    }

    public Angle3d getAngle3d() {
        return angle3d;
    }

    public float getPower() {
        return power;
    }

    public void rotateAngle(Angle3d angle3d){
        System.out.println("Rotated Angle3d");
    }
    public void movePoint3D(Point3D point3D){
        System.out.println("Moved point3D");
    }
}
