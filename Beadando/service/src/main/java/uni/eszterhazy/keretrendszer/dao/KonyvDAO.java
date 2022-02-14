package uni.eszterhazy.keretrendszer.dao;

import uni.eszterhazy.keretrendszer.exceptions.KonyvAlreadyAdded;
import uni.eszterhazy.keretrendszer.exceptions.KonyvNotFound;
import uni.eszterhazy.keretrendszer.model.Fajta;
import uni.eszterhazy.keretrendszer.model.Konyv;

import java.util.Collection;

public interface KonyvDAO {
    void createKonyv(Konyv konyv) throws KonyvAlreadyAdded;
    Collection<Konyv> readAllKonyv();
    Konyv readKonyv(String id) throws KonyvNotFound;
    void updateKonyv(Konyv konyv);
    void deleteKonyv(Konyv konyv);
    Collection<Konyv> readAllKonyvOfFajta(Fajta fajta);
}
