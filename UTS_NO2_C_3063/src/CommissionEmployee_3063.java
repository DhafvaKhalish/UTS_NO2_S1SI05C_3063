
public class CommissionEmployee_3063 extends Employess_3063{
    public float Komisi_3063;
    public float TotalPenjualan_3063;
    public float Totalgaji_3063;
    
    public CommissionEmployee_3063(){
        
    }
    
    public float TotalGaji_3063(){
        Totalgaji_3063 = GajiPokok_3063 + (Komisi_3063 * TotalPenjualan_3063);
        return Totalgaji_3063;
    }
    
    public void TampilData_3063(){
        System.out.println("Commission Employee");
        Tampil_3063();
        System.out.println("Total Gaji: " + Totalgaji_3063);
    }
}
