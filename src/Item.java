
public class Item {
	private String title;
	private int playingTime;
	private boolean gotIt = false;
	private String comment;
 
	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.setPlayingTime(playingTime);
		this.setGotIt(gotIt);
		this.setComment(comment);
	}

	
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(title);
	}
	
	public int getPlayingTime() {
		return playingTime;
	}
	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public boolean isGotIt() {
		return gotIt;
	}
	public void setGotIt(boolean gotIt) {
		this.gotIt = gotIt;
	}

	
}
