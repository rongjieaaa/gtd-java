package gtd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GTDController {

    @GetMapping("/getGTD")
    public String getGTD() {
        return "hello";
    }
}
