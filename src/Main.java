public class Main {
    public static void main(String[] args) {


        Company company = new Company();
        ConstantPayment constantEmploye1 = new ConstantPayment("Ivan","Ivanov",1000);
        HourPayment hourEmploye1 = new HourPayment("Nasd","Surs",500,10);
        FreeLancer freeLancEmpl1 = new FreeLancer("FreeName", "FreeSurn", 600,10,5.6f);

        company.AddEmploye(constantEmploye1);
        company.AddEmploye(hourEmploye1);
        company.AddEmploye(freeLancEmpl1);
        company.AddEmploye(constantEmploye1);
        company.AddEmploye(hourEmploye1);
        company.AddEmploye(freeLancEmpl1);
        System.out.println(company.SalaryCost());

        company.show();
        System.out.println();
        company.SortMax();
        company.show();
    }
}
