/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kelompok 1 - 15.2A.01
 */
public class Kasir {

    //    Untuk Paket Makanan
    public String namaMakanan;
    public int jumlahBeliMakanan;
    public long totalHargaMakanan, hargaPaket;

    //    Untuk Paket Minuman
    public int jumlahBeliMineral, jumlahBeliTeh, jumlahBeliKopiSusu;
    public long hargaMineral, hargaTeh, hargaKopiSusu;
    public long totalHargaMinuman;

    //    Untuk Pembayaran
    public String jenisLayanan;
    public long uangBayar, uangKembali, totalPembayaranWarung, totalHargaLayanan;

    
    public Kasir() {
        // meng inisialisasi kan harga minuman saat pertama x di jalankan
        this.hargaMineral = 4000;
        this.hargaTeh = 7000;
        this.hargaKopiSusu = 8000;
    }

//    MINUMAN

    public void setJumlahBeliJenisMinuman(int jumlah, String jenis) {
        // mengubah properti jumlahBeli pada jenis yg sudah di kondisikan
        if (jenis.equalsIgnoreCase("AIR MINERAL")) {
            this.jumlahBeliMineral = jumlah;
        } else if (jenis.equalsIgnoreCase("ES TEH MANIS")) {
            this.jumlahBeliTeh = jumlah;
        } else if (jenis.equalsIgnoreCase("ES KOPI SUSU")) {
            this.jumlahBeliKopiSusu = jumlah;
        } else {
            this.jumlahBeliMineral = 0;
            this.jumlahBeliTeh = 0;
            this.jumlahBeliKopiSusu = 0;
        }
        
    }

    public long getHargaMinuman(String jenisMinuman) {
        // mengembalikan nilai properti harga jenis minuman yg sudah di kondisikan
        if (jenisMinuman.equalsIgnoreCase("AIR MINERAL")) {
            return this.hargaMineral;
        } else if (jenisMinuman.equalsIgnoreCase("ES TEH MANIS")) {
            return this.hargaTeh;
        } else if (jenisMinuman.equalsIgnoreCase("ES KOPI SUSU")) {
            return this.hargaKopiSusu;
        } else {
            return 0;
        }
    }

    public long totalHargaMinuman() {
        // total keseluruhan jenis minuman dan jumlah beli nya
        this.totalHargaMinuman = (this.hargaMineral * this.jumlahBeliMineral) + (this.hargaTeh * this.jumlahBeliTeh) + (this.jumlahBeliKopiSusu * this.hargaKopiSusu);

        // mengembalikan nilai dari property totalHargaMinuman
        return this.totalHargaMinuman;
    }

//    MAKANAN
    public void setPaket(String jenisPaket) {
        // mengubah properti namaMakanan dan hargaPaket pada jenisPaket yg sudah di kondisikan
        if (jenisPaket.equalsIgnoreCase("PAKET 1")) {
            this.namaMakanan = "Indomie Original";
            this.hargaPaket = 12000;
        } else if (jenisPaket.equalsIgnoreCase("PAKET 2")) {
            this.namaMakanan = "Indomie Telor";
            this.hargaPaket = 15000;
        } else if (jenisPaket.equalsIgnoreCase("PAKET 3")) {
            this.namaMakanan = "Indomie Telor Kornet";
            this.hargaPaket = 17000;
        } else {
            this.namaMakanan = "";
            this.hargaPaket = 0;
        }
    }

    public String getPaketNamaMakanan() {
        // mengembalikan nilai properti namaMakanan;
        return this.namaMakanan;
    }

    public long getPaketHargaMakanan() {
       // mengembalikan nilai properti hargaPaket;
        return this.hargaPaket;
    }

    public void setJumlahBeliMakanan(int jumlah) {
        // dengan nilai jumlah dari si parameter nya
        this.jumlahBeliMakanan = jumlah;
    }

    public long totalHargaMakanan() {
        // total keseluruhan harga paket dan jumlah beli nya
        this.totalHargaMakanan = this.hargaPaket * this.jumlahBeliMakanan;
        
        // mengembalikan nilai property ...
        return this.totalHargaMakanan;
    }

//    PEMBAYARAN
    public void setLayananPembayaran(String layanan) {
        // mengubah properti jenisLayanan dan totalHargaLayanan pada layanan yg sudah di kondisikan
        if (layanan.equalsIgnoreCase("DELIVERY")) {
            this.jenisLayanan = layanan;
            long totalLayanan = (this.totalHargaMakanan + this.totalHargaMinuman) * 15;

            this.totalHargaLayanan = totalLayanan / 100;
        } else {
            this.totalHargaLayanan = 0;
        }

    }

    public void resetTotalPembayaran() {
        // meriset properti ...
        this.totalHargaMinuman = 0;
        this.totalHargaMakanan = 0;
        this.totalPembayaranWarung = 0;
    }

    public long totalHargaLayanan() {
        return this.totalHargaLayanan;
    }

    public long totalPembayaran() {
        // total keseluruhan harga Makanan,Minuman dan layanan nya
        this.totalPembayaranWarung = (this.totalHargaMakanan + this.totalHargaMinuman + this.totalHargaLayanan);
        return this.totalPembayaranWarung;
    }

    public long totalKembalian(long bayar) {
        // mengembalikan total yg sudah dihitung
        long total = bayar - this.totalPembayaranWarung;
        return total;
    }
}
