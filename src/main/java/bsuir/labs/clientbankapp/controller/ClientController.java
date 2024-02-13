package bsuir.labs.clientbankapp.controller;

import bsuir.labs.clientbankapp.model.*;
import bsuir.labs.clientbankapp.service.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    public String getAllClients(Model model) {
        var clients = clientService.getAll();
        model.addAttribute("clients", clients);

        return "clients/index";
    }

    @PostMapping("/")
    public String createClient(@ModelAttribute("client") Client client, final BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getAllErrors());
            return "clients/createForm";
        }

        clientService.saveClient(client);
        return "redirect:/clients/";
    }

    @PutMapping("/{id}")
    public String updateClient(@Valid @ModelAttribute("client") Client client, @PathVariable("id") int id, final BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getAllErrors());
            return "clients/updateForm";
        }

        clientService.updateClient(client, id);
        return "redirect:/clients/";
    }

    @GetMapping("/new")
    public String getCreateClientForm(Model model) {
        model.addAttribute("client", new Client());

        return "clients/createForm";
    }

    @GetMapping("/{id}/edit")
    public String getUpdateClientForm(@PathVariable int id, Model model) {
        var client = clientService.getById(id);
        if (client.isEmpty()) {
            return "error";
        }

        model.addAttribute("client", client.get());
        return "clients/updateForm";
    }

    @GetMapping("{id}")
    public String getClientDetailsPage(@PathVariable int id, Model model) {
        var client = clientService.getById(id);
        if (client.isEmpty()) {
            return "error";
        }

        model.addAttribute("client", client.get());

        return "clients/details";
    }

    @ModelAttribute("cities")
    public List<City> getCities() {
        return cityService.getAll();
    }

    @ModelAttribute("disabilities")
    public List<Disability> getDisabilities() {
        return disabilityService.getAll();
    }

    @ModelAttribute("nationalities")
    public List<Nationality> getNationalities() {
        return nationalityService.getAll();
    }

    @ModelAttribute("maritalStatuses")
    public List<MaritalStatus> getMaritalStatuses() {
        return maritalStatusService.getAll();
    }
}
