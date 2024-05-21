package thiGK.ntu63133714.controller;
import org.springframework.web.bind.annotation.*;

public class NhanVienController {
	
    private NhanVienRepository nhanVienRepository;

    
    public NhanVien getNhanVien( int id) {
        return nhanVienRepository.findById(id).orElse(null);
    }

   
    public NhanVien addNhanVien( NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    
    public NhanVien updateNhanVien( int id,  NhanVien nhanVien) {
        nhanVien.setMaNV(id);
        return nhanVienRepository.save(nhanVien);
    }

   
    public void deleteNhanVien( int id) {
        nhanVienRepository.deleteById(id);
    }
}
