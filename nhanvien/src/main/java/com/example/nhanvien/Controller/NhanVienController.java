package com.example.nhanvien.Controller;

import com.example.nhanvien.Entity.NhanVien;
import com.example.nhanvien.Service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    // Endpoint để lấy danh sách nhân viên
    @GetMapping("/getAllNhanVien")
    public List<NhanVien> getNhanVien() {
        return nhanVienService.getNhanVien();
    }

    // Endpoint để thêm nhân viên
    @PostMapping("/newNhanVien")
    public String addNhanVien(@RequestBody NhanVien nhanVien) {
        return nhanVienService.addNhanVien(nhanVien);
    }
}
