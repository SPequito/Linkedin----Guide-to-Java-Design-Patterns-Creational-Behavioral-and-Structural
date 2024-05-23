/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import AdapterPattern.EnglishLocalizedMessage;
import AdapterPattern.FrenchLocalizedMessageClassAdapter;
import AdapterPattern.FrenchLocalizedMessageObjectAdapter;
import AdapterPattern.Greeting;
import BridgePattern.Blue;
import BridgePattern.Circle;
import BridgePattern.Red;
import BridgePattern.Square;
import BuilderPattern.ItemRegistry;
import BuilderPattern.StoreItem;
import CompositePattern.Note;
import CompositePattern.Song;
import DecoraterPattern.BasicRoom;
import DecoraterPattern.RoomCouch;
import DecoraterPattern.RoomCouchTable;
import FacatePattern.SendMessageFacade;
import Factory.Snack;
import Factory.VendingMachine;
import FactoryAbstract.FactoryMaker;
import FactoryAbstract.UserInterface;
import FlyweightPattern.FlowerFactory;
import InterpreterPattern.DotAtTheEnd;
import IteratorPattern.Country;
import IteratorPattern.Inventory;
import MediatorPattern.Mediator;
import MediatorPattern.PedestrianCrossingLight;
import MediatorPattern.TrafficLight;
import ObserverPattern.Location;
import ObserverPattern.WeatherUpdates;
import Prototype.Building;
import Prototype.BuildingType;
import Prototype.Graphic;
import ProxyPattern.MovieMediaProxy;
import Singleton.Cat;
import Singleton.Dog;
import StatePattern.MediaPlayer;
import TheChainOfResponsibilityPattern.ATM;
import TheChainOfResponsibilityPattern.EuroATM;
import TheChainOfResponsibilityPattern.UsDollarATM;
import TheChainOfResponsibilityPattern.WithdrawalRequest;
import TheCommandPattern.Light;
import TheCommandPattern.LightOffOperation;
import TheCommandPattern.LightOnOperation;
import TheCommandPattern.LightOperationExecutor;
import TheStrategyPattern.Authenticator;
import TheStrategyPattern.CheckoutPage;
import TheTemplateMethodPattern.MeatFeastPizza;
import TheTemplateMethodPattern.VegetarianPizza;
import java.util.List;


/**
 *
 * @author stefa
 */
public class Main {
    
      private static final MovieMediaProxy movieProxy = new MovieMediaProxy();
        
    
    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        //Build Pattern 
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------"+"\n" + "Build"+"\n");
        // 7----> were we call our controter(s), and we call the function inside, remember ate the end we need to call .build()
        var item1 = new StoreItem.StoreItemBuilder(
                "Pretzel", 2.0).shortDescriptionBuilder("A tasty snack").longDescriptionBuilder(null).stockAvailableBuilder(
                        7).packagingTypeBuilder(null).build();

        var item2 = new StoreItem.StoreItemBuilder(
                "Soup", 1.5).shortDescriptionBuilder(null).longDescriptionBuilder(
                        "A meal that you can warm up at home. It can come in different flavours including tomato, chicken, and vegetable").stockAvailableBuilder(null).packagingTypeBuilder("Can").build();

        addToItemRegistry(item1);
        addToItemRegistry(item2);
        

        Thread.sleep(1000);
        
        //Singleton Pattern 
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Singleton"+"\n");
        var dog = new Dog();
        dog.woof();

        var cat = new Cat();
        cat.meow();
        
        Thread.sleep(1000);
        
        //Prototype Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Prototype"+"\n");
        
        
        BuildingType houseBuildingType = new BuildingType("House");
        Building house1 = new Building(21, houseBuildingType);
        //were we clone the firts house fot all the other ones but this one at the end going to be set 
        Building house2 = house1.clone();
        Building house3 = house1.clone();
        Building house4 = house1.clone();
        Building house5 = house1.clone();
        houseBuildingType.setType("House with yard");


        BuildingType skyscraperBuildingType = new BuildingType("skyscraper");
        Building skyscraper1 = new Building(86, skyscraperBuildingType);
        Building skyscraper2 = skyscraper1.clone();
        Building skyscraper3 = skyscraper1.clone();
        Building skyscraper4 = skyscraper1.clone();
        Building skyscraper5 = skyscraper1.clone();

        List<Graphic> order = List.of(house1, house2, house3, house4, house5,
                skyscraper1, skyscraper2, skyscraper3, skyscraper4, skyscraper5);

        createCityscape(order);
            
        Thread.sleep(1000);
        
        //Factory Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Factory"+"\n");
        
        Thread.sleep(1000);
        
