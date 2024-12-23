package city.ahrensburg.uebung.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.util.List;

import city.ahrensburg.uebung.Repository.Persondata;
import city.ahrensburg.uebung.model.Person;


@Controller
public class Home {
        @Autowired
        private Persondata persondata;
        @GetMapping("/")
        public String index(Model model) {
            List<Person> persons = persondata.findAll();
            model.addAttribute("persons", persons);
            return "index"; // Name der View-Datei (index.html)
        }
        @GetMapping("/formular")
        public String formular() {
            return "formular";
        }
         @PostMapping("/addPerson")
    public String addPerson(@RequestParam String name) {
        Person person = new Person();
        person.setName(name);
        persondata.save(person);
        return "redirect:/"; // Nach dem Hinzufügen zur Startseite umleiten
    }
    }
    
