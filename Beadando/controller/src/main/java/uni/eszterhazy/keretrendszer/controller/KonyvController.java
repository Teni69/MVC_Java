package uni.eszterhazy.keretrendszer.controller;

import org.hibernate.type.EnumType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uni.eszterhazy.keretrendszer.exceptions.KonyvAlreadyAdded;
import uni.eszterhazy.keretrendszer.exceptions.KonyvNotFound;
import uni.eszterhazy.keretrendszer.model.Fajta;
import uni.eszterhazy.keretrendszer.model.Konyv;
import uni.eszterhazy.keretrendszer.service.KonyvService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KonyvController {
    @Autowired
    @Qualifier("konyvService")
    KonyvService service;

    @ModelAttribute(value = "konyv")
    public Konyv create(){
        return new Konyv();
    }

    @GetMapping(value = "/konyvek")
    public String getKonyvek(Model model){
        model.addAttribute("konyvek", service.getAllKonyv());
        return "konyvList";
    }

    @GetMapping(value = "/konyv/{id}")
    public String getKonyvById(@PathVariable String id, Model model) throws KonyvNotFound {
        model.addAttribute("konyv", service.getKonyvById(id));
        return "konyvbyid";
    }

    @GetMapping(value= "/konyvek/{fajta}")
    public String getKonyvByFajta(@PathVariable Fajta fajta, Model model) {
        model.addAttribute("konyvek", service.readAllKonyvOfFajta(fajta));
        return "konyvbyfajta";
    }

    @GetMapping(value = "addKonyv")
    public String addKonyvForm(Model model){
        model.addAttribute("fajtak", Fajta.values());
        return "konyvForm";
    }

    @PostMapping(value = "addKonyv")
    public String addKonyv(@ModelAttribute("konyv") Konyv konyv, Model model) throws KonyvAlreadyAdded {
        service.addKonyv(konyv);
        return "konyvList";
    }

    @RequestMapping(value = "/konyv/{id}/delete", method = RequestMethod.GET)
    public String delete(@PathVariable String id, @ModelAttribute("konyv") Konyv konyv, Model model) {
        service.removeKonyv(konyv);
        return "konyvList";
    }


}
