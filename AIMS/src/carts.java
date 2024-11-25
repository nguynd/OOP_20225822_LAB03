
public class carts {
	 public static final int MAX_NUMBERS_ORDERED = 20;
	    private DVD itemsOrdered[] = new DVD[MAX_NUMBERS_ORDERED];
	    public int qtyOrdered = 0; 
	    
	    public void addDVD(DVD disc) {
	    	if(qtyOrdered < MAX_NUMBERS_ORDERED) 
	    	{
	    		itemsOrdered[qtyOrdered] = disc;
	    		qtyOrdered++;
	    		System.out.println("The disc \"" + disc.getTitle()+ "\" has been added." );
	    	}
	    	else { 
	    		System.out.println("The cart is full.");
	    		 }
	    } 
	    public void addDVD(DVD [] dvdList) {
	    	
	    	  if (dvdList.length > MAX_NUMBERS_ORDERED) {
	              System.out.println("The cart is almost full!");
	          } else {
	              for (int i = 0; i < dvdList.length; i++) {
	                  itemsOrdered[qtyOrdered] = dvdList[i];
	                  System.out.println(dvdList[i].getTitle() + " has been added!");
	                  qtyOrdered +=1 ;
	              }
	      
	          }
	    }
	    public void addDVD(DVD dvd1, DVD dvd2) {
	    	DVD [] dvdList = {dvd1,dvd2};
	    	addDVD(dvdList);
	    }
	    public void removeDVD(DVD disc) {
	    	for(int i=0;i< qtyOrdered;i++) {
	    		if(itemsOrdered[i] ==disc) {
	    			for(int j = i;j< qtyOrdered - 1; j++) {
	    				itemsOrdered[j]=itemsOrdered[j+1];
	    			}
	    	itemsOrdered[qtyOrdered] = null;
	    	qtyOrdered--;
	    	System.out.println("The disc \""+disc.getTitle()+"\" has been removed");
	    		}
	    	}
	    	System.out.println("The disc \"" + disc.getTitle() + "\" not found in cart.");
	    }
	    public float totalCost() {
	    	float total=0;
	    	for(int i=0;i<qtyOrdered;i++)
	    	{	total=total+itemsOrdered[i].getCost();}
	    	return total;
	    }
	    
	    public void print() {
	    	System.out.println("***********************CART***********************");
	    	System.out.println("Ordered Items:");
	    	for(int i=0;i< qtyOrdered; i++) {
	    		System.out.println(itemsOrdered[i]);
	    	}
	    	System.out.println("Total cost:" + totalCost());
	    	System.out.println("***************************************************");
	    }
	    
}
