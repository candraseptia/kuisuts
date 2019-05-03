package com.gebot.kuis;

public class konfigurasi {
    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.43.232/Android/pegawai/tambahPgw.php";
    public static final String URL_GET_ALL = "http://192.168.43.232/Android/sekolah/TampilSemua.php";
    public static final String URL_GET_EMP = "http://192.168.43.232/Android/sekolah/TampilSekolah.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.43.232/Android/sekolah/Update.php";
    public static final String URL_DELETE_EMP = "http://192.168.43.232/Android/sekolah/Delete.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_KODE = "kode_sekolah";
    public static final String KEY_EMP_NAMA = "nama_sekolah"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_AKREDITASI = "akreditasi"; //salary itu variabel untuk gajih

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_KODE = "kode_sekolah";
    public static final String TAG_NAMA = "nama_sekolah";
    public static final String TAG_AKREDITASI = "akreditasi";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";

}
