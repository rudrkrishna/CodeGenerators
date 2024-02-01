import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Place{
    private String pName;
    private Integer pCode;
    private Integer pYear;
    private double pVisitors;

    public Place(String pName, Integer pCode, Integer pYear, double pVisitors) {
        this.pName = pName;
        this.pCode = pCode;
        this.pYear = pYear;
        this.pVisitors = pVisitors;
    }

    @Override
    public String toString() {
        return "Place{" +
                "pName='" + pName + '\'' +
                ", pCode=" + pCode +
                ", pYear=" + pYear +
                ", pVisitors=" + pVisitors +
                '}';
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getpCode() {
        return pCode;
    }

    public void setpCode(Integer pCode) {
        this.pCode = pCode;
    }

    public Integer getpYear() {
        return pYear;
    }

    public void setpYear(Integer pYear) {
        this.pYear = pYear;
    }

    public double getpVisitors() {
        return pVisitors;
    }

    public void setpVisitors(double pVisitors) {
        this.pVisitors = pVisitors;
    }
}
class City{

    private String cName;
    private Long cPopulation;

    private List<Place> places;

    private double genderRatio;

    public City(String cName, Long cPopulation, List<Place> places, double genderRatio) {
        this.cName = cName;
        this.cPopulation = cPopulation;
        this.places = places;
        this.genderRatio = genderRatio;
    }

    @Override
    public String toString() {
        return "City{" +
                "cName='" + cName + '\'' +
                ", cPopulation=" + cPopulation +
                ", places=" + places +
                ", genderRatio=" + genderRatio +
                '}';
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Long getcPopulation() {
        return cPopulation;
    }

    public void setcPopulation(Long cPopulation) {
        this.cPopulation = cPopulation;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public double getGenderRatio() {
        return genderRatio;
    }

    public void setGenderRatio(double genderRatio) {
        this.genderRatio = genderRatio;
    }
}
public class Source {
    public static void main(String[] args) {

//     List<Place> place = new ArrayList<>();
//     place.add(new Place("Marathahalli", 560039, 1855, 30000L));
//     place.add(new Place("Lal Bagh", 560345, 1767, 20000L));
//     place.add(new Place("MG Road", 560039, 1855, 28000L));
//     place.add(new Place("Cubbon Park", 560345, 1947, 10000L));
//
//     List<Place> place1 = new ArrayList<>();
//     place1.add(new Place("India Gate", 100134, 1955, 310000L));
//     place1.add(new Place("Red Fort", 100233, 1565, 202000L));
//     place1.add(new Place("UPSC", 101011, 1766, 1000L));
//     place1.add(new Place("Karol Bagh", 100012, 1877, 120000L));
//
//     List<City> cities= new ArrayList<>();
//     cities.add(new City("Bangalore", 1000000L, place, 1.8));
//     cities.add(new City("Delhi", 2000000L, place1, 1.9));
//
//        System.out.println(cities.stream().collect(Collectors.toMap(City::getcName, City::getPlaces)));

        }
    }
