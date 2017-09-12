import java.util.ArrayList;

public class Database {
	private ArrayList<Item> listItem = new ArrayList<Item>();
	
	public void add(Item item)
	{
		listItem.add(item);
	}
	
	public void list()
	{
		for(Item item : listItem)
		{
			item.print();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new CD("abc","poiwe",4,60,"....."));
		db.add(new CD("def","grnis",4,60,"....."));
		db.add(new DVD("xxx","aaa",60,"....."));
		db.add(new MP3("Crazy Cat","Rst",60,"...","This is a song!","Mike"));
		db.list();
	}

}
