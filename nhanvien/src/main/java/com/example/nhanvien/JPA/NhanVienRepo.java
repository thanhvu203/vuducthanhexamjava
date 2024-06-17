package com.example.nhanvien.JPA;

import com.example.nhanvien.Entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NhanVienRepo extends JpaRepository<NhanVien, Integer> {
}
