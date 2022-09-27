package Odevler.Inheritance;

public class EmployeeManager extends PersonManager{
    public void list() {
        System.out.println("Müşteri listelendi");
    }

    public void add() {
        System.out.println("Müşteri eklendi");
    }

    public void bestEmployee() {
        System.out.println("Ayın elemanı getirildi");
    }
}
