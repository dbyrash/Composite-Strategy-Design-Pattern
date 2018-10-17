

public class Workstation implements LabResource {
	private boolean counter;
	private double cost;
	 private String supervisor;
	 private String resourceId;
	 private int modelYear;
	 private String status = "Active";
 
    public Workstation(String supervisor, String resourceId,int modelYear, double cost){ ////Workstation Constructor for passing the values as parameters
    	this.supervisor = supervisor;
		this.cost = cost;
		this.modelYear  = modelYear;
		this.resourceId = resourceId;
		System.out.println("Calling Workstation constructor");
    }
    
    public void addResource(LabResource labresource) {
        //this is leaf node so this method is not applicable to this class.
    }
    
    public void removeResource(LabResource labreosurce) {
        //this is leaf node so this method is not applicable to this class.
    }
    
    public String getResourceId() { //getting the resourceId for Workstation
        return resourceId;
    }
    
    public void setInactive()  		//setting Workstation resource inactive when required
    {
    	status = "Inactive";
    	
    }
    
    public String getSupervisor() {     //getting the Workstation Supervisor
        return supervisor;
    }
    
	    public boolean oldModel(int year){     		//checking if the model is older than the year passed
	    	if(modelYear<year)						//setting the counter to boolean
    	{
    		counter = true;
    
    	}
    	else
    	{
    		counter = false;
    	}
    	return counter;
    }
    
    public double costOfMaintainance() { 				//getting the cost of Printer resource
        return cost;
    }
    
    public void showResourceDetails() {
        System.out.println("_______");
        System.out.println("Resource Id of WorkStation is ="+getResourceId());
        System.out.println("Supervisor of Workstation is  ="+getSupervisor());
        System.out.println("Year of Model of Workstation is = "+modelYear);
        System.out.println("Status of Workstation is : = " +status);
        System.out.println("_______");
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


