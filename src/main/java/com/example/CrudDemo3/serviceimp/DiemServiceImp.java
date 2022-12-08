package com.example.CrudDemo3.serviceimp;

import com.example.CrudDemo3.entity.Diem;
import com.example.CrudDemo3.entity.SinhVien;
import com.example.CrudDemo3.repo.DiemRepository;
import com.example.CrudDemo3.repo.SinhVienRepository;
import com.example.CrudDemo3.service.DiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiemServiceImp implements DiemService {

    @Autowired
    private DiemRepository repo;

    @Autowired
    public SinhVienRepository repos;


    @Override
    public List<Diem> getDiem() {
        return repo.findAll();
    }

    @Override
    public String saveDiem(Diem diem, long sinhvien_id) {

        SinhVien sv = repos.findById(sinhvien_id).get();

        if(repos.findById(sinhvien_id).equals("")){
            return "Sinh vien ko tim thay";


        }

        diem.setSinhvien(sv);

        repo.save(diem);
        return "Saved";
    }
}
