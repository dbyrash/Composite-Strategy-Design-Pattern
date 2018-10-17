
public class Printer implements LabResource {
	 private boolean counter;
	 private double cost;
	 private String supervisor;
	 private String resourceId;
	 private int modelYear;
	 private String status = "Active";
 
    public Printer(String supervisor, String resourceId,int modelYear, double cost){ //Printer Constructor for passing the values as parameters
    	this.supervisor = supervisor;
		this.cost = cost;
		this.modelYear  = modelYear;
		this.resourceId = resourceId;
		System.out.println("Calling Printer constructor");//print Printer constructor
    }
    
    public void addResource(LabResource labresource) {		
        //this is leaf node so this method is not applicable to this class.
    }
    
    public void removeResource(LabResource labreosurce) {
        //this is leaf node so this method is not applicable to this class.
    }
    
    public String getResourceId() {	//getting the resourceId for Printer
        return resourceId;
    }
    
    public void setInactive()	//setting Printer resource inactive when required
    {
    	status = "Inactive";
    	
    }
    
    public String getSupervisor() {		//getting the Printer Supervisor
        return supervisor;
    }
    
    public boolean oldModel(int year){		//checking if the model is older than the year passed. 
    										//setting the counter to boolean
    	if(modelYear<year)
    	{
    		counter = true;
    
    	}
    	else
    	{
    		counter = false;
    	}
    	return counter;
    }
    
    public double costOfMaintainance() {		//getting the cost of Printer resource
        return cost;
    }
    
    public void showResourceDetails() {
        System.out.println("-----");
        System.out.println("Resource Id of Printer is ="+getResourceId());
        System.out.println("Supervisor of Printer is  ="+getSupervisor());
        System.out.println("Year of Model of Printer is = "+modelYear);
        System.out.println("Status of Printer is : = " +status);
        System.out.println("-----");
    }

	
	

	//below are the methods that are not used in the child class/node class and hence are just called in the this class returning null.
    @Override
	public void setInactive(String resourceId) {  
		// TODO Auto-generated method stub
		
	}


	@Override
	public void showOlderModels(int year) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getClusterSupervisor() {
		// TODO Auto-generated method stub
		return null;
	} 
}

