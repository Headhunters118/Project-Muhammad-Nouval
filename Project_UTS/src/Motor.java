
import java.text.NumberFormat;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad Nouval
 */
public class Motor {
    
    public String merkMotor, jenisMotor;
    public long hrgMotor, totalBayar;
    double diskon;
    
    public String formatRupiah(double number) {
        Locale localeID = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeID);
        return numberFormat.format(number);
    }

    public void setMerkMotor(String merkMotor) {
        this.merkMotor = merkMotor;
    }
    
    public String totalDiskon() {
    double totalDiskon;
    if(jenisMotor.equalsIgnoreCase("BEBEK")){
    totalDiskon= this.hrgMotor * 0.05;
    this.diskon= totalDiskon;
    return formatRupiah(totalDiskon);
    }else if (jenisMotor.equalsIgnoreCase("MATIC")) {
    totalDiskon= this.hrgMotor*0.03;
    this.diskon=totalDiskon;
    return formatRupiah(totalDiskon);
    }else if (jenisMotor.equalsIgnoreCase("SPORT")) {
    totalDiskon = this.hrgMotor* 0.01;
    this.diskon = totalDiskon;
    return formatRupiah(totalDiskon);
    }
        return "";
        }
    
    public String totalBayar() {
        double total = this.hrgMotor - this.diskon;
        return formatRupiah(total);
        
    }


    public String setJenisMotor(String jenisMotor) {
       if(this.merkMotor.equalsIgnoreCase("HONDA") && jenisMotor.equalsIgnoreCase("BEBEK")){
            this.hrgMotor= 10000000;
            this.jenisMotor = jenisMotor;
            return formatRupiah(10000000);
        }else if (this.merkMotor.equalsIgnoreCase("HONDA") && jenisMotor.equalsIgnoreCase("MATIC")) {
            this.hrgMotor=13000000;
            this.jenisMotor=jenisMotor;
            return formatRupiah(13000000);
       }else if (this.merkMotor.equalsIgnoreCase("HONDA")&& jenisMotor.equalsIgnoreCase("SPORT")) {
            this.hrgMotor = 16000000;
            this.jenisMotor= jenisMotor;
            return formatRupiah(16000000);
       }else if (this.merkMotor.equalsIgnoreCase("YAMAHA")&& jenisMotor.equalsIgnoreCase("BEBEK")) {
            this.hrgMotor= 12000000;
            this.jenisMotor = jenisMotor;
            return formatRupiah (12000000);
       }
        return "";
    }
   
    
}


