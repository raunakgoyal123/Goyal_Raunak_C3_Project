import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName) {
        for(Restaurant r : restaurants) {
            if(r.getName().equals(restaurantName)){
                return r;
            }
        }
        return null;
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }
    public int calculateorderamount(String  itemname1, String itemname2){
       Item i1=new Item("Sandwich",10);
       Item i2=new Item("Cake",20);
       return i1.getPrice()+i2.getPrice();
    }
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

}
