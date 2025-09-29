package com.mycompany.Q2_MainClass;


  public class Subclass1_PROG6112 extends Subclass2_PROG6112 {

  
  public Subclass1_PROG6112(String batsmanName, String stadiumName, int totalRunsScored) {
  super(batsmanName, stadiumName, totalRunsScored);
  }

  
  @Override
  public void printReport() {
  System.out.println("\nBATSMAN RUNS SCORED REPORT");
  System.out.println("**************************");
  System.out.println("CRICKET PLAYER: " + getBatsman());
  System.out.println("STADIUM: " + getStadium());
  System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
  System.out.println("**************************");
  }
  }
