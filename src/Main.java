import car.*;
import product.Product;
import product.ProductSet;
import recipe.Recipe;
import recipe.RecipeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
    }

    private static void task4() {
        System.out.println("Часть 3. Задание 1:");
        AutoRace race = new AutoRace(new ServiceStation());

        System.out.println("В гонках участвуют следующие автомобили:");
        Set<Transport> cars = race.getCars();
        Car car = new Car("лада", "гранта", 1.5f, 2);
        CargoCar cargoCar = new CargoCar("Самосвал", "Камаз", 6, 2);
        Bus bus = new Bus("Скания", "Скания модель", 5.6f, 1);

        cars.add(car);
        cars.add(cargoCar);
        cars.add(bus);
        cars.add(bus);
        race.printHashSet(cars);


        System.out.println();
        System.out.println("В гонках участвуют следующие гонщики:");
        DriverB drivar1 = new DriverB("Шумахер", 30);
        DriverC drivar2 = new DriverC("Чемптон мира Дакар", 15);
        DriverD drivar3 = new DriverD( "Лучший шоссейный водитель года", 10);

        DriverB drivar4 = new DriverB("Алонсо", 31);
        DriverC drivar5 = new DriverC("Фаттель", 32);
        DriverD drivar6 = new DriverD( "Норрис", 33);

        race.getDrivers().add(drivar1);
        race.getDrivers().add(drivar2);
        race.getDrivers().add(drivar3);
        race.getDrivers().add(drivar4);
        race.getDrivers().add(drivar5);
        race.getDrivers().add(drivar6);
        race.getDrivers().add(drivar6);
        race.printHashSet(race.getDrivers());

        System.out.println();
        System.out.println("Гонку спонсируют:");
        Sponsor sponsors1 = new Sponsor<Transport>("Газпром",  Sponsor.SponsorType.UL, 10_000_000);
        race.getSponsors().add(sponsors1);
        Sponsor sponsors2 = new Sponsor<Transport>("Лукойл",  Sponsor.SponsorType.UL, 15_000_000);
        race.getSponsors().add(sponsors2);
        Sponsor sponsors3 = new Sponsor<Transport>("Потанин",  Sponsor.SponsorType.FL, 5_000_000);
        race.getSponsors().add(sponsors3);
        race.getSponsors().add(sponsors3);
        race.printHashSet(race.getSponsors());

        System.out.println();
        System.out.println("Гонку обсулживают авто-механики:");
        Set<Mechanic<Transport>> mechs = race.getMechanics();
        Mechanic mechanic1 = new Mechanic<Transport>("Иван", "Иванов", "Тесла");
        mechanic1.getCarCategories().add(Transport.CarCategory.B);
        mechanic1.getCarCategories().add(Transport.CarCategory.B);
        mechs.add(mechanic1);
        mechs.add(mechanic1);

        Mechanic mechanic2 = new Mechanic<Transport>("Петя", "Петров", "Форворд-Авто");
        mechanic2.getCarCategories().add(Transport.CarCategory.C);
        mechanic2.getCarCategories().add(Transport.CarCategory.D);
        mechs.add(mechanic2);


        Mechanic mechanic3 = new Mechanic<Transport>("Федя", "Федоров", "Лада-Центр");
        mechanic3.getCarCategories().add(Transport.CarCategory.C);
        mechanic3.getCarCategories().add(Transport.CarCategory.D);
        mechanic3.getCarCategories().add(Transport.CarCategory.D);
        mechs.add(mechanic3);

        race.printHashSet(mechs);

        Set<Sponsor> sponsors = race.getSponsors();
        System.out.println("Спонсор " + sponsors1.getName() + " начинает спонсировать соревнования: ");
        sponsors1.sponsorCar((Transport) car, 5_000_000);
        sponsors1.sponsorCar((Transport) cargoCar, 5_000_000);


        System.out.println("Спонсор " + sponsors2.getName() + " начинает спонсировать соревнования: ");
        sponsors2.sponsorCar((Transport) car, 5_000_000);
        sponsors2.sponsorCar((Transport) cargoCar, 5_000_000);
        sponsors2.sponsorCar((Transport) bus, 5_000_000);

        System.out.println("Спонсор " + sponsors3.getName() + " начинает спонсировать соревнования: ");
        sponsors3.sponsorCar((Transport) bus, 5_000_000);


        Set<Driver> drivars = race.getDrivers();

        System.out.println("Автогонщики занимают автомобиль для заезда 1: ");
        drivar1.setCurAuto(car);
        drivar2.setCurAuto(cargoCar);
        drivar3.setCurAuto(bus);

        System.out.println("Автогонщики занимают автомобиль для заезда 2: ");
        drivar4.setCurAuto(car);
        drivar5.setCurAuto(cargoCar);
        drivar6.setCurAuto(bus);
        //drivar6.setCurAuto(cars.get(1)); //Гонщик управляет только одим автомобилем!

        System.out.println("После заездов выполним ТО и ремонт автомобилей: ");
        mechanic1.maintenanceTransport(car);
        mechanic2.maintenanceTransport(cargoCar);
        mechanic2.maintenanceTransport(bus);

        mechanic3.fixTransport(cargoCar);
        //mechanic3.fixTransport(bus);  //Превышен лимит Механиков

        //mechanic1.maintenanceTransport(cars.get(0)); //Механик Петя не может ремонтировать ТС категории Легковые автомобили

        System.out.println("Добавим в очередь 3и авто на Станцию техобслуживания");
        race.getServiceStation().pushAuto(car);
        race.getServiceStation().pushAuto(cargoCar);
        //race.getServiceStation().pushAuto(cars.get(2)); На станции техобслуживания обслуживаюся только Легковой транспорт и Грузовой транспорт
    }

    private static void task3() {
        System.out.println("Часть2. Задание 2:");
        IntSet intSet = new IntSet();

        System.out.println(intSet);
        intSet.delNotEven();
        System.out.println(intSet);

    }

    private static void task2() {
        System.out.println("Часть2. Задание 1:");
        RecipeSet recipeSet = new RecipeSet();

        ProductSet productSet1 = new ProductSet();
        productSet1.addProduct(new Product("апельсины", 120.50f, 1.5f));
        productSet1.addProduct(new Product("мандарины", 100, 1.5f));

        recipeSet.addRecipe(new Recipe("Тропический салат", productSet1));

        ProductSet productSet2 = new ProductSet();
        productSet2.addProduct(new Product("картофель", 40, 10));
        productSet2.addProduct(new Product("огурцы", 60, 3));
        recipeSet.addRecipe(new Recipe("Овощной салат", productSet2));
        System.out.println(recipeSet);

        //recipeSet.addRecipe(new Recipe("Тропический салат", productSet2)); //Такой рецепт уже существует

    }

    /*private static void task1() {
        System.out.println("Часть1. Задание 1:");
        ProductSet productSet = new ProductSet();


        productSet.addProduct(new Product("апельсины", 120.50f, 1.5f));
        productSet.addProduct(new Product("мандарины", 100, 1.5f));
        productSet.addProduct(new Product("яблоки", 80, 1.5f));
        //productSet.addProduct(new Product("апельсины", 120, 1)); // Товар уже находится в списке (наборе)
        productSet.addProduct(new Product("картофель", 40, 10));

        System.out.println(Arrays.toString(productSet.getProduct().toArray()));

        productSet.delProduct(new Product("картофель"));
        System.out.println(Arrays.toString(productSet.getProduct().toArray()));

        for (Product product : productSet.getProduct()) {
            product.buyProduct();
        }
        System.out.println(Arrays.toString(productSet.getProduct().toArray()));

        for (Product product : productSet.getProduct()) {
            //product.buyProduct(); // Товар мандарины уже куплен
            break;
        }
    }*/
}