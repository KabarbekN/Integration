package kz.logitex.integration.controller;

import feign.FeignException;
import kz.logitex.integration.client.IntegrationOneCClient;
import kz.logitex.integration.model.onec.request.RequestEmployee;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final IntegrationOneCClient integrationOneCClient;

    @PostMapping("/processRequest")
    public ResponseEntity<?> processRequest(@RequestBody RequestEmployee requestEmployee){
        String bin = requestEmployee.getBin();
        String iin = requestEmployee.getIin();

        System.out.println(bin);
        System.out.println(iin);
        try {
            System.out.println(integrationOneCClient.getEmployeeByIIN(Long.valueOf(iin)));
        } catch (FeignException ex){
            ex.printStackTrace();
        }
        return ResponseEntity.ok(bin +  " " + iin);
    }

}
