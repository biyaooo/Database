
public class DVD extends Item{

// This is the feature-2 commit and the tagName TEST.
// This is a DVD CLASS
	private String director;

	public DVD(String title, String director, int playingTime, String comment) {
		super(title,playingTime,false,comment);
		this.director = director;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("DVD:"); 
		super.print();
		System.out.print("---" + director + "----");
		System.out.println();
	}
}
