import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
package Controler;

public class MainController {
	 @GetMapping({"/", "/home"})
	    public String getIndex(Model model) {
	        // Đưa các dữ liệu cần thiết vào Model để hiển thị trên trang index.html
	        // Ví dụ: danh sách các danh mục, danh sách ảnh, danh sách sinh viên...
	        return "index";
	    }

}
