
public class ProjectPlanner_3063 extends Employess_3063{
    public float Komisi_3063;
    public float TotalHslProyek_3063;
    public double Totalgaji_3063;
    
    public ProjectPlanner_3063(){
        
    }
            
    public double TotalGaji_3063(){
        Totalgaji_3063 = GajiPokok_3063 + (Komisi_3063 * TotalHslProyek_3063) - (GajiPokok_3063 *5/100);
        return Totalgaji_3063;
    }
    
    public void TampilData_3063(){
        System.out.println("Project Plannner");
        Tampil_3063();
        System.out.println("Total Gaji: " + Totalgaji_3063);
    }
}
