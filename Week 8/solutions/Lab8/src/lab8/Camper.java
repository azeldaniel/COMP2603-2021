/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author azeldaniel
 */
public class Camper {
    private String firstName;
    private String lastName;
    private String campType;
    private String ageGroup;
    private java.util.ArrayList<String> activities;
    private java.util.ArrayList<String> mentors;
    
    public Camper(String fName, String lName, String cType){
        firstName = fName;
        lastName = lName;
        campType = cType;
        activities = new java.util.ArrayList<String>();
        mentors = new java.util.ArrayList<String>();
    }
    public void setAgeGroup(String ageGp){
        ageGroup = ageGp;
}
    public void setActivities(java.util.List<String> acts){
        if(acts != null)
         activities = new java.util.ArrayList<String>(acts);
    }
    public void setMentors(java.util.List<String> ments){
    if(ments != null)
         mentors = new java.util.ArrayList<String>(ments);
    }
    
    public String toString(){
     String s= "";
     s+= firstName + " " + lastName + " " + campType + " " + ageGroup + "\n";
     s+= "Activities: " + activities.toString() + "\n";
     s+= "Mentors: " + mentors.toString() + "\n";
     return s;
} }
