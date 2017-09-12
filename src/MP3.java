
public class MP3 extends Item {
	private String lyric; //歌词
	private String singer;//歌手
	private String album; //专辑

	public MP3(String album,String title, int playingTime, String comment , String lyric, String singer) {
		//init 
		//This is the feature-1 modify commit test
		super(title, playingTime, false, comment);
		this.setLyric(lyric);
		this.setSinger(singer);
		this.setAlbum(album);
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("MP3:");
		super.print();
		System.out.println("<<" + album + ">>");
		System.out.print("----" + "singer : " + singer +"----"+ "lyric : " + lyric);
		System.out.println();
	}


	public String getLyric() {
		return lyric;
	}


	public void setLyric(String lyric) {
		this.lyric = lyric;
	}


	public String getSinger() {
		return singer;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}

}
