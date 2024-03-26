import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	public class Student {
	    private String name;
	    private String className;
	    private String major;
	    private String university;

	    // Constructor
	    public Student(String name, String className, String major, String university) {
	        this.name = name;
	        this.className = className;
	        this.major = major;
	        this.university = university;
	    }

	    // Getters and setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getClassName() {
	        return className;
	    }

	    public void setClassName(String className) {
	        this.className = className;
	    }

	    public String getMajor() {
	        return major;
	    }

	    public void setMajor(String major) {
	        this.major = major;
	    }

	    public String getUniversity() {
	        return university;
	    }

	    public void setUniversity(String university) {
	        this.university = university;
	    }
	}

    @GetMapping("/")
    public String index(Model model) {
        
        model.addAttribute("menuItems", getMenuItems());
        model.addAttribute("carouselImages", getCarouselImages());
        model.addAttribute("students", getStudents());
        return "index";
    }

    
    private List<String> getMenuItems() {
        List<String> menuItems = new ArrayList<>();
        menuItems.add("Trường");
        menuItems.add("Khối");
        menuItems.add("Lớp");
        return menuItems;
    }

 
    private List<String> getCarouselImages() {
        List<String> carouselImages = new ArrayList<>();
        carouselImages.add("/1.jpg");
        carouselImages.add("/2.jpg");
        carouselImages.add("/3.jpg");
        return carouselImages;
    }


    private List<Student> getStudents() {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Nguyễn Văn A", "12A", "Khoa A", "Trường XYZ"));
        students.add(new Student("Trần Thị B", "11B", "Khoa B", "Trường ABC"));
        students.add(new Student("Lê Văn C", "10C", "Khoa C", "Trường XYZ"));
        return students;
    }
}