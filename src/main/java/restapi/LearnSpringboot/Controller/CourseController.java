package restapi.LearnSpringboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import restapi.LearnSpringboot.Models.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {


    @GetMapping("/courses")
    public List<Course> retrieveAllCourses () {
        return new ArrayList<>(List.of(new Course(1,"Java","in28minutes"),
                new Course(2,"devops","in28minutes"))
        );
    }


}
