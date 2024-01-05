public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        //Now I add Mysql or Oracle here and I manage the system from 1 place.
        customerManager.add();
        //The system worked like this, 1 month later, Mysql support came to the system.

    }
}