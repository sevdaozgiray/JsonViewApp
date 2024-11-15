package org.example.jsonviewapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
/**
 * @Author Sevda Ozgiray Bozkurt
 * @create 15.11.2024 11:25
 */
public class Kullanici {
  public interface GenelGorunum {}
  public interface DetayliGorunum extends GenelGorunum {}

/*  public interface GenelGorunum {}
  public interface DetayliGorunum {}*/

  @JsonView(GenelGorunum.class)
  private String ad;

  @JsonView(GenelGorunum.class)
  private String soyad;

  //@JsonIgnore
  @JsonView(DetayliGorunum.class)
  private String sifre;

  @JsonView(DetayliGorunum.class)
  private String telefon;

  // Getter ve Setter
  public String getAd() {
    return ad;
  }

  public void setAd(String ad) {
    this.ad = ad;
  }

  public String getSoyad() {
    return soyad;
  }

  public void setSoyad(String soyad) {
    this.soyad = soyad;
  }

  public String getSifre() {
    return sifre;
  }

  public void setSifre(String sifre) {
    this.sifre = sifre;
  }

  public String getTelefon() {
    return telefon;
  }

  public void setTelefon(String telefon) {
    this.telefon = telefon;
  }
}
