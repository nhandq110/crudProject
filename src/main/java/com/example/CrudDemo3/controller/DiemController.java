package com.example.CrudDemo3.controller;

import com.example.CrudDemo3.entity.Diem;
import com.example.CrudDemo3.serviceimp.DiemServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiemController {



    @Autowired
    DiemServiceImp serviceImp;

    @GetMapping(value = "/diem")
    public List<Diem> getDiem(){

        return serviceImp.getDiem();
    }

    @PostMapping(value = "/saveDiem/{sinhvien_id}")
    public ResponseEntity<String>saveDiem(@RequestBody Diem diem, @PathVariable long sinhvien_id){


        String reply = serviceImp.saveDiem(diem,sinhvien_id);
        return new ResponseEntity<String>(reply, HttpStatus.OK);


    }


}
