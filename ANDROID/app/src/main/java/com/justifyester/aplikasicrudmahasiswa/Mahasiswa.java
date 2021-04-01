package com.justifyester.aplikasicrudmahasiswa;

public class Employee {
    private String id,nama,nim,ipk;

    public Employee() {
    }

    public Employee (String id, String nama, String nim, String ipk) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getIpk() {
        return ipk;
    }

    public void setIpk(String ipk) {
        this.ipk = ipk;
    }
}
