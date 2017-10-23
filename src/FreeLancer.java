public class FreeLancer extends SuperWorkers {
    private float wageRate;
    private float hoursPerDay;
    private int days;

    public FreeLancer (String name, String surname, float wageRate, int days, float hoursPerDay) {
        super.name = name;
        super.surname = surname;
        this.wageRate = wageRate;
        this.days = days;
        this.hoursPerDay = hoursPerDay;
    }

    @Override
    public float CalcSallary() {


        return (wageRate * days * hoursPerDay);
    }

    public void show() {
        System.out.println(name + " " + surname + " " + CalcSallary());
    }
}


