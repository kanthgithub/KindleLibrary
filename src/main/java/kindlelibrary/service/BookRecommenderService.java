package kindlelibrary.service;

import org.springframework.stereotype.Component;

@Component
public class BookRecommenderService {

    public String getBooksForRecommendation(){
        return "Spring-Boot for Dummies";
    }

}
