package assingment_2;

class Instructor {
	
	   private String instr;
	   
	   public Instructor(String instr) {
		   this.instr = instr;	   
	   }
	   
	   
}
class addslide{
	private String instructor;
	private String Enter_topic_of_slides ;
	private int Enter_number_of_slides ;
	private String time;
	
	public addslide(String instructor,String Enter_topic_of_slides,int Enter_number_of_slides,String time) {
		this.instructor = instructor;
		this.Enter_number_of_slides = Enter_number_of_slides;
		this.Enter_topic_of_slides = Enter_topic_of_slides;
		this.time = time;
	}
	
	
	
	


	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getEnter_topic_of_slides() {
		return Enter_topic_of_slides;
	}
	public void setEnter_topic_of_slides(String enter_topic_of_slides) {
		Enter_topic_of_slides = enter_topic_of_slides;
	}
	public int getEnter_number_of_slides() {
		return Enter_number_of_slides;
	}
	public void setEnter_number_of_slides(int enter_number_of_slides) {
		Enter_number_of_slides = enter_number_of_slides;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	
	
	
}

class addvideo{
	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getInstr() {
		return Instr;
	}


	public void setInstr(String instr) {
		Instr = instr;
	}
	private String lecturename;
	private String videoname;
	private String time;
	private String Instr;
	
	
	
	public addvideo(String lecturename,String videoname,String time,String Instr) {
		this.lecturename = lecturename;
		this.videoname = videoname;
		this.time = time;
		this.Instr = Instr;
		
	}
	
	
	public String getLecturename() {
		return lecturename;
	}
	public void setLecturename(String lecturename) {
		this.lecturename = lecturename;
	}
	public String getVideoname() {
		return videoname;
	}
	public void setVideoname(String videoname) {
		this.videoname = videoname;
	}
	
	
}



class quiz{
	
	public boolean isPending() {
		return pending;
	}

	public void setPending(boolean pending) {
		this.pending = pending;
	}

	public String getSubmission() {
		return submission;
	}

	public void setSubmission(String submission) {
		this.submission = submission;
	}
	private int id;
	private boolean open;

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
	private String question;
	private boolean pending;
	private String submission;
	private int graded;
	public quiz(String question,boolean pending,String submission,int id,int graded,boolean open){
		this.id = id;
		this.question = question;
		this.pending = pending;
		this.submission = submission;
		this.graded = graded;
		this.open = open;
}
//
//	public boolean isGraded() {
//		return graded;
//	}
//
//	public void setGraded(boolean graded) {
//		this.graded = graded;
//	}

	public int getGraded() {
		return graded;
	}

	public void setGraded(int graded) {
		this.graded = graded;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	
}
class Assignment{
	private boolean open;
	private int id;
	private String problem;
	private int marks;
	private boolean pending;
	private String submission;
	private int graded;
	public Assignment(String problem,int marks,boolean pending,String submission,int id,int graded,boolean open) {
		this.problem = problem;
		this.marks = marks;
		this.pending = pending;
		this.submission = submission;
		this.graded = graded;
		this.open = open;
		
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
//	public boolean isGraded() {
//		return graded;
//	}
//	public void setGraded(boolean graded) {
//		this.graded = graded;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isPending() {
		return pending;
	}
	public void setPending(boolean pending) {
		this.pending = pending;
	}
	public int getGraded() {
		return graded;
	}
	public void setGraded(int graded) {
		this.graded = graded;
	}
	public String getSubmission() {
		return submission;
	}
	public void setSubmission(String submission) {
		this.submission = submission;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}

class Comments implements Interface1{
	private String person;
	private String timing;
	private String matter;
	
	public Comments(String person,String timing,String matter){
		this.person  = person;
		this.timing  = timing;
		this.matter = matter;
		
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}
	public void welcome() {
		System.out.print(   this.matter+" - ");
		System.out.print(this.person);
		System.out.println();
		System.out.println(this.timing);
		System.out.println();
		
	}
	
	
}
class Grading{
	private String person;
	private String submission;
	
	public Grading(String person,String submission) {
		this.person = person;
		this.submission = submission;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getSubmission() {
		return submission;
	}

	public void setSubmission(String submission) {
		this.submission = submission;
	}
	
	
}






