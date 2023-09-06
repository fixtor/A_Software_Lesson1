package ru.geekbrains.Lesson1.store3D.models;

public class Camera {

    private Point3D location;
    private Angle3d angle;

    public Camera(Point3D location, Angle3d angle) {
        this.location = location;
        this.angle = angle;
    }

    public Point3D getLocation() {
        return location;
    }

    public Angle3d getAngle() {
        return angle;
    }

    public void rotateAngle(Angle3d angle3d){
        System.out.println("Rotated Angle3d");
    }
    public void movePoint3D(Point3D point3D){
        System.out.println("Moved point3D");
    }
}
