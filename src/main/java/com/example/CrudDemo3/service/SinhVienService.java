package com.example.CrudDemo3.service;

import com.example.CrudDemo3.entity.SinhVien;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SinhVienService {

    public List<SinhVien> getSV();

    public String saveSV(SinhVien sv);

    public String updateById(long id,SinhVien sv);

    public String deleteById(long id);

}
