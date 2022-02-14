package uni.eszterhazy.keretrendszer.model;

import org.springframework.format.annotation.DateTimeFormat;
import uni.eszterhazy.keretrendszer.exceptions.CimNemLehetUres;
import uni.eszterhazy.keretrendszer.exceptions.KevesOldalSzam;
import uni.eszterhazy.keretrendszer.exceptions.RosszKiadasiEv;

import java.time.LocalDate;
import java.util.UUID;

public class Konyv {
    private String id;
    private String cim;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate kiadas;
    private Fajta fajta;
    private int oldalSzam;

    public Konyv(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) throws CimNemLehetUres {
        if(cim.trim().length() == 0){
            throw new CimNemLehetUres();
        }
        this.cim = cim;
    }

    public LocalDate getKiadas() {
        return kiadas;
    }

    public void setKiadas(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate kiadas) throws RosszKiadasiEv {
        if(kiadas.isBefore(LocalDate.now().minusYears(300))){
           throw new RosszKiadasiEv("300 évnél régebbi kiadás: "+kiadas);
        }
        this.kiadas = kiadas;
    }

    public Fajta getFajta() {
        return fajta;
    }

    public void setFajta(Fajta fajta) {
        this.fajta = fajta;
    }

    public int getOldalSzam() {
        return oldalSzam;
    }

    public void setOldalSzam(int oldalSzam) throws KevesOldalSzam {
        if(oldalSzam <= 1){
            throw new KevesOldalSzam(oldalSzam);
        }
        this.oldalSzam = oldalSzam;
    }

    @Override
    public String toString() {
        return "Konyv{" +
                "id='" + id + '\'' +
                ", cim='" + cim + '\'' +
                ", kiadas=" + kiadas +
                ", fajta=" + fajta +
                ", oldalSzam=" + oldalSzam +
                '}';
    }
}
