package fiap.com.example.challenge.controller;

import fiap.com.example.challenge.model.Address;
import fiap.com.example.challenge.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    private final ApiService apiService;

    public AddressController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/address")
    public Address getAddress(@RequestParam String cep) {
        return apiService.getAddress(cep);
    }
}