        buySnack("ChocolateBar");
        buySnack("Chips");
        buySnack("Drink");
        
        
        //FactoryAbstract Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Factory Abstract"+"\n");
        
         Thread.sleep(1000);
         
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);
        
        
        //Adape rPattern 
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "AdaperPattern"+"\n");
        
         Thread.sleep(1000);
         
        var englishLocalizedMessage = new EnglishLocalizedMessage();
        var englishGreeting = new Greeting(englishLocalizedMessage);
        englishGreeting.print();

        var frenchLocalizedMessage = new FrenchLocalizedMessageObjectAdapter();
        var frenchGreeting = new Greeting(frenchLocalizedMessage);
        System.out.println("This is object Adapter");
        frenchGreeting.print();

        var frenchLocalizedMessage2 = new FrenchLocalizedMessageClassAdapter();
        var frenchGreeting2 = new Greeting(frenchLocalizedMessage2);
        System.out.println("This is class Adapter");
        frenchGreeting2.print();
        
        //Bridge Pattern 
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Bridge Pattern"+"\n");
        
         Thread.sleep(1000);
         
        var circle = new Circle(new Blue());
        circle.getType();
        circle.getColor().get();

        var square = new Square(new Red());
        square.getType();
        square.getColor().get();
        
        //Composite Pattern 
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Composite Pattern "+"\n");
        
         Thread.sleep(1000);
         
        var a = new Note('A');
        var b = new Note('B');
        var c = new Note('C');
        var d = new Note('D');
        var e = new Note('E');
        var f = new Note('F');
        var g = new Note('G');

        var doReMe = new Song();

        doReMe.addNote(c);
        doReMe.addNote(d);
        doReMe.addNote(e);
        doReMe.addNote(c);
        doReMe.addNote(e);
        doReMe.addNote(c);
        doReMe.addNote(e);

        doReMe.getNotes().get(0).play();
        doReMe.getNotes().get(1).play();
        doReMe.getNotes().get(2).play();
        doReMe.getNotes().get(3).play();
        doReMe.getNotes().get(4).play();
        doReMe.getNotes().get(5).play();
        doReMe.getNotes().get(6).play();

         System.out.println("composite pattern");
         
        doReMe.isPlay();
     
        Thread.sleep(1000);
        //Decorator Pattern 
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Decorator Pattern "+"\n");
        
        Thread.sleep(1000);
         
         var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        // create a room with a carpet and a couch

        var roomCouch = new RoomCouch(room);
        roomCouch.printFurniture();

        System.out.println();

        // create a room with a carpet, a couch and a table

        var roomCouchTable = new RoomCouchTable(roomCouch);
        roomCouchTable.printFurniture();

        System.out.println();
        
         Thread.sleep(1000);
        //Facade Pattern 
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Facade Pattern"+"\n");
        
        Thread.sleep(1000);
        
        SendMessageFacade message = new SendMessageFacade();
        message.sendMessage();
        
                //Flyweight Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Flyweight Pattern"+"\n");
        
        Thread.sleep(1000);
        
        var sunflower1 = FlowerFactory.createFlower("Sunflower");
        var sunflower2 = FlowerFactory.createFlower("Sunflower");
        var sunflower3 = FlowerFactory.createFlower("Sunflower");
        System.out.println(sunflower1);
        System.out.println(sunflower2);
        System.out.println(sunflower3);

        var rose1 = FlowerFactory.createFlower("Rose");
        var rose2 = FlowerFactory.createFlower("Rose");
        var rose3 = FlowerFactory.createFlower("Rose");
        System.out.println(rose1);
        System.out.println(rose2);
        System.out.println(rose3);
        
       //Proxy Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Proxy Pattern"+"\n");
        
        Thread.sleep(1000);
      
        goToMovieLibrary();
        goToFavoriteMovies();
        
        //The Chain Of Responsibility Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "The Chain Of Responsibility Pattern"+"\n");
       
        var requestUSD = new WithdrawalRequest(20, WithdrawalRequest.Currency.USD);
        var requestEuro = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        var atm = buildChain();
        atm.dispense(requestUSD);
        atm.dispense(requestEuro);
        
         Thread.sleep(1000);
         //The Command Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Command Pattern"+"\n");
        
        var light = new Light();
        light.isOn();
        var lightOperationExecutor = new LightOperationExecutor();       
        lightOperationExecutor.execute(new LightOnOperation(light));
        light.isOn();
        lightOperationExecutor.execute(new LightOffOperation(light));
        light.isOn();
        
                 Thread.sleep(1000);
         //The Interpreter Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Interpreter Pattern"+"\n");
    
        var context = "hello world";
        var dotAtTheEnd = new DotAtTheEnd();
        var result = dotAtTheEnd.interpret(context);
        System.out.println(result);
        
                         Thread.sleep(1000);
         //Iterator Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Iterator Pattern"+"\n");
        
        var india = new Country("India");
        var poland = new Country("Poland");
        var nigeria = new Country("Nigeria");
        var canada = new Country("Canada");
        var argentina = new Country("Argentina");

        var inventory = new Inventory(india,poland,nigeria,canada,argentina);
        var stockIterator = inventory.iterator();

        while (stockIterator.hasNext()) {
            var countrie = stockIterator.next();
            System.out.println(countrie.getName());
        }
        
                                 Thread.sleep(1000);
         //Mediator Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Mediator Pattern"+"\n");
        
        var trafficLight = new TrafficLight();
        var pedestrianCrossingLight = new PedestrianCrossingLight();
        var mediator = new Mediator(pedestrianCrossingLight, trafficLight);

        mediator.changeColorAmber();
        mediator.changeColorGreen();
        mediator.changeColorAmber();
        mediator.changeColorRed();
        
                                        Thread.sleep(1000);
         //Mediator Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "Observer Pattern"+"\n");
        
        
        var location1 = new Location();
        var location2 = new Location();
        var weatherUpdates = new WeatherUpdates();

        location1.addListener(weatherUpdates);
        location2.addListener(weatherUpdates);

        location1.setWeatherEvent("Risk of flooding");
        location2.setWeatherEvent("Risk of drought");

        weatherUpdates.printUpdates();

                                                Thread.sleep(1000);
         //State Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "State Pattern"+"\n");
        
        var mediaPlayer = new MediaPlayer();
        mediaPlayer.pressButton();
        mediaPlayer.pressButton();

        
                                                    Thread.sleep(1000);
         //The strategy Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "The strategy Pattern"+"\n");
        
         var checkoutPage = new CheckoutPage();

        checkoutPage.playMetho(Authenticator.payByBankTransfer);
        checkoutPage.playMetho(Authenticator.payWithCardAuthenticator);
        
        
                 //The Template Method Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "The Template Method Pattern"+"\n");
        
               var vegetarianPizza = new VegetarianPizza();
        vegetarianPizza.makeBase();
        vegetarianPizza.addToppings();
        vegetarianPizza.cook();

        var meatFeastPizza = new MeatFeastPizza();
        meatFeastPizza.makeBase();
        meatFeastPizza.addToppings();
        meatFeastPizza.cook();
        
        //The Visitor Pattern
        System.err.println("--------------------------------------------"+"\n" + "--------------------------------------------" + "\n" + "The Visitor Pattern"+"\n");
        
        
        
        
        
        
        
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        // this is part of our BuilderPatter 
        private static void addToItemRegistry(StoreItem storeItem) {
        System.out.println("A new item was added to the registry: \n" + storeItem);
    }
        
        // this is part of out PrototypePatter
        
        private static void createCityscape(List<Graphic> graphics) {
        System.out.println("Constructing cityscape: " );
        graphics.forEach(System.out::println);
    }
        
         // this is part of out FactoryPatter
        private static final VendingMachine VENDING_MACHINE = new VendingMachine();
        
        private static void buySnack(String snackType) throws IllegalAccessException {
        Snack snack = VENDING_MACHINE.getSnack(snackType);
        System.out.println("One " + snackType + " purchased. The price is $" + snack.getPrice() + ".");
        
        
        
        
        
    }
        
        
        
        
        
        // this is part of out FactoryAbstractPatter
        
            private static UserInterface createUserInterface(String color) {
            var interfaceFactory =  FactoryMaker.createFactory(color);
            var ScrollBarFactory = interfaceFactory.createScrollBar();
            var ButtonBarFactory = interfaceFactory.createButton();

       
       
        if (color.equalsIgnoreCase("BlUE")) {

            return new UserInterface(ButtonBarFactory, ScrollBarFactory);
        } else if (color.equalsIgnoreCase("RED")) {
    
            return new UserInterface(ButtonBarFactory, ScrollBarFactory);
        } else {
            throw new IllegalArgumentException("Color not supported");
        }
        

         
    }
      // this is part of out Proxy Patter
        
        private static void goToMovieLibrary() {
        System.out.println("Loading movie library...");    
        movieProxy.playMedia();
         }   

        private static void goToFavoriteMovies() {
        System.out.println("Loading favorite movies...");
        movieProxy.playMedia();
        }   
        
        // this is part of The Chain Of Responsibility Pattern
        
            private static ATM buildChain() {
        var euroATM = new EuroATM(null);
        var dollarATM = new UsDollarATM(euroATM);
        return dollarATM;


    }
        
}
