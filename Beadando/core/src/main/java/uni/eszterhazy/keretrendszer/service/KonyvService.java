package uni.eszterhazy.keretrendszer.service;

import uni.eszterhazy.keretrendszer.exceptions.KonyvAlreadyAdded;
import uni.eszterhazy.keretrendszer.exceptions.KonyvNotFound;
import uni.eszterhazy.keretrendszer.model.Fajta;
import uni.eszterhazy.keretrendszer.model.Konyv;

import java.util.Collection;

public interface KonyvService {
    void addKonyv(Konyv konyv) throws KonyvAlreadyAdded;
    Collection<Konyv> getAllKonyv();
    Konyv getKonyvById(String id) throws KonyvNotFound;
    void UpdateKonyv(Konyv konyv);
    void removeKonyv(Konyv konyv);
    Collection<Konyv> readAllKonyvOfFajta(Fajta fajta);
}
