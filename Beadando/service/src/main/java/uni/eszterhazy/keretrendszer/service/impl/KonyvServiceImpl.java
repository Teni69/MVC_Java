package uni.eszterhazy.keretrendszer.service.impl;

import uni.eszterhazy.keretrendszer.dao.KonyvDAO;
import uni.eszterhazy.keretrendszer.exceptions.KonyvAlreadyAdded;
import uni.eszterhazy.keretrendszer.exceptions.KonyvNotFound;
import uni.eszterhazy.keretrendszer.model.Fajta;
import uni.eszterhazy.keretrendszer.model.Konyv;
import uni.eszterhazy.keretrendszer.service.KonyvService;

import java.util.Collection;

public class KonyvServiceImpl implements KonyvService {
    private KonyvDAO dao;

    public KonyvServiceImpl(KonyvDAO dao) {
        this.dao = dao;
    }

    public void addKonyv(Konyv konyv) throws KonyvAlreadyAdded {
        dao.createKonyv(konyv);
    }

    public Collection<Konyv> getAllKonyv() {
        Collection<Konyv> result = dao.readAllKonyv();
        return result;
    }

    public Konyv getKonyvById(String id) throws KonyvNotFound {
        return dao.readKonyv(id);
    }

    public void UpdateKonyv(Konyv konyv) {
        dao.updateKonyv(konyv);
    }

    public void removeKonyv(Konyv konyv) {
        dao.deleteKonyv(konyv);
    }

    public Collection<Konyv> readAllKonyvOfFajta(Fajta fajta) {
        return dao.readAllKonyvOfFajta(fajta);
    }
}
