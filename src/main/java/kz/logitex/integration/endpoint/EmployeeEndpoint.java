package kz.logitex.integration.endpoint;


import kz.logitex.integration.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@RequiredArgsConstructor
public class EmployeeEndpoint {

    private final EmployeeService employeeService;

    @PayloadRoot(namespace = "", localPart = "getEmployeeRequest")
    @ResponsePayload
    public void getEmployee(){

    }
}
