package assingment_2;
import java.util.*;
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; 

public class Main {
	static ArrayList<addslide> slide= new ArrayList<addslide>();
	static ArrayList<addvideo> video= new ArrayList<addvideo>();
	static ArrayList<Assignment> assgn = new ArrayList<Assignment>();
	static ArrayList<quiz>  qz = new ArrayList<quiz>();
	static ArrayList<quiz>  qz1 = new ArrayList<quiz>();
	static ArrayList<quiz>  qz2 = new ArrayList<quiz>();
	static ArrayList<Assignment> assgn1 = new ArrayList<Assignment>();
	static ArrayList<Assignment> assgn2 = new ArrayList<Assignment>();
	static ArrayList<Comments> cmt = new ArrayList<Comments>();
	static ArrayList<Grading> grad =new ArrayList<Grading>();
	
	public static String string() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine().strip();
	}

	public static void main(String[] args) {
		while(true) {
		
		intro();
		
		
		Scanner scn = new Scanner(System.in);
		
		int no = scn.nextInt();
		
		
		if(no==1) {
			System.out.println("Instructors:");
			System.out.println("0 - I0");
			System.out.println("1 - I1");
			System.out.println("Choose id");
			int instr = scn.nextInt();
			if(instr ==0) {
				System.out.println("Welcome I0");
				Instructormenu();
				
				while(true) {
				
				
				int x = scn.nextInt();
				if(x==1) {
				LocalDateTime myDateObj = LocalDateTime.now(); 
				DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss"); 
				String formattedDate = myDateObj.format(myFormatObj); 
				System.out.println("1. Add Lecture Slide");
				System.out.println("2. Add Lecture Video");
				int y = scn.nextInt();
				
				if(y==1) {
					System.out.println("Enter topic of slides");
					String topicofslides = string();
					//scn.nextLine();
					System.out.println("Enter number of slides:");
					int noofslides = scn.nextInt();
					System.out.println("Enter content of slides");
					for(int i=1;i<=noofslides;i++) {
						System.out.println("Content of slide "+i);
//						//scn.nextLine();
						String contentofslide = string();
						
						
												
						
					}
					addslide slides = new addslide("I0",topicofslides,noofslides,formattedDate);
					slide.add(slides);
					
					System.out.println("Welcome I0");
					Instructormenu();
					
					
					
				}else {
//					Enter topic of video: Lecture 1
//					Enter filename of video: lecture1.mp4
					
					System.out.println("Enter topic of video:");
					String topicofvideo = string();
//					scn.nextLine();
					System.out.println("Enter filename of video:");
					String filename = string();
					
					while( !(filename.substring(filename.length()-4)).equals(".mp4")) {
						System.out.println();
						System.out.println("Please enter in a valid format");
						System.out.println();
						System.out.println("Enter filename of video:");
						filename = string();
					}
					
					addvideo av = new addvideo(topicofvideo,filename,formattedDate,"I0");
					video.add(av);
					
					System.out.println("Welcome I0");
					Instructormenu();
					
					
				}
				
				
				}else if(x==2) {
					System.out.println("1. Add Assignment\n"
							+ "2. Add Quiz");
					int choose = scn.nextInt();
					if(choose==1) {
						System.out.println("Enter problem statement:");
						String problem = string();
						//scn.nextLine();
						
						System.out.println("Enter max marks:");
						int marks = scn.nextInt();
						Assignment asgn = new Assignment(problem,marks,true,"",-1,-1,true);
						
						assgn.add(asgn);
						assgn1.add(asgn);
						assgn2.add(asgn);
						
						
						
						
					}else {
						System.out.println("Enter quiz question:");
					//	scn.next();
						String question =string();
						
						quiz test = new quiz(question,true,"",-1,-1,true);
						
						qz.add(test);
						qz1.add(test);
						qz2.add(test);
						
						
						
					}
					System.out.println("Welcome I0");
					Instructormenu();
					
					
					
				}else if(x==3) {
					for(addslide i:slide) {
						System.out.println("Title: "+i.getEnter_topic_of_slides());
						
						int content = i.getEnter_number_of_slides();
						for(int j=1;j<=content;j++) {
							System.out.println("Slide "+j+": Content "+j);
						}
						System.out.println("Number of slides: "+i.getEnter_number_of_slides());
						System.out.println("Date of upload: "+i.getTime());
						System.out.println("Uploaded by: "+i.getInstructor());
						
						
					}
					System.out.println();
					for(addvideo i:video) {
						System.out.println("Title of video:"+i.getLecturename());
						System.out.println("Video file:"+i.getVideoname());
						System.out.println("Date of upload:"+i.getTime());
						System.out.println("Uploaded by:"+i.getInstr());
						System.out.println("Welcome "+"I0");
						Studentmenu();
					}
					
					
					
					
				}else if(x==4) {
					
					
				}else if(x==5) {
					
				}
				
				
				else if(x==7) {
					for(Comments i:cmt) {
						i.welcome();
					}
					
				}else if(x==8) {
					LocalDateTime myDateObj = LocalDateTime.now(); 
					DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss"); 
					String formattedDate = myDateObj.format(myFormatObj); 
					
					System.out.println("Enter comment:");
					//scn.nextLine();
					String comment = string();
				
					
					System.out.println("Welcome I0");
					Comments comments = new Comments("I0",formattedDate,comment);
					cmt.add(comments);
					
					Instructormenu();
				}else {
					break;
				}
				
					
				 
				}	
				
			}else {
				
				
				///instructor 2
				System.out.println("Welcome I1");
				Instructormenu();
				
				while(true) {
				
				
				int x = scn.nextInt();
				if(x==1) {
				LocalDateTime myDateObj = LocalDateTime.now(); 
				DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss"); 
				String formattedDate = myDateObj.format(myFormatObj); 
				System.out.println("1. Add Lecture Slide");
				System.out.println("2. Add Lecture Video");
				int y = scn.nextInt();
				
				if(y==1) {
					System.out.println("Enter topic of slides");
					String topicofslides = string();
					//scn.nextLine();
					System.out.println("Enter number of slides:");
					int noofslides = scn.nextInt();
					System.out.println("Enter content of slides");
					for(int i=1;i<=noofslides;i++) {
						System.out.println("Content of slide "+i);
//						//scn.nextLine();
						String contentofslide = string();
						
						
												
						
					}
					addslide slides = new addslide("I0",topicofslides,noofslides,formattedDate);
					slide.add(slides);
					
					System.out.println("Welcome I1");
					Instructormenu();
					
					
					
				}else {
//					Enter topic of video: Lecture 1
//					Enter filename of video: lecture1.mp4
					
					System.out.println("Enter topic of video:");
					String topicofvideo = string();
//					scn.nextLine();
					System.out.println("Enter filename of video:");
					String filename = string();
					
					while( !(filename.substring(filename.length()-4)).equals(".mp4")) {
						System.out.println();
						System.out.println("Please enter in a valid format");
						System.out.println();
						System.out.println("Enter filename of video:");
						filename = string();
					}
					
					addvideo av = new addvideo(topicofvideo,filename,formattedDate,"I0");
					video.add(av);
					
					System.out.println("Welcome I1");
					Instructormenu();
					
					
				}
				
				
				}else if(x==2) {
					System.out.println("1. Add Assignment\n"
							+ "2. Add Quiz");
					int choose = scn.nextInt();
					if(choose==1) {
						System.out.println("Enter problem statement:");
						String problem = string();
						//scn.nextLine();
						
						System.out.println("Enter max marks:");
						int marks = scn.nextInt();
						Assignment asgn = new Assignment(problem,marks,true,"",-1,-1,true);
						
						assgn.add(asgn);
						assgn1.add(asgn);
						assgn2.add(asgn);
						
						
						
						
					}else {
						System.out.println("Enter quiz question:");
					//	scn.next();
						String question =string();
						
						quiz test = new quiz(question,true,"",-1,-1,true);
						
						qz.add(test);
						qz1.add(test);
						qz2.add(test);
						
						
						
					}
					System.out.println("Welcome I1");
					Instructormenu();
					
					
					
				}else if(x==5) {
					int k=0;
					System.out.println("List of assessments");
					for(Assignment i:assgn) {
						i.setId(k);
						
						System.out.println("ID "+i.getId()+" Assignment: "+i.getProblem()+" Max Marks: "+i.getMarks());
						k++;
					}
					for(quiz i:qz) {
						i.setId(k);
						System.out.println("ID "+i.getId()+" Question: "+i.getQuestion());
						k++;
					}
					
					
					System.out.println("Enter ID of assessment to view submissions: ");
					
					int assessment = scn.nextInt();
					System.out.println("Choose ID from these ungraded submissions");
					String assignmet="No Assignment Person found";
					for(Assignment i:assgn) {
						if(i.getId()==assessment){
							
							assignmet = i.getSubmission();
													
						}
					}
					for(Grading i:grad) {
						if(i.getSubmission()==assignmet) {
							System.out.println(i.getPerson());
						}
					}
					
					
					
					
					
					
					
					
					
					
					
				}else if(x==6){
//					List of Open Assignments:
//						ID: 0 Assignment: Assignment 1 problem Max Marks: 5
//						----------------
//						ID: 1 Question: Name a language which supports OOPS?
//						----------------
//						Enter id of assignment to close: 1
//						Welcome I1
//						{INSTRUCTOR MENU}
					
					System.out.println("List of Open Assignments:");
					for(Assignment i:assgn) {
						System.out.println("ID "+i.getId()+" Assignment: "+i.getProblem()+" Max Marks: "+i.getMarks());
						System.out.println("----------");
						
					}
					for(quiz i:qz) {
						System.out.println("ID "+i.getId()+" Question: "+i.getQuestion());
						System.out.println("----------");
					}
					
					
					System.out.println("Enter id of assignment to close:");
					int choose = scn.nextInt();
					for(Assignment i:assgn) {
						if(i.getId()== choose) {
							i.setOpen(false);
							
						}
					}
					for(quiz i:qz) {
						if(i.getId()== choose) {
							i.setOpen(false);
							
						}
					}
					
					
					
					System.out.println("Welcome I1");
					Instructormenu();
								
					
				}else if(x==4) {
					
					
				}else if(x==3) {
					for(addslide i:slide) {
						System.out.println("Title: "+i.getEnter_topic_of_slides());
						
						int content = i.getEnter_number_of_slides();
						for(int j=1;j<=content;j++) {
							System.out.println("Slide "+j+": Content "+j);
						}
						System.out.println("Number of slides: "+i.getEnter_number_of_slides());
						System.out.println("Date of upload: "+i.getTime());
						System.out.println("Uploaded by: "+i.getInstructor());
						
						
					}
					System.out.println();
					for(addvideo i:video) {
						System.out.println("Title of video:"+i.getLecturename());
						System.out.println("Video file:"+i.getVideoname());
						System.out.println("Date of upload:"+i.getTime());
						System.out.println("Uploaded by:"+i.getInstr());
						System.out.println("Welcome "+"I2");
						Studentmenu();
					}
					
					
					
					
				}else if(x==7){
					for(Comments i:cmt) {
						i.welcome();
					}
					System.out.println("Welcome I1");
					Instructormenu();
					
				} if(x==8) {
					LocalDateTime myDateObj = LocalDateTime.now(); 
					DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss"); 
					String formattedDate = myDateObj.format(myFormatObj); 
					
					System.out.println("Enter comment:");
					//scn.nextLine();
					String comment = string();
					
					Comments comments = new Comments("I1",formattedDate,comment);
					cmt.add(comments);
				
					
					System.out.println("Welcome I1");
					Instructormenu();
				}else {
					break;
				}
				
					
				 
				}	
				
				
				
			}
			
			
			
			
		}else if(no ==2) {
			
			
			String student;
			
			System.out.println("Students:\n"
					+ "0 - S0\n"
					+ "1 - S1\n"
					+ "2 - S2");
			
			System.out.println("Choose id:");
			int choose = scn.nextInt();
			if(choose ==0) {
				student ="S0";
				
			}else if(choose ==1) {
				student ="S1";
				assgn1 = assgn;
				qz1 = qz;
				for(Assignment i:assgn1) {
					i.setPending(true);
				}
				for(quiz i:qz1) {
					i.setPending(true);
				}
				assgn = assgn1;
				qz = qz1;
				
			}else {
				student ="S2";
				qz2 = qz;
				assgn2 = assgn;
				for(Assignment i:assgn2) {
					i.setPending(true);
				}
				for(quiz i:qz2) {
					i.setPending(true);
				}
				assgn = assgn2;
				qz = qz2;
				
				
				
			}
			System.out.println("Welcome "+student);
			Studentmenu();
			
			while(true) {
			int x = scn.nextInt();
			
			if(x==1) {
				for(addslide i:slide) {
					System.out.println("Title: "+i.getEnter_topic_of_slides());
					
					int content = i.getEnter_number_of_slides();
					for(int j=1;j<=content;j++) {
						System.out.println("Slide "+j+": Content "+j);
					}
					System.out.println("Number of slides: "+i.getEnter_number_of_slides());
					System.out.println("Date of upload: "+i.getTime());
					System.out.println("Uploaded by: "+i.getInstructor());
					
					
				}
				System.out.println();
				for(addvideo i:video) {
					System.out.println("Title of video:"+i.getLecturename());
					System.out.println("Video file:"+i.getVideoname());
					System.out.println("Date of upload:"+i.getTime());
					System.out.println("Uploaded by:"+i.getInstr());
					System.out.println("Welcome "+student);
					Studentmenu();
				}
				
				
				
				
			}else if(x==2) {
				int k=0;
				
				
				for(Assignment i:assgn) {
					System.out.println("ID "+k+" Assignment: "+i.getProblem()+" Max Marks: "+i.getMarks());
					k++;
				}
				System.out.println("-----------------------------------");
				
				for(quiz i:qz) {
					System.out.println("ID "+k+" Question: "+i.getQuestion());
					k++;
					
				}
				System.out.println("-----------------------------------");
				
				System.out.println("Welcome "+student);
				Studentmenu();
				
				
				
				
			}else if(x==3) {
				System.out.println("Pending assignments");
				int k=0;
				for(Assignment i:assgn) {
					
					if(i.isPending()==true) {
						i.setId(k);
						System.out.println("ID "+k+" Assignment: "+i.getProblem()+" Max Marks: "+i.getMarks());
						k++;
						
					}
				}
				for(quiz i:qz) {
					
					if(i.isPending()==true) {
						i.setId(k);
						System.out.println("ID "+k+" Question: "+i.getQuestion());
						k++;
					}
					
				}
				System.out.println("Enter ID of assessment: ");
				int assement =scn.nextInt();
				
				System.out.println("Enter filename of assignment:");
				String submitfile = string();
				while( !(submitfile.substring(submitfile.length()-4)).equals(".zip")) {
					System.out.println();
					System.out.println("Please enter in a valid format");
					System.out.println();
					System.out.println("Enter filename of assignment:");
					submitfile = string();
				}
				for(Assignment i:assgn) {
					if(i.getId()==assement) {
						i.setPending(false);
						i.setSubmission(submitfile);
					}
				}
				for(quiz i:qz) {
					if(i.getId()==assement) {
						i.setPending(false);
						i.setSubmission(submitfile);
					}
				}
				
				Grading grd = new Grading(student,submitfile);
				grad.add(grd);
				
				
				
				System.out.println("Welcome "+student);
				Studentmenu();
				
				
				
				
			}else if(x==4) {
				System.out.println("Graded submissions");
				
				for(Assignment i:assgn) {
					if(i.getGraded() > 0) {
						System.out.println("Submission:"+i.getSubmission());
						System.out.println("Marks scored:"+i.getMarks());
						System.out.println("Graded by: I1");
						
						
					}
				}
				for(quiz i:qz) {
					if(i.getGraded()>0) {
						System.out.println("Submission:"+i.getSubmission());
						System.out.println("Marks scored:"+1);
						System.out.println("Graded by: I1");
					}
					
				}
				
				
				
				System.out.println("Welcome "+student);
				Studentmenu();
				
				
			}else if(x==5) {
				for(Comments i:cmt) {
					i.welcome();
				}
				System.out.println("Welcome "+student);
				Studentmenu();
				
				
				
			}else if(x==6) {
				LocalDateTime myDateObj = LocalDateTime.now(); 
				DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss"); 
				String formattedDate = myDateObj.format(myFormatObj); 
				System.out.println("Enter comment:");
				String comment = string();
				
				Comments comments = new Comments("I1",formattedDate,comment);
				cmt.add(comments);
				
				System.out.println("Welcome "+student);
				Studentmenu();
				
				
				
			}else {
				break;
			}
			
		}
			
			
		}else {
			
			break;
			
			
			
		}
		
		
		}
		
		
			
		
		

	}
	public static void Instructormenu() {
		System.out.println("1. Add class material");
		System.out.println("2. Add assessments");
		System.out.println("3. View lecture materials");
		System.out.println("4. View assessments");
		System.out.println("5. Grade assessments");
		System.out.println("6. Close assessment");
		System.out.println("7. View comments");
		System.out.println("8. Add comments");
		System.out.println("9. Logout");
		
		
	}
	
	public static void Studentmenu() {
		System.out.println("1. View lecture materials");
		System.out.println("2. View assessments");
		System.out.println("3. Submit assessment");
		System.out.println("4. View grades");
		System.out.println("5. View comments");
		System.out.println("6. Add comments");
		System.out.println("7. Logout");
	}
	public static void intro() {
		System.out.println("Welcome to Backpack");
		System.out.println("1. Enter as instructor");
		System.out.println("2. Enter as student");
		System.out.println("3. Exit");
		
	}

}
