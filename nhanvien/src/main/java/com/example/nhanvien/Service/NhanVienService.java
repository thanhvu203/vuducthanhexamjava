package com.example.nhanvien.Service;

import com.example.nhanvien.Entity.NhanVien;

import java.util.List;

public interface NhanVienService {
    List<NhanVien> getNhanVien();
    String addNhanVien(NhanVien nhanVien);
}
