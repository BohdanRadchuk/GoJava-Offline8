public class HourPayment extends SuperWorkers {
    private float wageRate;
    private float hoursPerDay = 8;
    private int days;

    public HourPayment(String name, String surname, float wageRate, int days) {
        super.name = name;
        super.surname = surname;
        this.wageRate = wageRate;
        this.days=days;

    }

    @Override
    public float CalcSallary() {


        return (wageRate*days*hoursPerDay);
    }

    public  void show(){
        System.out.println(name + " "+ surname+ " " + CalcSallary() );
    }
}
