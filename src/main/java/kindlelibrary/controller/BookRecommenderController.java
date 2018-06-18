package kindlelibrary.controller;

import kindlelibrary.service.BookRecommenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kindlelibrary")
public class BookRecommenderController {

    @Autowired
    BookRecommenderService bookRecommenderService;

    @RequestMapping(value = "/recommended")
    public String readingList(){
        return bookRecommenderService.getBooksForRecommendation();
    }

}
