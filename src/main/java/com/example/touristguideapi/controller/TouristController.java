package controller;

import model.TouristAttraction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/attractions")
public class TouristController {
    TouristAttraction touristAttraction;

    @GetMapping("/tivoli")
    public ResponseEntity<String> tivoliDescription() {
        return new ResponseEntity<>(touristAttraction.getDescription(), HttpStatus.OK);
    }

}
