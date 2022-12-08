package com.example.CrudDemo3.serviceimp;

import com.example.CrudDemo3.entity.SinhVien;
import com.example.CrudDemo3.repo.SinhVienRepository;
import com.example.CrudDemo3.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class SinhVienServiceImp implements SinhVienService {

    @Autowired
    private SinhVienRepository repo;

    @Override
    public List<SinhVien> getSV() {

        return repo.findAll();
    }

    @Override
    public String saveSV( SinhVien sv) {
        repo.save(sv);
        return "Saved";
    }

    @Override
    public String updateById(long id, SinhVien sv) {

        SinhVien sinhVienUpdated = repo.findById(id).get();

        sinhVienUpdated.setTen(sv.getTen());
        sinhVienUpdated.setNamSinh(sv.getNamSinh());
        sinhVienUpdated.setLop(sv.getLop());
        sinhVienUpdated.setQueQuan(sv.getQueQuan());

        repo.save(sinhVienUpdated);

        return "Updated";
    }

    @Override
    public String deleteById( long id) {
        repo.deleteById(id);

        return "Deleted";
    }
}
