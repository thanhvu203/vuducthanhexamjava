package com.example.nhanvien.Service;

import com.example.nhanvien.Entity.NhanVien;
import com.example.nhanvien.JPA.NhanVienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhanVienServiceImpl implements NhanVienService{
    @Autowired
    private NhanVienRepo nhanVienRepo;
    @Override
    public List<NhanVien> getNhanVien() {
        return nhanVienRepo.findAll();
    }

    @Override
    public String addNhanVien(NhanVien nhanVien) {
        try {
            nhanVienRepo.save(nhanVien);
            return "Thêm nhân viên thành công!";
        } catch (Exception e) {
            return "Thêm nhân viên thất bại: " + e.getMessage();
        }
    }
}
