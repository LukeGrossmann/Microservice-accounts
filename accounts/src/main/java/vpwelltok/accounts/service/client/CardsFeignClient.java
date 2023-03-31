package vpwelltok.accounts.service.client;

import org.springframework.web.bind.annotation.RequestHeader;
import vpwelltok.accounts.model.Cards;
import vpwelltok.accounts.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("cards")
public interface CardsFeignClient {

	@RequestMapping(method = RequestMethod.POST, value = "myCards", consumes = "application/json")
	List<Cards> getCardDetails(@RequestHeader("vpwelltok-correlation-id") String correlationid, @RequestBody Customer customer);
}
