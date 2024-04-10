package restapi.LearnSpringboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import restapi.LearnSpringboot.Models.Course;
import restapi.LearnSpringboot.Models.CurrencyConfiguration;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {


    @Autowired
    public CurrencyConfiguration currencyConfiguration;

    @GetMapping("/courses")
    public List<Course> retrieveAllCourses () {
        System.out.println();
        return new ArrayList<>(List.of(new Course(1,"Java","in28minutes"),
                new Course(3,"devops","in28minutes"))
        );
    }

    @GetMapping("/currency-configuration")
    public CurrencyConfiguration currencyConfiguration () {
        return  currencyConfiguration;
    }

}
