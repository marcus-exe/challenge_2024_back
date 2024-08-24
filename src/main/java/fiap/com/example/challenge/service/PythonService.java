package fiap.com.example.challenge.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class PythonService {

    public String runPythonScript(String argument) {
        StringBuilder output = new StringBuilder();

        try {
            // Build the command to execute the Python script
            String pythonPath = "/usr/bin/python3";
            String scriptPath = "src/main/java/fiap/com/example/challenge/python/example.py";


            //String[] command = {"python3", "example.py", argument};

            // Create a ProcessBuilder instance
            ProcessBuilder processBuilder = new ProcessBuilder(pythonPath, scriptPath, argument);

            // Start the process
            Process process = processBuilder.start();

            // Read the output from the Python script
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    output.append(line).append("\n");
                }
            }

            // Wait for the process to complete
            int exitCode = process.waitFor();
            System.out.println("Python script exited with code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return output.toString();
    }
}
