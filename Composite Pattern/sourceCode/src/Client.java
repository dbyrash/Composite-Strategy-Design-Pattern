
public class Client {
		
		
	public static void main(String[] args) {
		
		LabResource workstation1 = new Workstation(" ALAN ", " WS1 ", 1999, 1200);
		LabResource workstation2 =new Workstation(" RICK ", " WS2 ", 2017, 1800);	//pass the values as parameters to the constructor of Workstation via instantiation
		LabResource printer1 =new Printer(" CARL ", " PR1 ",2001, 650.90);			//pass the values as parameters to the constructor of Printer via instantiation
		LabResource printer2 = new Printer(" ED ", " PR2 ", 2004, 550.308);
		
		
		ComputerCluster compclusterA = new ComputerCluster(" CCA ", " Perpendicular ", " CC1 ");
		ComputerCluster compclusterB = new ComputerCluster(" CCB ", "Horizontal", " CC2 ");
		compclusterA.addResource(workstation1);
		compclusterA.addResource(workstation2);
		compclusterA.addResource(printer1);
		compclusterB.addResource(printer2);
		compclusterB.addResource(compclusterA); 		//clusterB consists of clusterA and one other printer2.
		
	//	compclusterA.costOfMaintainance();
		System.out.println(compclusterB.costOfMaintainance());
		compclusterA.showOlderModels(2005);
		compclusterA.showOlderModels(2007);
		//compclusterA.setInactive("WS1");
		compclusterB.setInactive(""); //setting resources of ClusterB as inactive
		compclusterB.setInactive("PR2");
		//printer2.setInactive();
		workstation2.setInactive();  										//setting the workstation2 inactive
		printer2.setInactive(); 											//setting the printer2 inactive
		compclusterB.removeResource(printer2);
	//compclusterA.showResourceDetails();
		compclusterB.showResourceDetails();
	}

}
