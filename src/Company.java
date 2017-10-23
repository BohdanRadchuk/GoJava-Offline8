import java.util.ArrayList;

public class Company {
    private ArrayList <SuperWorkers> superWorkers= new ArrayList<>();


    public  void AddEmploye(SuperWorkers employe){

        this.superWorkers.add(employe);
    }
    public float SalaryCost(){
        float totalSalary=0;
        for (int i = 0; i<superWorkers.size(); i++)
        totalSalary = totalSalary +superWorkers.get(i).CalcSallary();

        return totalSalary;
    }
    public void show(){
        for (int i = 0; i <superWorkers.size();i++)
            superWorkers.get(i).show();

    }
    public void  SortMax(){
        for (int i = 0; i <superWorkers.size()-1; i++){
            for (int j = 0; j<superWorkers.size()-1; j ++){
                if (superWorkers.get(j).CalcSallary()<superWorkers.get(j+1).CalcSallary()){
                    SuperWorkers temp = superWorkers.get(j);
                    superWorkers.set(j,superWorkers.get(j+1));
                    superWorkers.set(j+1, temp);
                }
            }
        }

    }
}
