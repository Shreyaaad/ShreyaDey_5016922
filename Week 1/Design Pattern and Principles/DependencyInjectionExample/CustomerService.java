package DependencyInjectionExample;

public class CustomerService {
    private final CustomerRepository customerRepository;

   
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerDetails(String id) {
        return customerRepository.findCustomerById(id);
    }
}

