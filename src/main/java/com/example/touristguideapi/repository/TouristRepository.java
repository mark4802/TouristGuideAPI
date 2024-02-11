package repository;

import model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class TouristRepository {

    ArrayList<TouristAttraction> touristAttractionArrayList = new ArrayList<>();

    public void tilføj(){
        touristAttractionArrayList.add(new TouristAttraction("Rundetårn", "Et tårn bygget af Christian d.4"));
        touristAttractionArrayList.add(new TouristAttraction("Langebro", "En bro tæt på min lejlighed"));
        touristAttractionArrayList.add(new TouristAttraction("Tivoli", "En kendt dansk forlystelsespark"));
    }

}
