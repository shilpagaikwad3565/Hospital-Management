import java.util.Scanner;

public class Hospital {
	static String patientName,patientAddress,diagnosis,appointmentdate;	
	static int patientAge,doctorId,appointment;
	static String hospitalName = "Aayu Hospital";
	

	
	static String DrShubham()
	{
		System.out.println("Doctor Name: Shubham");
		System.out.println( "Age 		: 22");
		System.out.println("Specialisation 	: sergiarian");
		System.out.println("Experience 	: 5 years");
		System.out.println("Working Days 	: Monday to Friday");
		System.out.println("Contact No 	: 9637428406");
		return " ";
	}
	static String Drpriya()
	{
		System.out.println("Doctor Name: Priti");
		System.out.println( "Age 		: 35");
		System.out.println("Specialisation 	: womens speacialist");
		System.out.println("Experience 	: 10 years");
		System.out.println("Working Days 	: Monday to saturday");
		System.out.println("Contact No 	: 4567898990");
		return " ";
	}
	
	static String Drmayur()
	{
		System.out.println("Doctor Name: Mayur");
		System.out.println( "Age 		: 30");
		System.out.println("Specialisation 	: mens speacialist");
		System.out.println("Experience 	: 7 years");
		System.out.println("Working Days 	: Monday to Thursday");
		System.out.println("Contact No 	: 1234567890");
		return " ";
	}
	static String DrAarti()
	{
		System.out.println("Doctor Name: Aarti");
		System.out.println( "Age 		: 40");
		System.out.println("Specialisation 	: child speacialist");
		System.out.println("Experience 	: 10 years");
		System.out.println("Working Days 	: All day in week");
		System.out.println("Contact No 	: 8876543459");
		return " ";
	}
	static String patientDetails() {
		System.out.println("Patient Name : "+patientName);
		System.out.println("Patient Age : "+patientAge);
		System.out.println("patient Address :" +patientAddress);
		System.out.println("Diagnosis 	: "+diagnosis);
        return "" ;
	}
			 
