import java.util.ArrayList;
import java.util.List;

public class Store {
	
		private List<DVD> itemsInStore = new ArrayList<DVD>();
		
		public void addDVD(DVD dvd) {
			itemsInStore.add(dvd);
			System.out.println(dvd.getTitle()+" has been added to the store.");
		}
		
		public void removeDVD(DVD dvd) {
			boolean removed = itemsInStore.remove(dvd);
			if(removed) {
				System.out.println(dvd.getTitle() + " has been removed.");
			}
			else
			{
				System.out.println(dvd.getTitle()+" is not found");
			}
		}
		
		public void print() {
			for(int i=0;i<itemsInStore.size();i++) {
				System.out.println(i+1+". "+itemsInStore.get(i));
			}
		}
}
