package bsuir.labs.clientbankapp.controller;

import bsuir.labs.clientbankapp.model.City;
import bsuir.labs.clientbankapp.model.Client;
import bsuir.labs.clientbankapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;
    private final SexService sexService;
    private final CityService cityService;
    private final DisabilityService disabilityService;
    private final NationalityService nationalityService;
    private final MaritalStatusService maritalStatusService;

    @Autowired
    public ClientController(ClientService clientService, SexService sexService, CityService cityService, DisabilityService disabilityService, NationalityService nationalityService, MaritalStatusService maritalStatusService) {
        this.clientService = clientService;
        this.sexService = sexService;
        this.cityService = cityService;
        this.disabilityService = disabilityService;
        this.nationalityService = nationalityService;
        this.maritalStatusService = maritalStatusService;
    }

    @GetMapping("/")
    public String getAllClients() {
        return "clients/index";
    }

    @PostMapping("/")
    public String createClient(@ModelAttribute("client") Client client, final BindingResult bindingResult) {
        System.out.println(client);
        System.out.println(bindingResult);

        return "redirect:/clients/";
    }

    @GetMapping("/new")
    public String getCreateClientForm(Model model) {

        model.addAttribute("client", new Client());
        model.addAttribute("cities", cityService.getAll());
        model.addAttribute("disabilities", disabilityService.getAll());
        model.addAttribute("nationalities", nationalityService.getAll());
        model.addAttribute("maritalStatuses", maritalStatusService.getAll());

        return "clients/createForm";
    }
}