		 public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		for(int i=0; ; i++) {
		System.out.println("welcome to aayu hospital");
		System.out.println("1.getDoctorDetails");
		System.out.println("2.getPatientDetails");
		System.out.println("3.generate hospitalbill");
		System.out.println("4.getpatienthistory");
		
		System.out.println("Enter you choice:");
		int patientchoice=sc.nextInt();
		
		switch(patientchoice) {
		
		case 1:
			
			System.out.println("1.Drshubham...........(sergirian)");
			System.out.println("2.Drpriya...........(womens specialist)");
			System.out.println("3.Drmayur...........(mens specialist)");
			System.out.println("4.DrAarti...........(child specialist)");

			System.out.println("Select DoctorId:");
			doctorId = sc.nextInt();
			if(doctorId==1) {
				
				System.out.println(DrShubham());
				
				System.out.println("enter appointmentdate:");
				appointmentdate=sc.next();
				System.out.println("Do you want to fix an appointment ?");
				System.out.println("Type : 1.(FOR YES) OR 2.(FOR NO)");
				appointment = sc.nextInt();
				if(appointment==1)
				{
					
					
					System.out.println("You appointment is fixed with Drshubham on date:"+appointmentdate+"Time 11:AM");
				}
				
				{
					System.out.println("*********************************************");
					break;
					
				}
				
			}
			
				else if(doctorId==2) {
					
					System.out.println(Drpriya());
					System.out.println("----------------------------------------");
					System.out.println("enter appointmentdate:");
					appointmentdate=sc.next();
					System.out.println("Do you want to fix an appointment ?");
					System.out.println("Type : 1.(FOR YES) OR 2.(FOR NO)");
					appointment = sc.nextInt();
					if(appointment==1)
					{
						
						
						System.out.println("You appointment is fixed with Drpriya on date:"+appointmentdate+"Time 1:PM");
					}
					
					{
						System.out.println("*********************************************");
						break;
					}

					
				}
         else if(doctorId==3) {
					
					System.out.println(Drmayur());
					System.out.println("---------------------------------------------------");
					System.out.println("enter appointmentdate:");
					appointmentdate=sc.next();
					System.out.println("Do you want to fix an appointment ?");
					System.out.println("Type : 1.(FOR YES) OR 2.(FOR NO)");
					appointment = sc.nextInt();
					if(appointment==1)
					{
												
						System.out.println("You appointment is fixed with Drmayur on date:"+appointmentdate+"Time 4:PM");
					}
					
					{
						System.out.println("*********************************************");
						break;
					}

					
				}
                 else if(doctorId==4) {
				
				System.out.println(DrAarti());
				
				System.out.println("-------------------------------------------");
				System.out.println("enter appointmentdate:");
				appointmentdate=sc.next();
				System.out.println("Do you want to fix an appointment ?");
				System.out.println("Type : 1.(FOR YES) OR 2.(FOR NO)");
				appointment = sc.nextInt();
				if(appointment==1)
				{
									
					System.out.println("You appointment is fixed with DrAarti on date:"+appointmentdate+" Time 7:PM");
				}
				
				{
					System.out.println("*********************************************");
					break;
				}

				
			}
			
		case 2:
			System.out.println("Enter patient name :");
			patientName=sc.next();
			System.out.println("Enter patient age");
			patientAge=sc.nextInt();
		System.out.println("Patient Address");
			patientAddress=sc.next();
			System.out.println("Diagnosis");
			diagnosis=sc.next();
			System.out.println();
			System.out.println("Patient Details :-");
			System.out.println("Patient Name 	: "+patientName);
			System.out.println("Patient Age  	: "+patientAge);
			System.out.println("Patient Address : "+patientAddress);
			System.out.println("Diagnosis    	: "+diagnosis);
			System.out.println("....................................................");
			break;
			
		case 3:
			
			 
			System.out.println("Enter Full Name Of Patient");
			patientName=sc.next();
			patientDetails();
			
			System.out.println("***** HOSPITAL BILL ***** ");
			System.out.println(hospitalName);
			
			System.out.println("1.general ward.............per day 100 rs");
			System.out.println("2.ICU.......................per day charge 500 rs");
			System.out.println("3.special room................per day charge 800 rs");
			System.out.println("4.semi-special room................per day charge 400 rs");

			
			
			System.out.println("Enter patient ward:");
			int  ward=sc.nextInt();
			  System.out.println("enter no.days in ward:");
				 int days=sc.nextInt();
				  System.out.println("operation fees:");
				int operationfees=sc.nextInt();
				System.out.println("medicine cost:");
				 int medicinecost=sc.nextInt();
				System.out.println("doctor fees:");
				int drfees=sc.nextInt();
				if(ward==1) {
					int patientbill=days*100+operationfees+medicinecost+drfees;
					System.out.println("your hospital bill is:"+patientbill);
					System.out.println("-----------------------------------------------");
					}
					 if(ward==2) {
						int  patientbill=days*500+operationfees+medicinecost+drfees;
							System.out.println("your  hospital bill is:"+patientbill);
							System.out.println("-----------------------------------------------");
						}
					 if(ward==3) {
						int  patientbill=days*800+operationfees+medicinecost+drfees;
							System.out.println("your hospital bill is:"+patientbill);
							System.out.println("-----------------------------------------------");
						}
					 if(ward==4) {
						  int patientbill=days*400+operationfees+medicinecost+drfees;
							System.out.println("your hospital bill is:"+patientbill);
							System.out.println("-----------------------------------------------");
						}
                break;
       case 4:
			System.out.println("Enter Patient Name:");
			patientName=sc.next();
			patientDetails();
			if(doctorId==1)
			{
				System.out.println("Conserned Doctor : Dr.shubham");
			}
			else if(doctorId==2)
			{
				System.out.println("Conserned Doctor : Dr.priya");
			}
			else if(doctorId==3)
			{
				System.out.println("Conserned Doctor : Dr.mayur");
			}
			else if(doctorId==4)
			{
				System.out.println("Conserned Doctor : Dr.Aarti");
			}
			

				System.out.println("------------------------------------------------");					
			break;
			}
		}

		}
		
	}



