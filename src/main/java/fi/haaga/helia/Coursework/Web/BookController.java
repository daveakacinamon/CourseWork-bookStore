package fi.haaga.helia.Coursework.Web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

/**
 * Created by dac on 9.2.2017.
 */
@Controller
public class BookController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String book(@RequestParam(value = "title") String title,
                       @RequestParam(value = "author") String author,
                       @RequestParam(value = "year") int year,
                       @RequestParam(value = "ISBN") String ISBN,
                       @RequestParam(value = "price") Double price,
                       Model model) {
        model.addAttribute("title", title);
        model.addAttribute("author", author);
        model.addAttribute("year", year);
        model.addAttribute("ISBN", ISBN);
        model.addAttribute("price", price);
        return "books";
    }
}
