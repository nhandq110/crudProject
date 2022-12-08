package com.example.CrudDemo3.entity;

import javax.persistence.*;

@Entity
@Table(name = "sinhvien")
public class SinhVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;


    @Column(name = "ten")
    private String ten;

    @Column(name = "namsinh")
    private Integer namSinh;

    @Column(name = "lop")
    private String lop;

    @Column(name = "quequan")
    private String queQuan;

    //@OneToOne (mappedBy = "sinhvien")
    //Diem diem;




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }


}