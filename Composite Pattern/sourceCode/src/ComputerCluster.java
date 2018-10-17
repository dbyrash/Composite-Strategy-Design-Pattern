import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ComputerCluster implements LabResource {   //Composite Class used to get the child or resources from LabResource
	
	private String resourceId;				//resourceId for every resource in the Cluster
	 private double finalCost;				//calculate via iterator
	 private double cost; 					
	 private int modelYear;
	 private String clusterId;
	 private String clusterSupervisor;
	 private String status;                //calculate via iterator
	 private int year;
	 
	 List<LabResource> labResources = new ArrayList<LabResource>();  		//initialising the array list of Type(LabResources)
	 
	 public ComputerCluster(String clusterId, String clusterSupervisor, String resourceId){   			//Computer Cluster Constructor 
	  this.clusterId = clusterId;
	  // this.modelYear = modelYear;
	  // this.status = status;
	  this.clusterSupervisor = clusterSupervisor;  
	  this.resourceId = resourceId;
	  System.out.println("Calling Computer Cluster Constructor");   //printing the constructor for clusters
	 }
	   
	 public String getClusterId() { 					// getting the Cluster ID in composite class		 
		 return clusterId;
		 } 
	 
	 public void addResource(LabResource resource) {    			//adding child resources to the cluster
	    labResources.add(resource);
	 }
	 
	 public void removeResource(LabResource resource) { 			//removing the child resources from the cluster
		String  y = resource.getResourceId();
		 labResources.remove(y);
		  setInactive(resourceId);									//when removing a resource setting the resource to inactive
		 }
	  
	 public String getClusterSupervisor() {  						//getting String Cluster Supervisor
	  return clusterSupervisor;
	 }
	 
	 public void showOlderModels(int year) {  						//showing older models
		 Iterator <LabResource> resourceIterator = labResources.iterator();   // iterator on the arrayList
		    while(resourceIterator.hasNext()){
		     LabResource resource = resourceIterator.next(); 
		     if((resource instanceof Printer)||(resource instanceof Workstation))
		     {	
		    	 boolean x = resource.oldModel(year);
		    	 if(x==true) {
		    		 resourceId = resource.getResourceId();
		    		 
		    		 System.out.println("______________________________________________");
		    		 System.out.println("The resources whose model is older than "+ year +" and have Resource ID " +resourceId);
		    	 }
		    	 System.out.println("__________________________________________");
		    	 resource.showOlderModels(year); 
		     }
		     }
		    }
	 
	 
	 public double costOfMaintainance(){   //using the iterator for calculating the cost of the cluster
		 Iterator <LabResource> resourceIterator = labResources.iterator();
		    while(resourceIterator.hasNext()){
		     LabResource resource = resourceIterator.next(); 
		     cost = resource.costOfMaintainance();  //value of cost not iterating 
		     finalCost = cost + finalCost;	 
		    	}
		    return finalCost;
		    }
	 
	 	    
	 public void setInactive(String resourceId){    //using iterator for setting the resource from a cluster to inactive.
		 Iterator <LabResource> resourceIterator = labResources.iterator();
		    while(resourceIterator.hasNext()){
		     LabResource resource = resourceIterator.next();
		     if(resource instanceof Printer || resource instanceof Workstation){
		    	 if(resource.getResourceId().equals(resourceId))
	    		 {
		    		 resource.setInactive();
	    		 }
		     }
		   
		    	 resource.setInactive(resourceId); 
		     
			 }		     	    }    	     	     
	 
	 
	 public void showResourceDetails() {   //method that shows resource details
	  System.out.println("__________");
	  
	  System.out.println("Cluster ID  = "+getClusterId());
	  System.out.println("Supervisor of Clusters = "+getClusterSupervisor());
	 //System.out.println("Year of Model Clusters = "+ modelYear);	
	  System.out.println("Resource ID Cluster ="+resourceId );
	 // System.out.println("Total cost of a cluster"+resource.costOfMaintainance());
	  Iterator <LabResource> resourceIterator = labResources.iterator();
	    while(resourceIterator.hasNext()){
	     LabResource resource = resourceIterator.next();//print cost of LabResource
	     resource.showResourceDetails();
	     System.out.println("__________");//details for both the clusters  
		 

	  }
	 }
	// below are the methods that are not used in the composite class and hence are just called in the this class returning null.
	@Override
	public boolean oldModel(int year) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getResourceId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInactive() {
		// TODO Auto-generated method stub
		
	}  
}
