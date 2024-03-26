package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Model.Diem; 

@Service
public class QuanLyDiemServiceImpl implements QuanLyDiemService {

    private List<Diem> danhSachDiem = new ArrayList<>();

    public QuanLyDiemServiceImpl() {
       
        danhSachDiem.add(new Diem("D1", "Điểm 1", 10));
        danhSachDiem.add(new Diem("D2", "Điểm 2", 15));
        danhSachDiem.add(new Diem("D3", "Điểm 3", 20));
    }

    @Override
    public List<Diem> layDanhSachDiem() {
        return danhSachDiem;
    }

    @Override
    public Diem timDiemTheoMa(String ma) {
        for (Diem diem : danhSachDiem) {
            if (diem.getMa().equals(ma)) {
                return diem;
            }
        }
        return null; 
    }

    @Override
    public void themDiem(Diem diem) {
        danhSachDiem.add(diem);
    }
}