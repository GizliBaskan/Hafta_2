import Odevler.Classes.CustomerManager;
import Odevler.ClassesWithAttribute.Product;
import Odevler.ClassesWithAttribute.ProductManager;
import Odevler.Inheritance.Customer;
import Odevler.Inheritance.Employee;
import Odevler.Inheritance.EmployeeManager;
import Odevler.InheritanceDemo.AskerKrediManager;
import Odevler.InheritanceDemo.KrediUI;
import Odevler.InheritanceDemo.OgretmenKrediManager;
import Odevler.Methods;
import Odevler.ReCapDemoClasses.DortIslem;

public class Main {
    public static void main(String[] args) {
        //kodun düzenli olması için class'larla çalışıldığı için 24, 25 ve 26 es geçildi.
        Methods.sayiBulmaca();

        //ders 27 - 28
        CustomerManager customerManager = new CustomerManager(); //class'lar referans tiptir
        customerManager.addCustomer();
        customerManager.removeCustomer();
        customerManager.updateCustomer();

        //ders 29
        //değer tip (heap ile ilgisi yoktur, her şey stack'de olur)
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        System.out.println(sayi2);
        //ders 30 - recap demo ile class'larla çalışmak
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.topla(3,4);
        System.out.println(sonuc);

        //ders 31-32-33-34-35
        Product product = new Product(2, "Mause", "Kablolu mause", 300,2);
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setStockAmount(3);
        product.setPrice(5000);
        product.setName("Laptop");

        ProductManager productManager = new ProductManager();
        productManager.addProduct(product);

        //ders 36 - inheritance
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        Odevler.Inheritance.CustomerManager customerManager1 = new Odevler.Inheritance.CustomerManager();
        employeeManager.bestEmployee();

        //ders 37 - inheritance demo (poliformizm)
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new AskerKrediManager());

    }
}