package com.example.CrudDemo3.service;

import com.example.CrudDemo3.entity.Diem;
import com.example.CrudDemo3.entity.SinhVien;
import com.example.CrudDemo3.repo.SinhVienRepository;

import java.util.List;

public interface DiemService {

    public List<Diem> getDiem();

    public String saveDiem(Diem diem, long sinhvien_id);
}
