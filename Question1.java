package assignment_4_ADITYA_SINGH_2020169;

import java.util.*;

public class Question1 {
	
	static ArrayList<books> library = new ArrayList<books>();
	static ArrayList<booksinracks> sorted = new ArrayList<booksinracks>();
	
	
	public static class booksinracks{
		books bks;
		int racks;
		int place;
		public booksinracks(books bks, int racks, int place) {
			
			this.bks = bks;
			this.racks = racks;
			this.place = place;
		}
		public books getBks() {
			return bks;
		}
		public void setBks(books bks) {
			this.bks = bks;
		}
		public int getRacks() {
			return racks;
		}
		public void setRacks(int racks) {
			this.racks = racks;
		}
		public int getPlace() {
			return place;
		}
		public void setPlace(int place) {
			this.place = place;
		}
		
		
		
		
	}
	
	public static class books implements Comparable<books>{
		String title;
		int isbn;
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getIsbn() {
			return isbn;
		}

		public void setIsbn(int isbn) {
			this.isbn = isbn;
		}

		public int getBarcodes() {
			return barcodes;
		}

		public void setBarcodes(int barcodes) {
			this.barcodes = barcodes;
		}


		int barcodes;
		
		books(String title,int isbn,int barcodes){
			this.title = title;
			this.isbn = isbn;
			this.barcodes = barcodes;
			
			
		}
		
		@Override
		public String toString() {
			return "books [title=" + title + ", isbn=" + isbn + ", barcodes=" + barcodes + "]";
		}
		
		@Override
		public int compareTo(books b) {
			if(!(this.title.equals(b.title))) {
				return this.title.compareTo(b.title);
				
			}else if(this.isbn != b.isbn) {
				return  this.isbn-b.isbn;
				
			}else {
				return this.barcodes-b.barcodes; 
			}
			
		}
		
		
	}
	
	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("No of Books(N) :");
		int n = scn.nextInt();
		System.out.println("No of Racks(k) :");
		int k = scn.nextInt();
		System.out.println("ENTER THE BOOKS: ");
		System.out.println("----------------------------------");
		int x=0;
		while(x<n) {
				
		
		
			
			System.out.println("Enter book Title:");
			String title = string();
			
			
			System.out.println("Enter book ISBN:");
			int isbn = scn.nextInt();
			
			System.out.println("Enter book Barcode:");
			int barcode = scn.nextInt();
			
			books bks = new books(title,isbn,barcode);
			library.add(bks);
			
			x++;


		
		
		}
		while(true) {
			Collections.sort(library);
			int count=0;
			int div = n/k;
			for(books i:library) {
				booksinracks b = new booksinracks(i,(count/div) +1,count%div);
				sorted.add(b);
				count++;
			}
			
			System.out.println("1. Find the book Rack and Place");
			System.out.println("2. Log-Out");
			System.out.println();
			System.out.println("CHOOSE:");
			int key = scn.nextInt();
			if(key==1) {
				System.out.println("Enter the books name which slot you want to find:");
			   String strng = string();
				for(booksinracks i:sorted) {
				if((i.getBks().getTitle()).equals(strng)) {
						System.out.println("Title :"+i.getBks().getTitle());
						System.out.println("Racks :"+i.getRacks());
						System.out.println("Place :"+i.getPlace());
						break;
								
						
						
					}
				}
				
				
				
			}else {
				break;
			}
			
			
			
			
		}

		
		

	}
	public static String string() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine().strip();
	}

}
