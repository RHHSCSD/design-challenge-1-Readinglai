/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.*;
/***************************************************
*
*  Program: Tech Fair Cost Calculator
*  Author: Reading Lai
*  Date: 7 March, 2024
*  Description:
****************************************************/

/**************** IPO CHART ************************
*INPUT: 
* Number of students for arduino project
* Number of students for raspberry project
* Number of students for VR project

*PROCESSING:
* Calculate fixed cost
* Calculate variable costs for each project
* Determine if there is a discount for costs
* Total up the costs and divide among students

*OUTPUT:
* Total cost
* Average cost per student 
***************************************************/

/**************** TEST CASES ************************
* Test      Input      Desired Ouput
*  1      10,20,30        66.67
*  2      40,40,40        61.17
*  3        1,3,5         67.22
*  4     100, 20, 1       57.58
*  5        1,1,1         65.0
*
*
***************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // Initiate Scanner
  Scanner keyboard = new Scanner(System.in);
  
  // Assign cost to constants
  final int PER_COST_ARDUINO = 10;
  final int PER_COST_ARDUINO_DISC = 9;
  final int PER_COST_RASPBERRY = 15;
  final int PER_COST_RASPBERRY_DISC = 12;
  final int PER_COST_VR = 20;
  final int PER_COST_STUDENT = 50;
  final double PER_COST_STUDENT_DISC = 47.5;
  
  // Initiate variables
  double costArduino;
  double costRaspberry;
  double costFixed;
  
  // Read number of students for Arduino project
  System.out.print("Enter the number of students doing the Arduino project: ");
  int numArduino = keyboard.nextInt();
          
  // Read number of students for Raspberry project
  System.out.print("Enter the number of students doing the Raspberry project: ");
  int numRaspberry = keyboard.nextInt();

  // Read number of students for VR project
  System.out.print("Enter the number of students doing the VR project: ");
  int numVR = keyboard.nextInt();

  // Calculate cost for Arduino (determine if discounts eligible)
  if (numArduino > 15){
      costArduino = PER_COST_ARDUINO_DISC * numArduino;
  }
  else {
      costArduino = PER_COST_ARDUINO * numArduino;
  }
  
  // Calculate cost for Raspberry (determine if discounts eligible)
  if (numRaspberry > 20){
      costRaspberry = PER_COST_RASPBERRY_DISC * numRaspberry;
  }
  else {
      costRaspberry = PER_COST_RASPBERRY * numRaspberry;
  }
  
  // Calculate cost for VR
  int costVR = PER_COST_VR * numVR;
  
  // Calculate total variable cost
  double costVar = costVR + costArduino + costRaspberry;
  
  // Calculate total number of students
  int numTotal = numVR + numArduino + numRaspberry;

  // Calculate total fixed cost (determine if discounts eligible)
  if (numTotal > 100){
      costFixed = PER_COST_STUDENT_DISC * numTotal;
  }
  else {
      costFixed = PER_COST_STUDENT * numTotal;
  }
  
  // Calculate total cost and average cost
  double costTotal = costFixed + costVar;
  double costAvg = Math.round(costTotal * 100 / numTotal) / 100.0;
  
  
  // Print the average cost
  System.out.println("The average cost would be: $" + costAvg);
  
    }
    
}
