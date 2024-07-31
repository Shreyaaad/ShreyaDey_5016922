package DependencyInjectionExample;

public class DependencyInjectionDemo {
    public static void main(String[] args) {
     
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        
        CustomerService customerService = new CustomerService(customerRepository);
        
        String customerDetails = customerService.getCustomerDetails("1234");
        System.out.println(customerDetails);
    }
}

