package spring.boot.greetings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sharifahmed
 * @since 2019-08-28
 */
@RestController
public class GreetingsController {

    @GetMapping(value = "/greetings")
    public String greetings() {
        return "Assalamu Alaikum";
    }
}
