package assingment_1;

import java.util.*;

public class Assingment_1client {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("CoWin Portal initialized....");
		System.out.println("---------------------------------");
		System.out.println("1. Add Vaccine");
		System.out.println("2. Register Hospital");
		System.out.println("3. Register Citizen");
		System.out.println("4. Add Slot for Vaccination");
		System.out.println("5. Book Slot for Vaccination");
		System.out.println("6. List all slots for a hospital");
		System.out.println("7. Check Vaccination Status");
		System.out.println("8. Exit");
		System.out.println("---------------------------------");
		
	// INFORMATION
		ArrayList<Vaccine> vcn = new ArrayList<Vaccine>();
		ArrayList<Hospital> hospitaldata = new ArrayList<Hospital>();
		ArrayList<citizen> czn = new ArrayList<citizen>();
		ArrayList<Slot> slot = new ArrayList<Slot>();
		ArrayList<Status> status = new ArrayList<Status>();
		
		
		while(true) {
			int n = scn.nextInt();
			if(n==8) {
				System.out.println("{End of Test Case}");
				break;
			}else if( n==1) {
				
				System.out.println("Vaccine Name: ");
				String vaccinename = scn.next();
				System.out.println("Number of Doses: ");
				int noofdoses = scn.nextInt();
				int gapbetweendoses;
				if(noofdoses==2) {
					System.out.println("Gap between Doses:");
					gapbetweendoses = scn.nextInt();
					
				}else {
					gapbetweendoses = 0;
				}
				Vaccine Vac = new Vaccine(vaccinename,noofdoses,gapbetweendoses);
				Vac.display_details();
				vcn.add(Vac);
				
//				System.out.println("** "+ Vac.vcn.get(0).Vaccine_name+"**");
    			System.out.println("---------------------------------");
    			menu();
				
				
			}else if(n==2) {
				System.out.println("Hospital Name: ");
				String hospitalname = scn.next();
				
				System.out.println("PinCode: ");
				int pincode = scn.nextInt();
				int uniqueid = id();
				
				Hospital  hst = new Hospital(hospitalname,pincode,uniqueid);
				hst.display_details();
				System.out.println("---------------------------------");
    			menu();
				hospitaldata.add(hst);
				
				
				
				
				
				
				
			}else if(n==4) {
				System.out.println("Enter Hospital ID: ");
				int hospitalid = scn.nextInt();
				System.out.println("Enter number of Slots to be added: ");
				int noofslots = scn.nextInt();
				for(int i=0;i<noofslots;i++) {
					System.out.println("Enter Day Number: ");
					int daynumber = scn.nextInt();
					System.out.println("Enter Quantity: ");
					int quantity = scn.nextInt();
					System.out.println("Select Vaccine");
					for(int j=0;j<vcn.size();j++ ) {
						System.out.println(j+". "+vcn.get(j).getVaccine_name());
					}
					int select = scn.nextInt();
					String vaccine1 = vcn.get(select).getVaccine_name();
					Slot st = new Slot(hospitalid,noofslots,daynumber,quantity,vaccine1);
					
					st.displayslotdata();
					slot.add(st);
					System.out.println("---------------------------------");
	    			menu();
					
					
					
					
					
					
					
				}
				
				
			}else if(n==3) {
				System.out.println("Citizen Name: ");
				String name = scn.next();
				System.out.println("Age: ");
				int age = scn.nextInt();
				System.out.println("Unique ID: ");
				long id = scn.nextLong();
				citizen c = new citizen(name,id,age);
				
				if(age<18) {
					c.display_Citizen();
					System.out.println("Only above 18 are allowed");
					
					
				}else {
					c.display_Citizen();
					
				}
				czn.add(c);
				Status stat = new Status(id,"",0,0);
				status.add(stat);
				
				System.out.println("---------------------------------");
    			menu();
    			
			}else if(n==5) {
				System.out.println("Enter patient Unique ID");
				long patientuniqueid = scn.nextLong();
				System.out.println(" 1. Search by area");
				System.out.println(" 2. Search by Vaccine");
				System.out.println(" 3. Exit");
				System.out.println("Enter option: ");
				int x = scn.nextInt();// x is option
				int choose;
				if(x==1) {
					System.out.println("Enter PinCode");
					int pincode = scn.nextInt();
					for(int i=0;i<hospitaldata.size();i++ ) {
						if(hospitaldata.get(i).getPinCode()==pincode) {
							System.out.println(hospitaldata.get(i).getUnique_id() +" "+hospitaldata.get(i).getHospital_Name());
						}
					}
					System.out.println("Enter hospital id: ");
					int hospitalid = scn.nextInt();
					
					for(int j=0;j<slot.size();j++ ) {
						if(slot.get(j).getHospitalID()==hospitalid) {
							for(int k=0;k<slot.get(j).getNumber_of_slot_added();k++) {
								System.out.println(k+"-> Day: "+slot.get(k).getEnter_day_number()+" Available Qty:"+slot.get(k).getQuantity()+" Vaccine:"+slot.get(k).getSelect_vaccine());
							}
							break;
						}
					}
						System.out.println("Choose Slot:");
						choose = scn.nextInt();
						for(int z=0;z<czn.size();z++ ) {
							if(czn.get(z).getCitizen_Id() == patientuniqueid) {
								System.out.println(czn.get(z).getCitizen_Name()+" vaccinated with "+slot.get(choose).getSelect_vaccine());
								break;
							}
							
							
						}
						int i;
						for(i=0;i<status.size();i++ ) {
							if(status.get(i).getUniqueid()==patientuniqueid) {
								break;
							}
							
						}
						if(status.get(i).getNoofdosegiven()==0) {
							status.get(i).setNoofdosegiven(status.get(i).getNoofdosegiven()+1);
							status.get(i).setVaccine(slot.get(choose).getSelect_vaccine());
							for(Vaccine v : vcn) {
								if(v.getVaccine_name()==slot.get(choose).getSelect_vaccine()) {
									status.get(i).setNextdosedate(v.getGap_between_doses());
								}
								
							}
							
						}
						
						
						
						
						
						
						
						System.out.println("---------------------------------");
		    			menu();
						
					
					
					
				}else if(x==2) {
					
					System.out.println("Enter Vaccine name: ");
					String vaccinename = scn.next();
					for(int i=0;i<slot.size();i++ ) {
						if(slot.get(i).getSelect_vaccine()==vaccinename) {
							if(slot.get(i).getQuantity()>0) {
								System.out.print(slot.get(i).getHospitalID()+" ");
								for(Hospital j:hospitaldata) {
									if(j.getUnique_id()==slot.get(i).getHospitalID()) {
										System.out.print(j.getHospital_Name());
									}
								}
							}
						}
					}
					System.out.println("Enter Hospital id");
					int hid = scn.nextInt();
					for(Slot i:slot){
						if(i.getHospitalID()==hid) {
							System.out.println(i.getNumber_of_slot_added()+"->"+" Day: "+i.getEnter_day_number()+" Available Qty:"+i.getQuantity()+" Vaccine "+ vaccinename);
							
							
						}
					}
					System.out.println("Choose Slot:");
					int chooseslot = scn.nextInt();
					for(citizen k:czn) {
						if(k.getCitizen_Id()==patientuniqueid) {
							System.out.println(k.getCitizen_Name()+" Vacinnated with "+vaccinename);
							break;
						}
					}
					System.out.println("---------------------------------");
	    			menu();					
					
				}else {
					System.out.println("EXIT");
					
					
				}

				
				
				
			}else if(n==6) {
				System.out.println("Enter Hospital Id");
				int hid = scn.nextInt();
				
				for(int i=0;i<slot.size();i++) {
					if(slot.get(i).getHospitalID() == hid) {
						for(int j=0;j<slot.get(i).getNumber_of_slot_added();j++){
							
							System.out.println("Day: "+slot.get(j).getEnter_day_number()+" Vaccine: "+ slot.get(j).getSelect_vaccine()+" Available Qty: "+ slot.get(j).getQuantity());
							
							
						}
						break;
					}
					
					
				}
				System.out.println("---------------------------------");
    			menu();
				
			}else if(n==7) {
				System.out.println("Enter Patient ID: ");
				long patientid = scn.nextLong();
				try {
				int i;
				
				for(i=0;i<status.size();i++ ) {
					if(status.get(i).getUniqueid()==patientid) {
						break;
					}
					
				}
				if(status.get(i).getNoofdosegiven()==0) {
					System.out.println("Citizen REGISTERED");
					
				}else if(status.get(i).getNoofdosegiven()==1) {
					System.out.println("PARTIALLY VACCINATED");
					System.out.println("Vaccine Given: ");
					
					System.out.println(status.get(i).getVaccine());
					System.out.println("Number of Doses given:");
					System.out.println(status.get(i).getNoofdosegiven());
					System.out.println("Next Dose due date:");
					System.out.println(status.get(i).getNextdosedate());
					
				}else {
					System.out.println("FULLY VACCINATED");
					System.out.println("Vaccine Given: Covax");
					System.out.println("Number of Doses given: 2");
				}
				}catch(Exception e){
					System.out.println("Patient not Registered");
					
				}
				
				
				System.out.println("---------------------------------");
    			menu();
				
			}
			
			
		}
		
		

	}
	public static int id() {
		  Random r = new Random();
	        int rand_int1= r.nextInt(1000000);
	        return rand_int1;
		
	}
	public static void menu() {
		System.out.println("---------------------------------");
		System.out.println("1. Add Vaccine");
		System.out.println("2. Register Hospital");
		System.out.println("3. Register Citizen");
		System.out.println("4. Add Slot for Vaccination");
		System.out.println("5. Book Slot for Vaccination");
		System.out.println("6. List all slots for a hospital");
		System.out.println("7. Check Vaccination Status");
		System.out.println("8. Exit");
		System.out.println("---------------------------------");
		
	}

}
