/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author stefa
 */
public class Building extends Graphic {

    private BuildingType buildingType;

    public Building(int heightInPixels, BuildingType buildingType) {
        super(heightInPixels);
        this.buildingType = buildingType;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }


    @Override
    public String toString() {
        return "Building{" +
                "height in pixels='" + super.getHeightInPixels() + '\'' +
                "building type='" + buildingType + '\'' +
                '}';
    }

    //2---> Override our method from abstract class.
    @Override
    public Building clone(){
        //3----> return controther with this height that can be change with set and create a new BuildingType object and get the 1º before set a save
            return new Building(this.getHeightInPixels(), new BuildingType(this.getBuildingType().getType()));

    }
}
