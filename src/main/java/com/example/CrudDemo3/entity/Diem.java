package com.example.CrudDemo3.entity;

import javax.persistence.*;

@Entity
@Table(name = "diem")
public class Diem {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    // @Column(name = "sv_id")
    // private long sv_id;

    @Column(name = "hocKy")
    private Integer hocKy;

    @Column(name = "nam")
    private Integer nam;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "sinhvien_id")
    SinhVien sinhvien;


    // @OneToOne (mappedBy = "sinhvien")
    // Diem diem;



    @Column(name = "diem_toan")
    private float diem_toan;

    @Column(name = "diem_anh")
    private float diem_anh;

    @Column(name = "diem_van")
    private float diem_van;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SinhVien getSinhvien() {
        return sinhvien;
    }

    public void setSinhvien(SinhVien sinhvien) {
        this.sinhvien = sinhvien;
    }

    public float getDiem_toan() {
        return diem_toan;
    }

    public void setDiem_toan(float diem_toan) {
        this.diem_toan = diem_toan;
    }

    public float getDiem_anh() {
        return diem_anh;
    }

    public void setDiem_anh(float diem_anh) {
        this.diem_anh = diem_anh;
    }

    public float getDiem_van() {
        return diem_van;
    }

    public void setDiem_van(float diem_van) {
        this.diem_van = diem_van;
    }

    public Integer getHocKy() {
        return hocKy;
    }

    public void setHocKy(Integer hocKy) {
        this.hocKy = hocKy;
    }

    public Integer getNam() {
        return nam;
    }

    public void setNam(Integer nam) {
        this.nam = nam;
    }
}
