### design_pattern_assign3

## Composite Pattern

## Introduction
Individual workstations and individual printers are considered LabResources. A number of workstations and printers can be grouped into ComputerClusters, where each ComputerCluster is also considered a LabResource. 

### Features
1. Individual Workstations and Printers have a resourceId (String), modelyear (int), status (active or inactive), supervisor (String) and cost of maintenance per year (double).
2. A ComputerCluster may contain individual workstations, printers and/or other ComputerCluster instances. A ComputeCluster has a resourceId (String), supervisor (String) and cost of maintenance per year (double). Cost of maintenance per year is the total of cost of maintenance of the individual resources in the cluster.
3. Each ComputerCluster will have a ClusterId (string) and a single Supervisor for the entire cluster. When a workstation or printer is added to a cluster, the supervisor of each workstation in that cluster should be set to the cluster supervisor.

## Strategy Pattern

## Introduction
The clients want to use the JobQueue and its public methods. To implement the JobQueue, there are two existing classes ArrayQ and LinkedQ, both implementing the interface Queue. The methods in JobQueue are essentially the same methods (but with different names) in a Queue interface. 


