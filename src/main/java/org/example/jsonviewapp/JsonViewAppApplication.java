package org.example.jsonviewapp;

import org.example.jsonviewapp.model.Kullanici;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsonViewAppApplication {

  public static void main(String[] args) throws Exception {
    Kullanici kullanici = new Kullanici();
    kullanici.setAd("Sevda");
    kullanici.setSoyad("Deneme");
    kullanici.setSifre("gizliVeri123");
    kullanici.setTelefon("5555555555");
    ObjectMapper mapper = new ObjectMapper();

    // Genel Görünüm
    String genelJson = mapper.writerWithView(Kullanici.GenelGorunum.class).writeValueAsString(kullanici);
    System.out.println("Genel Görünüm:");
    System.out.println(genelJson);

    // Detayli Görünüm
    String detayliJson = mapper.writerWithView(Kullanici.DetayliGorunum.class).writeValueAsString(kullanici);
    System.out.println("Detayli Görünüm:");
    System.out.println(detayliJson);
  }

}
