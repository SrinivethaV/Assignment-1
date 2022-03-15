package B;

public class Book_Store_1 {
	
		private final int SIZE;
		private String bookStoreName;
		private Book_Store_1[] books;
		
		public Book_Store_1(String bookStoreName, int size) {
			SIZE=size;
			this.bookStoreName = bookStoreName;
			this.books = new Book_Store_1[SIZE];
			init();
		}
		
		private void init() {
				books[0]=new Book("Coin with con", "RK", "525659F5", 10);
				books[1]=new Book("Learn through knowledge", "KFC", "54595F12", 2);
				books[2]=new Book("Using of languages", "SN", "4545F127", 8);
				books[3]=new Book("head and tail", "Moo", "5F545F12", 17);
				books[4]=new Book("spring season", "VM", "74545F12", 7);
		}



		public void sell(String bookTitle, int noOfCopies) {
			boolean found=false;
			for(int i=0;i<SIZE; i++) {
				if(	books[i].getBookTitle().equals(bookTitle)) {
					
					books[i].setNumOfCopies(books[i].getNumOfCopies()-noOfCopies);
					found=true;
				}
			}
			
			if(found)
				System.out.println("book sell is successful");
			else
				System.out.println("book is not found in store");
		}

		public void order(String bookTitle, int noOfCopies) {
			boolean found=false;
			for(int i=0;i<SIZE; i++) {
				if(	books[i].getBookTitle().equals(bookTitle)) {
					books[i].setNumOfCopies(books[i].getNumOfCopies()+noOfCopies);
					found=true;
				}
			}
			if(found)
				System.out.println("book order is successful");
			else
				System.out.println("book order is not successful");
		}

		public void display() {
			System.out.println("**********Book store *****************");
			System.out.println(bookStoreName);
			System.out.println("^^^^^^^^^^^^^^^Books details^^^^^^^^^^^^^^^^^^^^^^^^^");
			for(Book book: books) {
				book.display();
			}
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			
		}
	}





