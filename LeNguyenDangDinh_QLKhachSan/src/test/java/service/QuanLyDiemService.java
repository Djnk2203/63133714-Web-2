package service;
import java.util.List;

import Model.Diem;
public interface QuanLyDiemService {
	List<Diem> layDanhSachDiem();
    Diem timDiemTheoMa(String ma);
    void themDiem(Diem diem);
}
