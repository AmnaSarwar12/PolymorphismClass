import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Movie movie = Movie.getMovie("Adventure", "StarWars");
        //movie.watchMovies();

//        Scanner sc = new Scanner(System.in);
//        while (true){
//            System.out.println("Enter Type(A For Adventure, C For Comedy and S for ScienceFiction or Q to quit)");
//            String type = sc.nextLine();
//            if("Qq".contains(type)){
//                break;
//            }
//            System.out.println("Enter Movie Title");
//            String title = sc.nextLine();
//            Movie movie = Movie.getMovie(type,title);
//            movie.watchMovies();
//        }

        Car car = new Car("2022 blue fararri 296 GTS");
        runRace(car);

        Car farrari = new GasPoweredCar("2022 blue farrari ",15.4,6);
        runRace(farrari);

        Car tesla = new ElectricCar("2022 Red tesla Model 3", 586, 74);
        runRace(tesla);
    }

    public static void runRace(Car car){

        car.StartEngine();
        car.Drive();
    }

}