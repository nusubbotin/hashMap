package car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AutoRace <T extends Transport & CompetingTransport, D extends DriverInterface, H extends Set>{
    private Set<T> cars = new HashSet<>();

    private Set<T> drivers = new HashSet<>();

    private Set<Sponsor> sponsors = new HashSet<>();

    private Set<Mechanic> mechanics = new HashSet<>();

    private ServiceStation serviceStation;

    public void addCar() {

    }

    public AutoRace(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    public Set<T> getCars() {
        return cars;
    }

    public Set<T> getDrivers(){
        return drivers;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public ServiceStation getServiceStation() {
        return serviceStation;
    }

    public void printHashSet(H Set){
        System.out.println(Arrays.toString(Set.toArray()));
    }
}
