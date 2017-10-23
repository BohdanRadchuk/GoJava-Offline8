public class ConstantPayment extends SuperWorkers {
    private float constantSalary;

    public ConstantPayment(String name, String surname, float constantSalary) {
        super.name = name;
        super.surname = surname;
        this.constantSalary =constantSalary;

    }

    @Override
    public float CalcSallary() {

        return constantSalary ;
    }
    public  void show(){
        System.out.println(name + " "+ surname+ " " + CalcSallary() );
    }
}
