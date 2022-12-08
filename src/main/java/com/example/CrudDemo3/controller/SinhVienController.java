package com.example.CrudDemo3.controller;

import com.example.CrudDemo3.entity.SinhVien;
import com.example.CrudDemo3.serviceimp.SinhVienServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SinhVienController {
    @Autowired
    public SinhVienServiceImp serviceImp;

    @GetMapping(value = "/")
    public String getPage(){
        return ("Welcome");
    }

    @GetMapping(value = "/sinhvien")
    public List<SinhVien> getSV(){
        return serviceImp.getSV();
    }

    @PostMapping(value = "/save")
    public ResponseEntity<String> saveSV(@RequestBody SinhVien sv){
        String reply = serviceImp.saveSV(sv);
        return new ResponseEntity<String>(reply,HttpStatus.OK);

    }

    @PutMapping(value ="/update/{id}")
    public ResponseEntity<String> updateById(@PathVariable long id, @RequestBody SinhVien sv){
        String reply = serviceImp.updateById(id,sv);
        return new ResponseEntity<String>(reply,HttpStatus.OK);
    }

    @DeleteMapping(value ="/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable long id){
        String reply = serviceImp.deleteById(id);
        return new ResponseEntity<String>(reply,HttpStatus.OK);
    }


}
