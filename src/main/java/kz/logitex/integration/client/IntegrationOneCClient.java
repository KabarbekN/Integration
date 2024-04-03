package kz.logitex.integration.client;


import kz.logitex.integration.model.api.response.EmployeeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "integration1cClient", url = "${app.integration-1c-client}")
public interface IntegrationOneCClient {
    @RequestMapping(method = RequestMethod.GET, value = "/afm_integration/employee/{iin}", produces = "application/json")
    Object getEmployeeByIIN(@PathVariable("iin") Long iin);
}
