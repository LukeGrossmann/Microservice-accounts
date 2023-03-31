package vpwelltok.accounts.service.client;

import org.springframework.web.bind.annotation.RequestHeader;
import vpwelltok.accounts.model.Customer;
import vpwelltok.accounts.model.Loans;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("loans")
public interface LoansFeignClient {

	@RequestMapping(method = RequestMethod.POST, value = "myLoans", consumes = "application/json")
	List<Loans> getLoansDetails(@RequestHeader("vpwelltok-correlation-id") String correlationid, @RequestBody Customer customer);
}
