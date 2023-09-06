package ru.geekbrains.Lesson1.store3D.models;

public class Scene {

    private int id;
    private Flash flash;
    private PoligonalModel models;

    public Scene(int id, Flash flash, PoligonalModel models) {
        this.id = id;
        this.flash = flash;
        this.models = models;
    }

    public int getId() {
        return id;
    }

    public void method1 (Flash flash, Camera camera, PoligonalModel models){
        System.out.println("Build Scene");
    }
}
