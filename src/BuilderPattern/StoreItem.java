/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderPattern;


public class StoreItem

{
    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer stockAvailable;
    private final String packagingType;

    //1---> simple and clean controtor first we need to have our main controtor private because only going to use on this class 
    private StoreItem(StoreItemBuilder storeItemBuilder) {
        this.name = storeItemBuilder.name;
        this.price = storeItemBuilder.price;
        this.shortDescription = storeItemBuilder.shortDescription;
        this.longDescription = storeItemBuilder.longDescription;
        this.stockAvailable = storeItemBuilder.stockAvailable;
        this.packagingType = storeItemBuilder.packagingType;
        if (name == null || price == null) {
            throw new IllegalArgumentException("Name and price must not be null");
        }
    }

    @Override
    public String toString() {
        return "StoreItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", stockAvailable=" + stockAvailable +
                ", packagingType='" + packagingType + '\'' +
                '}';
    }
//2---> create a new class with the name and Builder at the end its convencional 
    public static class StoreItemBuilder {
        
        //3---->on this case we want all the time two objects at this case is name and price because of that they need to be final because they going to be call wend you call the controter, the other one can or not be call
        private final String name;
        private final Double price;
        private String shortDescription;
        private String longDescription;
        private Integer stockAvailable;
        private String packagingType;
//4----> new controter only pass name and price , and on this case we are using a if stament to be shore that they are not null
        public StoreItemBuilder(String name, Double price) {
            this.name = name;
            this.price = price;
            if (name == null || price == null) {
                throw new IllegalArgumentException("Name and price must not be null");
            }
        }
//5----> now we create our function that call the rest of the objects 
        public StoreItemBuilder shortDescriptionBuilder(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        public StoreItemBuilder longDescriptionBuilder(String longDescription) {
            this.longDescription = longDescription;
            return this;
        }

        public StoreItemBuilder stockAvailableBuilder(Integer stockAvailable) {
            this.stockAvailable = stockAvailable;
            return this;
        }

        public StoreItemBuilder packagingTypeBuilder(String packagingType) {
            this.packagingType = packagingType;
            return this;
        }

        //6----> were we are passing to our old controter the new one
        public StoreItem build() {
            return new StoreItem(this);

        }
    }
}
