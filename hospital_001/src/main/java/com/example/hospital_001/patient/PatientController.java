package com.example.hospital_001.patient;


import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/patients" )

public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {

        this.patientService = patientService;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Patient> listpatient = patientService.listAll();
        model.addAttribute("listpatient", listpatient);
        System.out.print("Get / ");
        return "index";
    }

    @GetMapping("/new")
    public String add(@NotNull Model model) {

        model.addAttribute("patient", new Patient());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePatient(@ModelAttribute("patient") Patient patient) {
        patientService.save(patient);
        return "redirect:/";
    }

    @RequestMapping("/update/{id}")
    public ModelAndView showEditPatientPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Patient ptd = patientService.get(id);
        mav.addObject("patient", ptd);
        return mav;

    }

}
