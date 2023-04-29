package in.bank.accounts.repository;





import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.bank.accounts.model.Accounts;

//here we are going to store the data

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {

	Accounts getByCustomerId(int customerId);

	

	

	//Accounts findByCustomerId(int customerId);

	
}
