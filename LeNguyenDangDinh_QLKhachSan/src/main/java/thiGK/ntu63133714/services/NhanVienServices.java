package thiGK.ntu63133714.services;

public class NhanVienServices {
	 private NhanVienRepository nhanVienRepository;

	    public List<NhanVien> getAllNhanVien() {
	        return nhanVienRepository.findAll();
	    }

	    public NhanVien getNhanVienById(Long id) {
	        return nhanVienRepository.findById(id).orElse(null);
	    }

	    public NhanVien addNhanVien(NhanVien nhanVien) {
	        return nhanVienRepository.save(nhanVien);
	    }

	    public void deleteNhanVien(Long id) {
	        nhanVienRepository.deleteById(id);
	    }
}
