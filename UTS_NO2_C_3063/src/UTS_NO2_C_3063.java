
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class UTS_NO2_C_3063 {

    public static void main(String[] args) {
        SalariedEmployee_3063 se_3063 = new SalariedEmployee_3063();
        CommissionEmployee_3063 ce_3063 = new CommissionEmployee_3063();
        ProjectPlanner_3063 pp_3063 = new ProjectPlanner_3063();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            se_3063.Nama_3063 = br.readLine();
            System.out.print("NIP: ");
            se_3063.NIP_3063 = br.readLine();
            System.out.print("Gaji Pokok: ");
            se_3063.GajiPokok_3063 = Float.parseFloat(br.readLine());
            se_3063.TampilData_3063();
            
            System.out.print("Nama: ");
            ce_3063.Nama_3063 = br.readLine();
            System.out.print("NIP: ");
            ce_3063.NIP_3063 = br.readLine();
            System.out.print("GajiPokok: ");
            ce_3063.GajiPokok_3063 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            ce_3063.Komisi_3063 = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan: ");
            ce_3063.TotalPenjualan_3063 = Float.parseFloat(br.readLine());
            ce_3063.TotalGaji_3063();
            ce_3063.TampilData_3063();
            
            System.out.print("Nama: ");
            pp_3063.Nama_3063 = br.readLine();
            System.out.print("NIP: ");
            pp_3063.NIP_3063 = br.readLine();
            System.out.print("Gaji Pokok: ");
            pp_3063.GajiPokok_3063 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            pp_3063.Komisi_3063 = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            pp_3063.TotalHslProyek_3063 = Float.parseFloat(br.readLine());
            pp_3063.TotalGaji_3063();
            pp_3063.TampilData_3063();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
