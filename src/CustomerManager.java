public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        customerDal.add();
        //business rules
//When a class uses another class, it should not make it new
//        CustomerDal customerDal = new CustomerDal();
//        customerDal.add();


    }
}
