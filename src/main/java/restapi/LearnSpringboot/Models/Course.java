package restapi.LearnSpringboot.Models;

public class Course {

    public Integer courseId;
    public String courseName;
    public String courseAuthor;


    public Course(Integer courseId, String courseName, String courseAuthor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAuthor = courseAuthor;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseAuthor='" + courseAuthor + '\'' +
                '}';
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAuthor() {
        return courseAuthor;
    }

    public void setCourseAuthor(String courseAuthor) {
        this.courseAuthor = courseAuthor;
    }
}
