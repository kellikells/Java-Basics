import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class Project {

    // member variables // instance variables // attributes // fields
    public String name;
    public String description;
    public double initialCost;


    // constructor
    public Project() {}
    public Project(String name) { this.name = name; }
    public Project(String name, String description) { this.name = name; this.description = description; }

    // getters
    public String getName() { return this.name; }
    public String getDescription() { return this.description; }
    public double getInitialCost() { return this.initialCost; }


    // setters
    public void setName(String n) { this.name = n; }
    public void setDescription(String d) { this.description = d; }
    public void setInitialCost(double cost) { this.initialCost = cost; }

    // instance method
    public String elevatorPitch() {
        // System.out.println(this.name + " (" + this.initialCost +") : " + this.description) ;
        return (this.name + " (" + this.initialCost +") : " + this.description) ;

    }


}

// public class Portfolio {
//     public ArrayList addProjects(String[] array) {

//         ArrayList<String> project = new ArrayList<String>();
//     }

//     // field of ArrayList of Object: projects
//     public ArrayList<String> projects = new ArrayList<String>();



// }



// Add the appropriate getters/setters/constructors for this class to work

// Add the getPortfolioCost method that calculates and returns the cost to buy the entire portfolio.

// Add the showPortfolio method that will print all the project elevator pitches, followed by the total cost.