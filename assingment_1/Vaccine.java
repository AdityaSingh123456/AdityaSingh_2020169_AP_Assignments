package assingment_1;
import java.util.*;



class Vaccine {
	
	private String Vaccine_name;
	private int no_of_doses;
	private int gap_between_doses ;
	
	
	
	
	public Vaccine(String Vaccine_name,int no_of_doses,int gap_between_doses) {
		this.Vaccine_name = Vaccine_name;
		this.no_of_doses = no_of_doses;
		this.gap_between_doses = gap_between_doses;
		
		
	}


	public String getVaccine_name() {
		return Vaccine_name;
	}

	public void setVaccine_name(String vaccine_name) {
		Vaccine_name = vaccine_name;
	}

	public int getNo_of_doses() {
		return no_of_doses;
	}

	public void setNo_of_doses(int no_of_doses) {
		this.no_of_doses = no_of_doses;
	}

	public int getGap_between_doses() {
		return gap_between_doses;
	}

	public void setGap_between_doses(int gap_between_doses) {
		this.gap_between_doses = gap_between_doses;
	}
	
	public void display_details() {
		System.out.println("Vaccine name: "+this.Vaccine_name+", Number of Doses: "+this.no_of_doses+", Gap Between Doses: "+this.gap_between_doses);
		
	}
//	public void addvaccinedata(Vaccine v) {
//		this.vcn.add(v);
//	}
//	public void displayvcn() {
//		int x=0;
//		for(Vaccine i: vcn) {
//			System.out.println(x +". "+i.Vaccine_name);
//			x++;
//			
//		}
	}



class Hospital{
	 
	   private  String Hospital_Name;
	   private int PinCode;
	   private int Unique_id;
	   
	   public Hospital(String Hospital_Name,int PinCode,int Unique_id) {
		   this.Hospital_Name = Hospital_Name;
		   this.PinCode = PinCode;
		   this.Unique_id = Unique_id;
	   }
	   
	public String getHospital_Name() {
		return Hospital_Name;
	}
	public int getUnique_id() {
		return Unique_id;
	}

	public void setUnique_id(int unique_id) {
		Unique_id = unique_id;
	}

	public void setHospital_Name(String hospital_Name) {
		Hospital_Name = hospital_Name;
	}
	public int getPinCode() {
		return PinCode;
	}
	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}
	public void display_details() {
		System.out.println("Hospital Name: "+this.Hospital_Name+", PinCode: "+this.PinCode+", Unique ID: "+this.Unique_id);
		
	}
	
	   
	 
	
}

class Slot {
	
	private int HospitalID;
	
	private int Number_of_slot_added;
	private int Enter_day_number;
	private int Quantity;
	private String Select_vaccine;
	
	public Slot( int HospitalID,int Number_of_slot_added,int Enter_day_number,int Quantity, String Select_vaccine) {
		this.HospitalID = HospitalID;
		this.Number_of_slot_added = Number_of_slot_added;
		this.Quantity = Quantity;
		this.Select_vaccine = Select_vaccine;
		this.Enter_day_number = Enter_day_number;
	}
	

	public int getHospitalID() {
		return HospitalID;
	}

	public void setHospitalID(int hospitalID) {
		HospitalID = hospitalID;
	}

	public int getNumber_of_slot_added() {
		return Number_of_slot_added;
	}

	public void setNumber_of_slot_added(int number_of_slot_added) {
		Number_of_slot_added = number_of_slot_added;
	}

	public int getEnter_day_number() {
		return Enter_day_number;
	}

	public void setEnter_day_number(int enter_day_number) {
		Enter_day_number = enter_day_number;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getSelect_vaccine() {
		return Select_vaccine;
	}

	public void setSelect_vaccine(String select_vaccine) {
		Select_vaccine = select_vaccine;
	}
	public void displayslotdata() {
		System.out.println("Slot added by Hospital "+this.HospitalID +" for Day: "+this.Enter_day_number+", Available Quantity: "+ this.Quantity+" of Vaccine "+ this.Select_vaccine);
	}
	
	
	
	
	
	
}

class citizen{
	
	ArrayList<citizen> czn = new ArrayList<citizen>();
	private String Citizen_Name;
	private Long Citizen_Id;
	private int Citizen_Age;
	
	public citizen(String Citizen_Name,Long Citizen_Id,int Citizen_Age) {
		this.Citizen_Age= Citizen_Age;
		this.Citizen_Id = Citizen_Id;
		this.Citizen_Name = Citizen_Name;
				
	}
	public String getCitizen_Name() {
		return Citizen_Name;
	}
	public void setCitizen_Name(String citizen_Name) {
		Citizen_Name = citizen_Name;
	}
	public Long getCitizen_Id() {
		return Citizen_Id;
	}
	public void setCitizen_Id(Long citizen_Id) {
		Citizen_Id = citizen_Id;
	}
	public int getCitizen_Age() {
		return Citizen_Age;
	}
	public void setCitizen_Age(int citizen_Age) {
		Citizen_Age = citizen_Age;
	}
	public void display_Citizen() {
		System.out.println("Citizen Name: "+this.Citizen_Name+", Age: "+this.Citizen_Age+", Unique ID: "+this.Citizen_Id);
	}
	
	
	
}
class Status{
	private long uniqueid;
	private String vaccine ;
	private int noofdosegiven;
	private int nextdosedate;
	
	public Status(long uniqueid,String vaccine,int noofdosegiven,int nextdosedate) {
		this.uniqueid = uniqueid;
		this.vaccine = vaccine;
		this.noofdosegiven = noofdosegiven;
		this.nextdosedate = nextdosedate;
	}

	public long getUniqueid() {
		return uniqueid;
	}

	public void setUniqueid(long uniqueid) {
		this.uniqueid = uniqueid;
	}

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	public int getNoofdosegiven() {
		return noofdosegiven;
	}

	public void setNoofdosegiven(int noofdosegiven) {
		this.noofdosegiven = noofdosegiven;
	}

	public int getNextdosedate() {
		return nextdosedate;
	}

	public void setNextdosedate(int nextdosedate) {
		this.nextdosedate = nextdosedate;
	}
	
	
}

