
public interface LabResource {							// A common interface for all employee
											
	
	public boolean oldModel(int year); 					//return type is boolean in this method
	public String getResourceId();						//return type is String in this method
	public void setInactive();							//return type is void, simply sets the resource inactive in this method
	public void setInactive(String resourceId);			//return type is void, parameter passed is of Type String in this method
	public double costOfMaintainance();					//return type is void in this method
	public String getClusterSupervisor();				//return type is String	in this method
	public void addResource(LabResource labresource);	//parameters of type LabResource in this method
	public void removeResource(LabResource labresource);	//parameters of type LabResource in this method
	public void showOlderModels(int year);					//parameters passed of Type int and return type is void in this method
	public void showResourceDetails();						//return type is void with no parameters in this method
	
}
