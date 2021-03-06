package Factories;

import Domain.Customer;
import Domain.CustomerAddress;
import Domain.PersonalInformation;

/**
 * Created by AbelN on 15/04/2016.
 */
public class CustomerFactory {

    public static Customer createCustomer(int credits, CustomerAddress customerAddress, PersonalInformation personalInformation)
    {
        return new Customer.Builder(credits).CustomerAddress(customerAddress).PersonalInformation(personalInformation).build();
    }
}
