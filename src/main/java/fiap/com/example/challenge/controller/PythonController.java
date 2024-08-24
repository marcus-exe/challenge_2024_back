package fiap.com.example.challenge.controller;

import fiap.com.example.challenge.service.PythonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PythonController {

    @Autowired
    private PythonService pythonService;

    @GetMapping("/run-python")
    public String runPython(@RequestParam String argument) {
        return pythonService.runPythonScript(argument);
    }
}
